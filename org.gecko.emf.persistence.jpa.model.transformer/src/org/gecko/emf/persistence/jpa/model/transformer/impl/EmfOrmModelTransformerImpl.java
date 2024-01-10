package org.gecko.emf.persistence.jpa.model.transformer.impl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.persistence.jpa.model.orm.EntityMappingsType;
import org.gecko.emf.persistence.jpa.model.transformer.api.EmfOrmModelTransformer;
import org.osgi.service.component.annotations.Reference;

public class EmfOrmModelTransformerImpl implements EmfOrmModelTransformer {

	
	@Reference(target="(emf.model.name=orm)")
	private ResourceSet resourceSet;
	
	@Override
	public EntityMappingsType transform(
			org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType entityMappingsType) {
	Resource res=	resourceSet.createResource(null);
		
		 final EPackage p = (EPackage) res.getContents().get(0);

		
		return null;
	}

}
