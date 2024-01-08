/*
 * Copyright (c) 2012 - 2022
 */
package org.gecko.emf.persistence.jpa.model.emfmapping.configuration;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.gecko.emf.osgi.EPackageConfigurator;

import org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingFactory;
import org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingPackage;

import org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl;

import org.osgi.annotation.bundle.Capability;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import org.osgi.service.condition.Condition;

/**
 * The <b>PackageConfiguration</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * 
 * @generated
 */
@Component(name = "EmfmappingConfigurator",
 	reference = @Reference( name = "ResourceSetFactory", service = org.gecko.emf.osgi.ResourceSetFactory.class, cardinality = ReferenceCardinality.MANDATORY)
 )
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=org.eclipse.emf.ecore,org.gecko.emf.persistence.jpa.model.emfmapping" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=org.eclipse.emf.ecore,org.gecko.emf.persistence.jpa.model.emfmapping" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.gecko.emf.osgi.EPackageConfigurator\"" , "uses:=org.eclipse.emf.ecore,org.gecko.emf.persistence.jpa.model.emfmapping" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class EmfmappingConfigurationComponent {
	
	private ServiceRegistration<?> packageRegistration = null;
	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;
	private ServiceRegistration<?> conditionRegistration = null;

	/**
	 * Activates the Configuration Component.
	 *
	 * @generated
	 */
	@Activate
	public void activate(BundleContext ctx) {
		EmfmappingPackage ePackage = EmfmappingPackageImpl.eINSTANCE;
		
		EmfmappingEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * Registers the EmfmappingEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private EmfmappingEPackageConfigurator registerEPackageConfiguratorService(EmfmappingPackage ePackage, BundleContext ctx){
		EmfmappingEPackageConfigurator packageConfigurator = new EmfmappingEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the EmfmappingPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(EmfmappingPackage ePackage, EmfmappingEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {EmfmappingPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the EmfmappingFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(EmfmappingPackage ePackage, EmfmappingEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {EmfmappingFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getEmfmappingFactory(), properties);
	}

	private void registerConditionService(EmfmappingEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, EmfmappingPackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisters everything.
	 *
	 * @generated
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();
		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(EmfmappingPackage.eNS_URI);
	}
}
