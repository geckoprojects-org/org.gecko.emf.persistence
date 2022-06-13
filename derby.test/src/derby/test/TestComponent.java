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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.example.model.basic.BasicFactory;
import org.gecko.emf.osgi.example.model.basic.Person;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * 
 * @author mark
 * @since 18.05.2022
 */
@Component
public class TestComponent {
	
	@Reference(target = "(&(emf.configurator.name=emf.persistence.jdbc)(emf.model.name=basic))")
	private ResourceSet resourceSet;
	
	@Activate
	public void activate() {
		Person p = BasicFactory.eINSTANCE.createPerson();
		p.setFirstName("Emil");
		p.setLastName("Tester");
		p.setId("etester");
		System.out.println("Person p " + p.toString());
		Resource saveResource = resourceSet.createResource(URI.createURI("jdbc://Derby_Test/testdb/Person/" + p.getId()));
		System.out.println("Resource r " + saveResource);
		saveResource.getContents().add(p);
//		try {
//			Map<String, Object> saveOptions = new HashMap<String, Object>();
//			saveOptions.put("type", "derby");
//			saveResource.save(saveOptions);
//			System.out.println("Resource r saved " + saveResource);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Resource loadResource = resourceSet.createResource(URI.createURI("jdbc://Derby_Test/testdb/Person/"));
		Map<String, Object> loadOptions = new HashMap<String, Object>();
		loadOptions.put("type", "derby");
		try {
			loadResource.load(loadOptions);
			for (EObject eo : loadResource.getContents()) {
				System.out.println("Loaded: " + eo.toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
