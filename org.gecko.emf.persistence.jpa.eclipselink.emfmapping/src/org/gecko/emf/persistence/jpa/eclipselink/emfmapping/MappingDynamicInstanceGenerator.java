package org.gecko.emf.persistence.jpa.eclipselink.emfmapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.persistence.dynamic.DynamicClassLoader;
import org.gecko.emf.persistence.jpa.model.emfmapping.Entity;
import org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType;

public class MappingDynamicInstanceGenerator {
	private EntityMappingsType emt;
	private DynamicClassLoader dcl;

	MappingDynamicInstanceGenerator(DynamicClassLoader dcl,EntityMappingsType emt) {
		this.dcl = dcl;
		this.emt = emt;
	}

	List<EmfDynamicEntity> generate(EPackage ePackage) {

		List<EmfDynamicEntity> list = new ArrayList<EmfDynamicEntity>();
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			EmfDynamicEntity ede = generate(eClassifier);
			list.add(ede);
		}
		return list;
	}

	EmfDynamicEntity generate(EClassifier eClassifier) {
		EmfDynamicEntity e = new EmfDynamicEntity(eClassifier, getMappingEntity(eClassifier),dcl);
		return e;
	}

	private Optional<Entity> getMappingEntity(EClassifier eClassifier) {
		Optional<Entity> oEntity = emt.getEntity().stream().filter(eClassifier::equals).findFirst();
		return oEntity;
	}

}
