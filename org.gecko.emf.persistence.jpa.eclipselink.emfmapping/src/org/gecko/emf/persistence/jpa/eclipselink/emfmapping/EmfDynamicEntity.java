package org.gecko.emf.persistence.jpa.eclipselink.emfmapping;

import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.persistence.dynamic.DynamicClassLoader;
import org.eclipse.persistence.dynamic.DynamicType;
import org.eclipse.persistence.jpa.dynamic.JPADynamicTypeBuilder;
import org.gecko.emf.persistence.jpa.model.emfmapping.Entity;

public class EmfDynamicEntity {

	private EClassifier eClassifier;
	private Optional<Entity> mappingEntity;
	private DynamicClassLoader dcl;

	public EmfDynamicEntity(EClassifier eClassifier, Optional<Entity> mappingEntity, DynamicClassLoader dcl) {
		this.eClassifier = eClassifier;
		this.mappingEntity = mappingEntity;
		this.dcl = dcl;

	}

	public DynamicType calcDynamicType() {
		if (eClassifier instanceof EClass) {

			EClass eClass = (EClass) eClassifier;
			String fqClassName = eClass.getEPackage().getName() + "." + eClass.getName();

			Class<?> dynamicClass = dcl.createDynamicClass(fqClassName);

			JPADynamicTypeBuilder dynamicTypeBuilder = new JPADynamicTypeBuilder(dynamicClass, null, eClass.getName());

			for (EAttribute eAttribute : eClass.getEAttributes()) {
				String colName = eAttribute.getName().toUpperCase();
				System.out.println(eAttribute);
				dynamicTypeBuilder.addDirectMapping(eAttribute.getName(), Util.convType(eAttribute), colName);

				if (eAttribute.isID()) {
					dynamicTypeBuilder.setPrimaryKeyFields(colName);
					dynamicTypeBuilder.configureSequencing("SEQ_" + eClass.getName(), colName);
				}
			}
			return dynamicTypeBuilder.getType();

		}
		return null;

	}

}
