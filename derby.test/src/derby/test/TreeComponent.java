/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package derby.test;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.persistence.helper.PersistenceHelper;
import org.gecko.emf.persistence.helper.PersistenceHelper.EMFPersistenceContext;
import org.gecko.emf.persistence.pushstreams.PushStreamConstants;
import org.gecko.emf.pushstream.EPushStreamProvider;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.QueuePolicyOption;

import de.jena.mdo.model.dbtree.DbtreePackage;

/**
 * 
 * @author mark
 * @since 18.05.2022
 */
@Component
public class TreeComponent {
	
	@Reference(target = "(&(emf.configurator.name=emf.persistence.jdbc.derbytree)(emf.model.name=dbtree))")
	private ResourceSet resourceSet;
	private String treeBaseUri = "jdbc://Derby_Tree/derbytree";
	
	@Activate
	public void activate(BundleContext bctx) {
//		this.bctx = bctx;
		EMFPersistenceContext context = PersistenceHelper.createPersistenceContext(treeBaseUri, DbtreePackage.Literals.DB_TREE, null);
		
		Resource loadTreeResource = resourceSet.createResource(context.getUri());
		
		Map<String, Object> loadOptions = context.getOptions();
		loadOptions.put("type", "derby");
		/*
		 * We expect some data and wanna use PushStreams instead of having all the object in the content list
		 */
		loadOptions.put(PushStreamConstants.OPTION_QUERY_PUSHSTREAM, Boolean.TRUE);
		loadOptions.put(PushStreamConstants.OPTION_QUERY_PUSHSTREAM_MULTITHREAD, Boolean.TRUE);
		try {
			long start = System.currentTimeMillis();
			AtomicLong time = new AtomicLong();
			loadTreeResource.load(loadOptions);
			ArrayBlockingQueue<PushEvent<? extends EObject>> queue = new ArrayBlockingQueue<PushEvent<? extends EObject>>(1000);
			for (EObject eo : loadTreeResource.getContents()) {
				System.out.println("Loading trees ...");
				if (eo instanceof EPushStreamProvider) {
					EPushStreamProvider epsp = (EPushStreamProvider) eo;
					AtomicInteger count = new AtomicInteger();
					epsp.createPushStreamBuilder().withPushbackPolicy( GeckoPushbackPolicyOption.LINEAR_AFTER_THRESHOLD.getPolicy(850))
					.withQueuePolicy(QueuePolicyOption.BLOCK)
//					.withExecutor(Executors.newFixedThreadPool(4))
//					.withParallelism(4)
					.withBuffer(queue).build().onClose(()->{
						System.out.println("Loading trees: " + count.get() + " (" + (time.get() - start) + "ms) finished " +  Thread.currentThread().getName());
					}).forEach((e)->{
						count.incrementAndGet();
						time.set(System.currentTimeMillis());
//						System.out.println(count.incrementAndGet() + "(" + (time.get() - start) + "ms + " + queue.size() + ") PSP Loaded: " + e.toString());
					});
				}
			}
			time.compareAndSet(0, System.currentTimeMillis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
