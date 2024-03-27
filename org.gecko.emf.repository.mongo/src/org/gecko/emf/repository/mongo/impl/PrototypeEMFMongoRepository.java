/**
 * Copyright (c) 2014 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.gecko.emf.repository.mongo.impl;

import static org.gecko.emf.repository.mongo.api.EMFMongoConfiguratorConstants.PROTOTYPE_REPOSITORY_CONFIGURATION_NAME;

import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * EMF repository to store emf objects into a mongo database.
 * @author Mark Hoffmann
 * @since 12.04.2015
 */
@Component(
		name=PROTOTYPE_REPOSITORY_CONFIGURATION_NAME, 
		service= {EMFRepository.class, QueryRepository.class}, 
		configurationPid=PROTOTYPE_REPOSITORY_CONFIGURATION_NAME, 
		configurationPolicy=ConfigurationPolicy.REQUIRE, 
		scope = ServiceScope.PROTOTYPE,
		property= {"persistence=mongo"}
		)
public class PrototypeEMFMongoRepository extends AbstractEMFMongoRepository{

}