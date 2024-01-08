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
package org.gecko.emf.persistence.jpa.model.emfmapping.tests;

import java.sql.SQLException;
import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Reference;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
@ExtendWith(MockitoExtension.class)
public class OrmFileCreatorTest {

	@BeforeEach
	void beforeEach(@InjectBundleContext BundleContext ctx) {

	
	}

	private static void registerEPackage(BundleContext bc, String url) {
		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());

		URI fileURI = org.eclipse.emf.common.util.URI.createURI(url);

		Resource resource = resourceSet.getResource(fileURI, true);
		EObject eObject = resource.getContents().get(0);
		if (eObject instanceof EPackage) {
			EPackage p = (EPackage) eObject;

			Dictionary<String, Object> dict = new Hashtable<String, Object>();
			dict.put("emf.model.name", p.getName());
			bc.registerService(EPackage.class, p, dict);

		}
	}
	
	@Reference(target="(emf.model.name=basic)")
	private ResourceSet resourceSet;

	@Test
	public void testModelBasicWithoutMapper(@InjectBundleContext BundleContext bc,
			@InjectService(cardinality = 0) ServiceAware<ResourceSet> resourceSet)
			throws SQLException, InterruptedException {

		registerEPackage(bc, "ecore/simple.ecore");
	

	}



}
