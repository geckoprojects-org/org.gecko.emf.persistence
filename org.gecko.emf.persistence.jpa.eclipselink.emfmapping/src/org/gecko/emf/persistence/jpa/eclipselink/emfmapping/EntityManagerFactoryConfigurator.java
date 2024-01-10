package org.gecko.emf.persistence.jpa.eclipselink.emfmapping;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.dynamic.DynamicClassLoader;
import org.eclipse.persistence.dynamic.DynamicType;
import org.eclipse.persistence.jpa.dynamic.JPADynamicHelper;
import org.eclipse.persistence.tools.schemaframework.SchemaManager;
import org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.spi.PersistenceProvider;

@Designate(factory = true, ocd = EntityManagerFactoryConfigurator.Config.class)
@Component(configurationPid = { EntityManagerFactoryConfigurator.PID })
public class EntityManagerFactoryConfigurator {

	public static final String PID = "org.gecko.emf.persistence.jpa.eclipselink.emfmapping.EntityManagerFactoryConfigurator";

	@ObjectClassDefinition
	@interface Config {

		@AttributeDefinition()
		String mappingFile();
	}

	@Reference
	DataSource dataSource;

	@Reference
	private EPackage ePackage;

	@Reference(target = "(emf.model.name=emfmapping)")
	private ResourceSet rsMapping;

	private List<DynamicType> dynamicTypes;

	@Activate
	void activate(BundleContext bCtx, EntityManagerFactoryConfigurator.Config config) throws IOException {

		DynamicClassLoader dcl = new DynamicClassLoader(DynamicClassLoader.class.getClassLoader()) {

			@Override
			public URL getResource(String name) {
				return super.getResource(name);
			}

			@Override
			public InputStream getResourceAsStream(String name) {

				return super.getResourceAsStream(name);
			}

			@Override
			public Enumeration<URL> getResources(String name) throws IOException {

				if ("META-INF/persistence.xml".equals(name)) {
					return bCtx.getBundle().getResources(name);
				}
				return super.getResources(name);

			}
		};

		Resource res = rsMapping.createResource(URI.createFileURI(config.mappingFile()));
		res.load(Map.of());
		
		EntityMappingsType emt = (EntityMappingsType) res.getContents().get(0);

		System.out.println(emt.getEntity().get(0).getClass_());

		MappingDynamicInstanceGenerator dih = new MappingDynamicInstanceGenerator(dcl, emt);

		List<EmfDynamicEntity> list = dih.generate(ePackage);
		dynamicTypes = list.stream().map(EmfDynamicEntity::calcDynamicType).collect(Collectors.toList());

		PersistenceProvider persistenceProvider = new org.eclipse.persistence.jpa.PersistenceProvider();

		URL url = bCtx.getBundle().getEntry("META-INF/persistence.xml");

		System.out.println(url);
		HashMap<String, Object> map = new HashMap<>();
		map.put(PersistenceUnitProperties.CLASSLOADER, dcl);
		map.put(PersistenceUnitProperties.WEAVING, "static");
		map.put(PersistenceUnitProperties.NON_JTA_DATASOURCE, dataSource);
		map.put("eclipselink.target-database", "Derby");
		map.put("eclipselink.logging.level", "FINE");
		map.put("eclipselink.logging.timestamp", "false");
		map.put("eclipselink.logging.thread", "false");
		map.put("eclipselink.logging.exceptions", "true");
		map.put("eclipselink.orm.throw.exceptions", "true");
		map.put("eclipselink.jdbc.read-connections.min", "1");
		map.put("eclipselink.jdbc.write-connections.min", "1");
		map.put("eclipselink.ddl-generation", "drop-and-create-tables");
		
		map.put("eclipselink.cache.shared.default" ,"false");
//		map.put("eclipselink.ddl-generation.output-mode", "both");

		DynamicPersistenceUnitInfo pui = new DynamicPersistenceUnitInfo("DynamicTest", url, map);
		EntityManagerFactory emf = persistenceProvider.createContainerEntityManagerFactory(pui, map);

		JPADynamicHelper helper = new JPADynamicHelper(emf);
		DynamicType[] types = dynamicTypes.stream().toArray(DynamicType[]::new);
		helper.addTypes(true, true, types);

		SchemaManager schemaManager = new SchemaManager(helper.getSession());
		schemaManager.outputCreateDDLToWriter(new PrintWriter(System.out));
		schemaManager.outputCreateDDLToWriter(new PrintWriter(System.out));
		schemaManager.outputDropDDLToWriter(new PrintWriter(System.out));
		schemaManager.replaceDefaultTables();
		schemaManager.setCreateSQLFiles(true);

		bCtx.registerService(EntityManagerFactory.class, emf, new Hashtable<String, Object>());

	}

}
