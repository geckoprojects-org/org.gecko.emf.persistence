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
package org.gecko.emf.repository.file;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.osgi.ResourceSetFactory;
import org.gecko.emf.persistence.helper.PersistenceHelper;
import org.gecko.emf.repository.DefaultEMFRepository;
import org.gecko.emf.repository.EMFReadRepository;
import org.gecko.emf.repository.EMFWriteRepository;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

/**
 * EMF persistence repository using file persistence
 * @author Mark Hoffmann
 * @since 12.04.2015
 */
@Component(
		name="EMFFileRepository", 
		service= {EMFReadRepository.class, EMFWriteRepository.class}, 
		configurationPolicy=ConfigurationPolicy.REQUIRE, 
		property= {"persistence=file"})
public class SingletonEMFFileRepository extends DefaultEMFRepository {
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.repository.DefaultEMFRepository#activate(java.util.Map)
	 */
	@Override
	@Activate
	public void activate(Map<String, ?> properties) {
		super.activate(properties);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.repository.DefaultEMFRepository#deactivate()
	 */
	@Override
	@Deactivate
	public void deactivate() {
		super.deactivate();
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.repository.DefaultEMFRepository#setResourceSetFactory(org.gecko.emf.osgi.ResourceSetFactory)
	 */
	@Override
	@Reference(name="ResourceSetFactory", cardinality=ReferenceCardinality.MANDATORY, policy=ReferencePolicy.STATIC, unbind="unsetResourceSetFactory")
	public void setResourceSetFactory(ResourceSetFactory resourceSetFactory) {
		super.setResourceSetFactory(resourceSetFactory);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.repository.DefaultEMFRepository#setIDs(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected void setIDs(EObject rootObject) {
		PersistenceHelper.setIds(rootObject);	
	}
  
}
