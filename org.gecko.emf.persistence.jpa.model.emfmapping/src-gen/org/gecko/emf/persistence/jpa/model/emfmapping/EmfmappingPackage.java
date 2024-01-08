/*
 * Copyright (c) 2012 - 2022
 */
package org.gecko.emf.persistence.jpa.model.emfmapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 
 *        This is the XML Schema for the persistence object/relational 
 *        mapping file.
 *        The file may be named "META-INF/orm.xml" in the persistence 
 *        archive or it may be named some other name which would be 
 *        used to locate the file as resource on the classpath.
 * 
 *        Object/relational mapping files must indicate the object/relational
 *        mapping file schema by using the persistence namespace:
 * 
 *        https://jakarta.ee/xml/ns/persistence/orm
 * 
 *        and indicate the version of the schema by
 *        using the version element as shown below:
 * 
 *       <entity-mappings xmlns="https://jakarta.ee/xml/ns/persistence/orm"
 *         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 *         xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence/orm
 *           https://jakarta.ee/xml/ns/persistence/orm/orm_3_1.xsd"
 *         version="3.1">
 *           ...
 *       </entity-mappings>
 * 
 * 
 *      
 * <!-- end-model-doc -->
 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmfmappingFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
public interface EmfmappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emfmapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gecko.org/persistence/jpa/emfmapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emfmapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfmappingPackage eINSTANCE = org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AssociationOverrideImpl <em>Association Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.AssociationOverrideImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getAssociationOverride()
	 * @generated
	 */
	int ASSOCIATION_OVERRIDE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__JOIN_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__FOREIGN_KEY = 2;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__JOIN_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Association Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Association Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OVERRIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributeOverrideImpl <em>Attribute Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributeOverrideImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getAttributeOverride()
	 * @generated
	 */
	int ATTRIBUTE_OVERRIDE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Attribute Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OVERRIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.AttributesImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ID = 1;

	/**
	 * The feature id for the '<em><b>Embedded Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EMBEDDED_ID = 2;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__BASIC = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__MANY_TO_ONE = 5;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ONE_TO_MANY = 6;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ONE_TO_ONE = 7;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__MANY_TO_MANY = 8;

	/**
	 * The feature id for the '<em><b>Element Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ELEMENT_COLLECTION = 9;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EMBEDDED = 10;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__TRANSIENT = 11;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl <em>Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.BasicImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getBasic()
	 * @generated
	 */
	int BASIC = 3;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__LOB = 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__TEMPORAL = 2;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__ENUMERATED = 3;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__CONVERT = 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__FETCH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__NAME = 7;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__OPTIONAL = 8;

	/**
	 * The number of structural features of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.CascadeTypeImpl <em>Cascade Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.CascadeTypeImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getCascadeType()
	 * @generated
	 */
	int CASCADE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Cascade All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_ALL = 0;

	/**
	 * The feature id for the '<em><b>Cascade Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_PERSIST = 1;

	/**
	 * The feature id for the '<em><b>Cascade Merge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_MERGE = 2;

	/**
	 * The feature id for the '<em><b>Cascade Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_REMOVE = 3;

	/**
	 * The feature id for the '<em><b>Cascade Refresh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_REFRESH = 4;

	/**
	 * The feature id for the '<em><b>Cascade Detach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE__CASCADE_DETACH = 5;

	/**
	 * The number of structural features of the '<em>Cascade Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Cascade Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASCADE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.CollectionTableImpl <em>Collection Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.CollectionTableImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getCollectionTable()
	 * @generated
	 */
	int COLLECTION_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__UNIQUE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__INDEX = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE__SCHEMA = 6;

	/**
	 * The number of structural features of the '<em>Collection Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Collection Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.ColumnImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__INSERTABLE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NULLABLE = 4;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PRECISION = 5;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SCALE = 6;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = 7;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UNIQUE = 8;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__UPDATABLE = 9;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.ColumnResultImpl <em>Column Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.ColumnResultImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getColumnResult()
	 * @generated
	 */
	int COLUMN_RESULT = 7;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Column Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.ConstructorResultImpl <em>Constructor Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.ConstructorResultImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getConstructorResult()
	 * @generated
	 */
	int CONSTRUCTOR_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_RESULT__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_RESULT__TARGET_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Constructor Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constructor Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.ConvertImpl <em>Convert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.ConvertImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getConvert()
	 * @generated
	 */
	int CONVERT = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__ATTRIBUTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__CONVERTER = 2;

	/**
	 * The feature id for the '<em><b>Disable Conversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT__DISABLE_CONVERSION = 3;

	/**
	 * The number of structural features of the '<em>Convert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Convert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.ConverterImpl <em>Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.ConverterImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getConverter()
	 * @generated
	 */
	int CONVERTER = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Auto Apply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__AUTO_APPLY = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER__CLASS = 2;

	/**
	 * The number of structural features of the '<em>Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.DiscriminatorColumnImpl <em>Discriminator Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.DiscriminatorColumnImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getDiscriminatorColumn()
	 * @generated
	 */
	int DISCRIMINATOR_COLUMN = 11;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Discriminator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN__NAME = 3;

	/**
	 * The number of structural features of the '<em>Discriminator Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Discriminator Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRIMINATOR_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.DocumentRootImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Entity Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY_MAPPINGS = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.ElementCollectionImpl <em>Element Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.ElementCollectionImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getElementCollection()
	 * @generated
	 */
	int ELEMENT_COLLECTION = 13;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ORDER_BY = 0;

	/**
	 * The feature id for the '<em><b>Order Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ORDER_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY = 2;

	/**
	 * The feature id for the '<em><b>Map Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Map Key Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_TEMPORAL = 4;

	/**
	 * The feature id for the '<em><b>Map Key Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_ENUMERATED = 5;

	/**
	 * The feature id for the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_ATTRIBUTE_OVERRIDE = 6;

	/**
	 * The feature id for the '<em><b>Map Key Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_CONVERT = 7;

	/**
	 * The feature id for the '<em><b>Map Key Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Map Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_JOIN_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Map Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__MAP_KEY_FOREIGN_KEY = 10;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__COLUMN = 11;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__TEMPORAL = 12;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ENUMERATED = 13;

	/**
	 * The feature id for the '<em><b>Lob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__LOB = 14;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ATTRIBUTE_OVERRIDE = 15;

	/**
	 * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ASSOCIATION_OVERRIDE = 16;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__CONVERT = 17;

	/**
	 * The feature id for the '<em><b>Collection Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__COLLECTION_TABLE = 18;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__ACCESS = 19;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__FETCH = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__NAME = 21;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION__TARGET_CLASS = 22;

	/**
	 * The number of structural features of the '<em>Element Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Element Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmbeddableImpl <em>Embeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmbeddableImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEmbeddable()
	 * @generated
	 */
	int EMBEDDABLE = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE__METADATA_COMPLETE = 4;

	/**
	 * The number of structural features of the '<em>Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmbeddableAttributesImpl <em>Embeddable Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmbeddableAttributesImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEmbeddableAttributes()
	 * @generated
	 */
	int EMBEDDABLE_ATTRIBUTES = 15;

	/**
	 * The feature id for the '<em><b>Basic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__BASIC = 0;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__MANY_TO_ONE = 1;

	/**
	 * The feature id for the '<em><b>One To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__ONE_TO_MANY = 2;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__ONE_TO_ONE = 3;

	/**
	 * The feature id for the '<em><b>Many To Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__MANY_TO_MANY = 4;

	/**
	 * The feature id for the '<em><b>Element Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__ELEMENT_COLLECTION = 5;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__EMBEDDED = 6;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES__TRANSIENT = 7;

	/**
	 * The number of structural features of the '<em>Embeddable Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Embeddable Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDABLE_ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmbeddedImpl <em>Embedded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmbeddedImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEmbedded()
	 * @generated
	 */
	int EMBEDDED = 16;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__ATTRIBUTE_OVERRIDE = 0;

	/**
	 * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__ASSOCIATION_OVERRIDE = 1;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__CONVERT = 2;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__ACCESS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED__NAME = 4;

	/**
	 * The number of structural features of the '<em>Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmbeddedIdImpl <em>Embedded Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmbeddedIdImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEmbeddedId()
	 * @generated
	 */
	int EMBEDDED_ID = 17;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID__ATTRIBUTE_OVERRIDE = 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID__ACCESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID__NAME = 2;

	/**
	 * The number of structural features of the '<em>Embedded Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Embedded Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmptyTypeImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEmptyType()
	 * @generated
	 */
	int EMPTY_TYPE = 18;

	/**
	 * The number of structural features of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Empty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EntityImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Secondary Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SECONDARY_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRIMARY_KEY_JOIN_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Primary Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRIMARY_KEY_FOREIGN_KEY = 4;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INHERITANCE = 6;

	/**
	 * The feature id for the '<em><b>Discriminator Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISCRIMINATOR_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DISCRIMINATOR_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SEQUENCE_GENERATOR = 9;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE_GENERATOR = 10;

	/**
	 * The feature id for the '<em><b>Named Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMED_QUERY = 11;

	/**
	 * The feature id for the '<em><b>Named Native Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMED_NATIVE_QUERY = 12;

	/**
	 * The feature id for the '<em><b>Named Stored Procedure Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMED_STORED_PROCEDURE_QUERY = 13;

	/**
	 * The feature id for the '<em><b>Sql Result Set Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SQL_RESULT_SET_MAPPING = 14;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXCLUDE_DEFAULT_LISTENERS = 15;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EXCLUDE_SUPERCLASS_LISTENERS = 16;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_LISTENERS = 17;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRE_PERSIST = 18;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_PERSIST = 19;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRE_REMOVE = 20;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_REMOVE = 21;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PRE_UPDATE = 22;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_UPDATE = 23;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POST_LOAD = 24;

	/**
	 * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTE_OVERRIDE = 25;

	/**
	 * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ASSOCIATION_OVERRIDE = 26;

	/**
	 * The feature id for the '<em><b>Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONVERT = 27;

	/**
	 * The feature id for the '<em><b>Named Entity Graph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAMED_ENTITY_GRAPH = 28;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 29;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ACCESS = 30;

	/**
	 * The feature id for the '<em><b>Cacheable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CACHEABLE = 31;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__METADATA_COMPLETE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 33;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CLASS = 34;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 35;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.EntityListenerImpl <em>Entity Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EntityListenerImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEntityListener()
	 * @generated
	 */
	int ENTITY_LISTENER = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__PRE_PERSIST = 1;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_PERSIST = 2;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__PRE_REMOVE = 3;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_REMOVE = 4;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__PRE_UPDATE = 5;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_UPDATE = 6;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__POST_LOAD = 7;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER__CLASS = 8;

	/**
	 * The number of structural features of the '<em>Entity Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Entity Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.EntityListenersImpl <em>Entity Listeners</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EntityListenersImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEntityListeners()
	 * @generated
	 */
	int ENTITY_LISTENERS = 21;

	/**
	 * The feature id for the '<em><b>Entity Listener</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENERS__ENTITY_LISTENER = 0;

	/**
	 * The number of structural features of the '<em>Entity Listeners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity Listeners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_LISTENERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.EntityMappingsTypeImpl <em>Entity Mappings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EntityMappingsTypeImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEntityMappingsType()
	 * @generated
	 */
	int ENTITY_MAPPINGS_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Persistence Unit Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR = 6;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR = 7;

	/**
	 * The feature id for the '<em><b>Named Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__NAMED_QUERY = 8;

	/**
	 * The feature id for the '<em><b>Named Native Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY = 9;

	/**
	 * The feature id for the '<em><b>Named Stored Procedure Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__NAMED_STORED_PROCEDURE_QUERY = 10;

	/**
	 * The feature id for the '<em><b>Sql Result Set Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING = 11;

	/**
	 * The feature id for the '<em><b>Mapped Superclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS = 12;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__ENTITY = 13;

	/**
	 * The feature id for the '<em><b>Embeddable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__EMBEDDABLE = 14;

	/**
	 * The feature id for the '<em><b>Converter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__CONVERTER = 15;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE__VERSION = 16;

	/**
	 * The number of structural features of the '<em>Entity Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Entity Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MAPPINGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.EntityResultImpl <em>Entity Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EntityResultImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEntityResult()
	 * @generated
	 */
	int ENTITY_RESULT = 23;

	/**
	 * The feature id for the '<em><b>Field Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__FIELD_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Discriminator Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__DISCRIMINATOR_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Entity Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT__ENTITY_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Entity Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.FieldResultImpl <em>Field Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.FieldResultImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getFieldResult()
	 * @generated
	 */
	int FIELD_RESULT = 24;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Field Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.ForeignKeyImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Constraint Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__CONSTRAINT_MODE = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__FOREIGN_KEY_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = 3;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.GeneratedValueImpl <em>Generated Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.GeneratedValueImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getGeneratedValue()
	 * @generated
	 */
	int GENERATED_VALUE = 26;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE__GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE__STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Generated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.IdImpl <em>Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.IdImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getId()
	 * @generated
	 */
	int ID = 27;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__GENERATED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__TEMPORAL = 2;

	/**
	 * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__TABLE_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__SEQUENCE_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ACCESS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__NAME = 6;

	/**
	 * The number of structural features of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.IdClassImpl <em>Id Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.IdClassImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getIdClass()
	 * @generated
	 */
	int ID_CLASS = 28;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CLASS__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Id Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Id Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.IndexImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Column List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__COLUMN_LIST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__UNIQUE = 3;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.InheritanceImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 30;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.JoinColumnImpl <em>Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.JoinColumnImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getJoinColumn()
	 * @generated
	 */
	int JOIN_COLUMN = 31;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__INSERTABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__NULLABLE = 3;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__REFERENCED_COLUMN_NAME = 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__TABLE = 5;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__UNIQUE = 6;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN__UPDATABLE = 7;

	/**
	 * The number of structural features of the '<em>Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.JoinTableImpl <em>Join Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.JoinTableImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getJoinTable()
	 * @generated
	 */
	int JOIN_TABLE = 32;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Inverse Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__INVERSE_JOIN_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Inverse Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__INVERSE_FOREIGN_KEY = 3;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__UNIQUE_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__INDEX = 5;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__CATALOG = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE__SCHEMA = 8;

	/**
	 * The number of structural features of the '<em>Join Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Join Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.LobImpl <em>Lob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.LobImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getLob()
	 * @generated
	 */
	int LOB = 33;

	/**
	 * The number of structural features of the '<em>Lob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOB_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Lob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.ManyToManyImpl <em>Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.ManyToManyImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getManyToMany()
	 * @generated
	 */
	int MANY_TO_MANY = 34;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__ORDER_BY = 0;

	/**
	 * The feature id for the '<em><b>Order Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__ORDER_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY = 2;

	/**
	 * The feature id for the '<em><b>Map Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Map Key Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_TEMPORAL = 4;

	/**
	 * The feature id for the '<em><b>Map Key Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_ENUMERATED = 5;

	/**
	 * The feature id for the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE = 6;

	/**
	 * The feature id for the '<em><b>Map Key Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_CONVERT = 7;

	/**
	 * The feature id for the '<em><b>Map Key Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Map Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_JOIN_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Map Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAP_KEY_FOREIGN_KEY = 10;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__JOIN_TABLE = 11;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__CASCADE = 12;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__ACCESS = 13;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__FETCH = 14;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__MAPPED_BY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__NAME = 16;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__TARGET_ENTITY = 17;

	/**
	 * The number of structural features of the '<em>Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.ManyToOneImpl <em>Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.ManyToOneImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getManyToOne()
	 * @generated
	 */
	int MANY_TO_ONE = 35;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__JOIN_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__CASCADE = 3;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__ACCESS = 4;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__FETCH = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__ID = 6;

	/**
	 * The feature id for the '<em><b>Maps Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__MAPS_ID = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__OPTIONAL = 9;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__TARGET_ENTITY = 10;

	/**
	 * The number of structural features of the '<em>Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.MapKeyImpl <em>Map Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.MapKeyImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getMapKey()
	 * @generated
	 */
	int MAP_KEY = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Map Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Map Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.MapKeyClassImpl <em>Map Key Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.MapKeyClassImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getMapKeyClass()
	 * @generated
	 */
	int MAP_KEY_CLASS = 37;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_CLASS__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Map Key Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Map Key Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.MapKeyColumnImpl <em>Map Key Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.MapKeyColumnImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getMapKeyColumn()
	 * @generated
	 */
	int MAP_KEY_COLUMN = 38;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__INSERTABLE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__NAME = 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__NULLABLE = 4;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__PRECISION = 5;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__SCALE = 6;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__TABLE = 7;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__UNIQUE = 8;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN__UPDATABLE = 9;

	/**
	 * The number of structural features of the '<em>Map Key Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Map Key Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.MapKeyJoinColumnImpl <em>Map Key Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.MapKeyJoinColumnImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getMapKeyJoinColumn()
	 * @generated
	 */
	int MAP_KEY_JOIN_COLUMN = 39;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__INSERTABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__NULLABLE = 3;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = 4;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__TABLE = 5;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__UNIQUE = 6;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN__UPDATABLE = 7;

	/**
	 * The number of structural features of the '<em>Map Key Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Map Key Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_KEY_JOIN_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.MappedSuperclassImpl <em>Mapped Superclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.MappedSuperclassImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getMappedSuperclass()
	 * @generated
	 */
	int MAPPED_SUPERCLASS = 40;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ID_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Exclude Default Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS = 2;

	/**
	 * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS = 3;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ENTITY_LISTENERS = 4;

	/**
	 * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__PRE_PERSIST = 5;

	/**
	 * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_PERSIST = 6;

	/**
	 * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__PRE_REMOVE = 7;

	/**
	 * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_REMOVE = 8;

	/**
	 * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__PRE_UPDATE = 9;

	/**
	 * The feature id for the '<em><b>Post Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_UPDATE = 10;

	/**
	 * The feature id for the '<em><b>Post Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__POST_LOAD = 11;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ATTRIBUTES = 12;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__ACCESS = 13;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__CLASS = 14;

	/**
	 * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS__METADATA_COMPLETE = 15;

	/**
	 * The number of structural features of the '<em>Mapped Superclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Mapped Superclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_SUPERCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedAttributeNodeImpl <em>Named Attribute Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedAttributeNodeImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getNamedAttributeNode()
	 * @generated
	 */
	int NAMED_ATTRIBUTE_NODE = 41;

	/**
	 * The feature id for the '<em><b>Key Subgraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_NODE__KEY_SUBGRAPH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_NODE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Subgraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_NODE__SUBGRAPH = 2;

	/**
	 * The number of structural features of the '<em>Named Attribute Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Named Attribute Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ATTRIBUTE_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedEntityGraphImpl <em>Named Entity Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedEntityGraphImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getNamedEntityGraph()
	 * @generated
	 */
	int NAMED_ENTITY_GRAPH = 42;

	/**
	 * The feature id for the '<em><b>Named Attribute Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH__NAMED_ATTRIBUTE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Subgraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH__SUBGRAPH = 1;

	/**
	 * The feature id for the '<em><b>Subclass Subgraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH__SUBCLASS_SUBGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Include All Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH__INCLUDE_ALL_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH__NAME = 4;

	/**
	 * The number of structural features of the '<em>Named Entity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Named Entity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedNativeQueryImpl <em>Named Native Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedNativeQueryImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getNamedNativeQuery()
	 * @generated
	 */
	int NAMED_NATIVE_QUERY = 43;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__HINT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Result Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__RESULT_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY__RESULT_SET_MAPPING = 5;

	/**
	 * The number of structural features of the '<em>Named Native Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Named Native Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NATIVE_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedQueryImpl <em>Named Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedQueryImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getNamedQuery()
	 * @generated
	 */
	int NAMED_QUERY = 44;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Lock Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__LOCK_MODE = 2;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__HINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY__NAME = 4;

	/**
	 * The number of structural features of the '<em>Named Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Named Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedStoredProcedureQueryImpl <em>Named Stored Procedure Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedStoredProcedureQueryImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getNamedStoredProcedureQuery()
	 * @generated
	 */
	int NAMED_STORED_PROCEDURE_QUERY = 45;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Result Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__HINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__NAME = 5;

	/**
	 * The feature id for the '<em><b>Procedure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME = 6;

	/**
	 * The number of structural features of the '<em>Named Stored Procedure Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Named Stored Procedure Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_STORED_PROCEDURE_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedSubgraphImpl <em>Named Subgraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.NamedSubgraphImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getNamedSubgraph()
	 * @generated
	 */
	int NAMED_SUBGRAPH = 46;

	/**
	 * The feature id for the '<em><b>Named Attribute Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SUBGRAPH__NAMED_ATTRIBUTE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SUBGRAPH__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SUBGRAPH__NAME = 2;

	/**
	 * The number of structural features of the '<em>Named Subgraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SUBGRAPH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Named Subgraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_SUBGRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.OneToManyImpl <em>One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.OneToManyImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getOneToMany()
	 * @generated
	 */
	int ONE_TO_MANY = 47;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ORDER_BY = 0;

	/**
	 * The feature id for the '<em><b>Order Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ORDER_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY = 2;

	/**
	 * The feature id for the '<em><b>Map Key Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Map Key Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_TEMPORAL = 4;

	/**
	 * The feature id for the '<em><b>Map Key Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_ENUMERATED = 5;

	/**
	 * The feature id for the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE = 6;

	/**
	 * The feature id for the '<em><b>Map Key Convert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_CONVERT = 7;

	/**
	 * The feature id for the '<em><b>Map Key Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Map Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_JOIN_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Map Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAP_KEY_FOREIGN_KEY = 10;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__JOIN_TABLE = 11;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__JOIN_COLUMN = 12;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__FOREIGN_KEY = 13;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__CASCADE = 14;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ACCESS = 15;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__FETCH = 16;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__MAPPED_BY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__NAME = 18;

	/**
	 * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ORPHAN_REMOVAL = 19;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__TARGET_ENTITY = 20;

	/**
	 * The number of structural features of the '<em>One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.OneToOneImpl <em>One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.OneToOneImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getOneToOne()
	 * @generated
	 */
	int ONE_TO_ONE = 48;

	/**
	 * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Primary Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__PRIMARY_KEY_FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__JOIN_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__FOREIGN_KEY = 3;

	/**
	 * The feature id for the '<em><b>Join Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__JOIN_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__CASCADE = 5;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__ACCESS = 6;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__FETCH = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__ID = 8;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__MAPPED_BY = 9;

	/**
	 * The feature id for the '<em><b>Maps Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__MAPS_ID = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__NAME = 11;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__OPTIONAL = 12;

	/**
	 * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__ORPHAN_REMOVAL = 13;

	/**
	 * The feature id for the '<em><b>Target Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__TARGET_ENTITY = 14;

	/**
	 * The number of structural features of the '<em>One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.OrderColumnImpl <em>Order Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.OrderColumnImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getOrderColumn()
	 * @generated
	 */
	int ORDER_COLUMN = 49;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Insertable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__INSERTABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__NAME = 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__NULLABLE = 3;

	/**
	 * The feature id for the '<em><b>Updatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN__UPDATABLE = 4;

	/**
	 * The number of structural features of the '<em>Order Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Order Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.PersistenceUnitDefaultsImpl <em>Persistence Unit Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.PersistenceUnitDefaultsImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getPersistenceUnitDefaults()
	 * @generated
	 */
	int PERSISTENCE_UNIT_DEFAULTS = 50;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__CATALOG = 2;

	/**
	 * The feature id for the '<em><b>Delimited Identifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS = 3;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__ACCESS = 4;

	/**
	 * The feature id for the '<em><b>Cascade Persist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST = 5;

	/**
	 * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS = 6;

	/**
	 * The number of structural features of the '<em>Persistence Unit Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Persistence Unit Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_DEFAULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.PersistenceUnitMetadataImpl <em>Persistence Unit Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.PersistenceUnitMetadataImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getPersistenceUnitMetadata()
	 * @generated
	 */
	int PERSISTENCE_UNIT_METADATA = 51;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Xml Mapping Metadata Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE = 1;

	/**
	 * The feature id for the '<em><b>Persistence Unit Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS = 2;

	/**
	 * The number of structural features of the '<em>Persistence Unit Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Persistence Unit Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_UNIT_METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.PostLoadImpl <em>Post Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.PostLoadImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getPostLoad()
	 * @generated
	 */
	int POST_LOAD = 52;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Post Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Post Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_LOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.PostPersistImpl <em>Post Persist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.PostPersistImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getPostPersist()
	 * @generated
	 */
	int POST_PERSIST = 53;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Post Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Post Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_PERSIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.PostRemoveImpl <em>Post Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.PostRemoveImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getPostRemove()
	 * @generated
	 */
	int POST_REMOVE = 54;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Post Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Post Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_REMOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.PostUpdateImpl <em>Post Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.PostUpdateImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getPostUpdate()
	 * @generated
	 */
	int POST_UPDATE = 55;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Post Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Post Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_UPDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.PrePersistImpl <em>Pre Persist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.PrePersistImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getPrePersist()
	 * @generated
	 */
	int PRE_PERSIST = 56;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Pre Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pre Persist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_PERSIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.PreRemoveImpl <em>Pre Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.PreRemoveImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getPreRemove()
	 * @generated
	 */
	int PRE_REMOVE = 57;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Pre Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pre Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_REMOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.PreUpdateImpl <em>Pre Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.PreUpdateImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getPreUpdate()
	 * @generated
	 */
	int PRE_UPDATE = 58;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE__METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Pre Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pre Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_UPDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.PrimaryKeyJoinColumnImpl <em>Primary Key Join Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.PrimaryKeyJoinColumnImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getPrimaryKeyJoinColumn()
	 * @generated
	 */
	int PRIMARY_KEY_JOIN_COLUMN = 59;

	/**
	 * The feature id for the '<em><b>Column Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__COLUMN_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = 2;

	/**
	 * The number of structural features of the '<em>Primary Key Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Primary Key Join Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_JOIN_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.QueryHintImpl <em>Query Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.QueryHintImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getQueryHint()
	 * @generated
	 */
	int QUERY_HINT = 60;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Query Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Query Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_HINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.SecondaryTableImpl <em>Secondary Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.SecondaryTableImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getSecondaryTable()
	 * @generated
	 */
	int SECONDARY_TABLE = 61;

	/**
	 * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Primary Key Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__PRIMARY_KEY_FOREIGN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__UNIQUE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__INDEX = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE__SCHEMA = 6;

	/**
	 * The number of structural features of the '<em>Secondary Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Secondary Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.SequenceGeneratorImpl <em>Sequence Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.SequenceGeneratorImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getSequenceGenerator()
	 * @generated
	 */
	int SEQUENCE_GENERATOR = 62;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__ALLOCATION_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__CATALOG = 2;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__INITIAL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__NAME = 4;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__SCHEMA = 5;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR__SEQUENCE_NAME = 6;

	/**
	 * The number of structural features of the '<em>Sequence Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Sequence Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.SqlResultSetMappingImpl <em>Sql Result Set Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.SqlResultSetMappingImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getSqlResultSetMapping()
	 * @generated
	 */
	int SQL_RESULT_SET_MAPPING = 63;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Entity Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__ENTITY_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Constructor Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__CONSTRUCTOR_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Column Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__COLUMN_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING__NAME = 4;

	/**
	 * The number of structural features of the '<em>Sql Result Set Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sql Result Set Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_RESULT_SET_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.StoredProcedureParameterImpl <em>Stored Procedure Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.StoredProcedureParameterImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getStoredProcedureParameter()
	 * @generated
	 */
	int STORED_PROCEDURE_PARAMETER = 64;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER__MODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Stored Procedure Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Stored Procedure Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_PROCEDURE_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.TableImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 65;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__UNIQUE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CATALOG = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SCHEMA = 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.TableGeneratorImpl <em>Table Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.TableGeneratorImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getTableGenerator()
	 * @generated
	 */
	int TABLE_GENERATOR = 66;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__UNIQUE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__INDEX = 2;

	/**
	 * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__ALLOCATION_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__CATALOG = 4;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__INITIAL_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__NAME = 6;

	/**
	 * The feature id for the '<em><b>Pk Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__PK_COLUMN_NAME = 7;

	/**
	 * The feature id for the '<em><b>Pk Column Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__PK_COLUMN_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__SCHEMA = 9;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__TABLE = 10;

	/**
	 * The feature id for the '<em><b>Value Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR__VALUE_COLUMN_NAME = 11;

	/**
	 * The number of structural features of the '<em>Table Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Table Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.TransientImpl <em>Transient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.TransientImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getTransient()
	 * @generated
	 */
	int TRANSIENT = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Transient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.UniqueConstraintImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 68;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.VersionImpl
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 69;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__TEMPORAL = 1;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AccessType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 70;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ConstraintMode <em>Constraint Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ConstraintMode
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getConstraintMode()
	 * @generated
	 */
	int CONSTRAINT_MODE = 71;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorType <em>Discriminator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getDiscriminatorType()
	 * @generated
	 */
	int DISCRIMINATOR_TYPE = 72;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EnumType <em>Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EnumType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 73;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.FetchType <em>Fetch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.FetchType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getFetchType()
	 * @generated
	 */
	int FETCH_TYPE = 74;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.GenerationType <em>Generation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.GenerationType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getGenerationType()
	 * @generated
	 */
	int GENERATION_TYPE = 75;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.InheritanceType <em>Inheritance Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.InheritanceType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getInheritanceType()
	 * @generated
	 */
	int INHERITANCE_TYPE = 76;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.LockModeType <em>Lock Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.LockModeType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getLockModeType()
	 * @generated
	 */
	int LOCK_MODE_TYPE = 77;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ParameterMode <em>Parameter Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ParameterMode
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getParameterMode()
	 * @generated
	 */
	int PARAMETER_MODE = 78;

	/**
	 * The meta object id for the '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType <em>Temporal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getTemporalType()
	 * @generated
	 */
	int TEMPORAL_TYPE = 79;

	/**
	 * The meta object id for the '<em>Access Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AccessType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getAccessTypeObject()
	 * @generated
	 */
	int ACCESS_TYPE_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Constraint Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ConstraintMode
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getConstraintModeObject()
	 * @generated
	 */
	int CONSTRAINT_MODE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Discriminator Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getDiscriminatorTypeObject()
	 * @generated
	 */
	int DISCRIMINATOR_TYPE_OBJECT = 82;

	/**
	 * The meta object id for the '<em>Discriminator Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getDiscriminatorValue()
	 * @generated
	 */
	int DISCRIMINATOR_VALUE = 83;

	/**
	 * The meta object id for the '<em>Enumerated</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EnumType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEnumerated()
	 * @generated
	 */
	int ENUMERATED = 84;

	/**
	 * The meta object id for the '<em>Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EnumType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getEnumTypeObject()
	 * @generated
	 */
	int ENUM_TYPE_OBJECT = 85;

	/**
	 * The meta object id for the '<em>Fetch Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.FetchType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getFetchTypeObject()
	 * @generated
	 */
	int FETCH_TYPE_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Generation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.GenerationType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getGenerationTypeObject()
	 * @generated
	 */
	int GENERATION_TYPE_OBJECT = 87;

	/**
	 * The meta object id for the '<em>Inheritance Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.InheritanceType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getInheritanceTypeObject()
	 * @generated
	 */
	int INHERITANCE_TYPE_OBJECT = 88;

	/**
	 * The meta object id for the '<em>Lock Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.LockModeType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getLockModeTypeObject()
	 * @generated
	 */
	int LOCK_MODE_TYPE_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Order By</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getOrderBy()
	 * @generated
	 */
	int ORDER_BY = 90;

	/**
	 * The meta object id for the '<em>Parameter Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ParameterMode
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getParameterModeObject()
	 * @generated
	 */
	int PARAMETER_MODE_OBJECT = 91;

	/**
	 * The meta object id for the '<em>Temporal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 92;

	/**
	 * The meta object id for the '<em>Temporal Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getTemporalTypeObject()
	 * @generated
	 */
	int TEMPORAL_TYPE_OBJECT = 93;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.impl.EmfmappingPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 94;


	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride
	 * @generated
	 */
	EClass getAssociationOverride();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride#getDescription()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EAttribute getAssociationOverride_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride#getJoinColumn()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EReference getAssociationOverride_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride#getForeignKey()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EReference getAssociationOverride_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride#getJoinTable()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EReference getAssociationOverride_JoinTable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AssociationOverride#getName()
	 * @see #getAssociationOverride()
	 * @generated
	 */
	EAttribute getAssociationOverride_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AttributeOverride
	 * @generated
	 */
	EClass getAttributeOverride();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AttributeOverride#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AttributeOverride#getDescription()
	 * @see #getAttributeOverride()
	 * @generated
	 */
	EAttribute getAttributeOverride_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AttributeOverride#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AttributeOverride#getColumn()
	 * @see #getAttributeOverride()
	 * @generated
	 */
	EReference getAttributeOverride_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AttributeOverride#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AttributeOverride#getName()
	 * @see #getAttributeOverride()
	 * @generated
	 */
	EAttribute getAttributeOverride_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getDescription()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getId()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getEmbeddedId <em>Embedded Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedded Id</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getEmbeddedId()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_EmbeddedId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getBasic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getBasic()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Basic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Version</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getVersion()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getManyToOne()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To Many</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getOneToMany()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_OneToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getOneToOne()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To Many</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getManyToMany()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_ManyToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getElementCollection <em>Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Collection</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getElementCollection()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_ElementCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getEmbedded()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Embedded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Attributes#getTransient()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Transient();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Basic
	 * @generated
	 */
	EClass getBasic();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getColumn()
	 * @see #getBasic()
	 * @generated
	 */
	EReference getBasic_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getLob <em>Lob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lob</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getLob()
	 * @see #getBasic()
	 * @generated
	 */
	EReference getBasic_Lob();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getTemporal()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Temporal();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getEnumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumerated</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getEnumerated()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Enumerated();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getConvert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Convert</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getConvert()
	 * @see #getBasic()
	 * @generated
	 */
	EReference getBasic_Convert();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getAccess()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getFetch()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Fetch();

	/**
	 * Returns the meta object for the reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Basic#getName()
	 * @see #getBasic()
	 * @generated
	 */
	EReference getBasic_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Basic#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Basic#isOptional()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Optional();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType <em>Cascade Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cascade Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType
	 * @generated
	 */
	EClass getCascadeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadeAll <em>Cascade All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade All</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadeAll()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeAll();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadePersist <em>Cascade Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Persist</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadePersist()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadePersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadeMerge <em>Cascade Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Merge</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadeMerge()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeMerge();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadeRemove <em>Cascade Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Remove</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadeRemove()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadeRefresh <em>Cascade Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Refresh</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadeRefresh()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeRefresh();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadeDetach <em>Cascade Detach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Detach</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CascadeType#getCascadeDetach()
	 * @see #getCascadeType()
	 * @generated
	 */
	EReference getCascadeType_CascadeDetach();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable <em>Collection Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable
	 * @generated
	 */
	EClass getCollectionTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getJoinColumn()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EReference getCollectionTable_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getForeignKey()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EReference getCollectionTable_ForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getUniqueConstraint()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EReference getCollectionTable_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getIndex()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EReference getCollectionTable_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getCatalog()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EAttribute getCollectionTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getName()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EAttribute getCollectionTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.CollectionTable#getSchema()
	 * @see #getCollectionTable()
	 * @generated
	 */
	EAttribute getCollectionTable_Schema();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column#getColumnDefinition()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column#isInsertable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column#getLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column#isNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column#getPrecision()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column#getScale()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column#isUnique()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Column#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Column#isUpdatable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ColumnResult <em>Column Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Result</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ColumnResult
	 * @generated
	 */
	EClass getColumnResult();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ColumnResult#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ColumnResult#getClass_()
	 * @see #getColumnResult()
	 * @generated
	 */
	EAttribute getColumnResult_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ColumnResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ColumnResult#getName()
	 * @see #getColumnResult()
	 * @generated
	 */
	EAttribute getColumnResult_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ConstructorResult <em>Constructor Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Result</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ConstructorResult
	 * @generated
	 */
	EClass getConstructorResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ConstructorResult#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ConstructorResult#getColumn()
	 * @see #getConstructorResult()
	 * @generated
	 */
	EReference getConstructorResult_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ConstructorResult#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ConstructorResult#getTargetClass()
	 * @see #getConstructorResult()
	 * @generated
	 */
	EAttribute getConstructorResult_TargetClass();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Convert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Convert
	 * @generated
	 */
	EClass getConvert();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Convert#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Convert#getDescription()
	 * @see #getConvert()
	 * @generated
	 */
	EAttribute getConvert_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Convert#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Convert#getAttributeName()
	 * @see #getConvert()
	 * @generated
	 */
	EAttribute getConvert_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Convert#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converter</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Convert#getConverter()
	 * @see #getConvert()
	 * @generated
	 */
	EAttribute getConvert_Converter();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Convert#isDisableConversion <em>Disable Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable Conversion</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Convert#isDisableConversion()
	 * @see #getConvert()
	 * @generated
	 */
	EAttribute getConvert_DisableConversion();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Converter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Converter</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Converter
	 * @generated
	 */
	EClass getConverter();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Converter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Converter#getDescription()
	 * @see #getConverter()
	 * @generated
	 */
	EAttribute getConverter_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Converter#isAutoApply <em>Auto Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Apply</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Converter#isAutoApply()
	 * @see #getConverter()
	 * @generated
	 */
	EAttribute getConverter_AutoApply();

	/**
	 * Returns the meta object for the reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Converter#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Converter#getClass_()
	 * @see #getConverter()
	 * @generated
	 */
	EReference getConverter_Class();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discriminator Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorColumn
	 * @generated
	 */
	EClass getDiscriminatorColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorColumn#getColumnDefinition()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorColumn#getDiscriminatorType()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_DiscriminatorType();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorColumn#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorColumn#getLength()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorColumn#getName()
	 * @see #getDiscriminatorColumn()
	 * @generated
	 */
	EAttribute getDiscriminatorColumn_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DocumentRoot#getEntityMappings <em>Entity Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Mappings</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DocumentRoot#getEntityMappings()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EntityMappings();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection <em>Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Collection</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection
	 * @generated
	 */
	EClass getElementCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getOrderBy()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_OrderBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getOrderColumn <em>Order Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getOrderColumn()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_OrderColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKey()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyClass <em>Map Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyClass()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyClass();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyTemporal <em>Map Key Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Temporal</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyTemporal()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_MapKeyTemporal();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyEnumerated <em>Map Key Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Enumerated</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyEnumerated()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_MapKeyEnumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Attribute Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyAttributeOverride()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyAttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyConvert <em>Map Key Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Convert</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyConvert()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyConvert();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyColumn <em>Map Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyColumn()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyJoinColumn <em>Map Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyJoinColumn()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyForeignKey <em>Map Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getMapKeyForeignKey()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_MapKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getColumn()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getTemporal()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_Temporal();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getEnumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumerated</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getEnumerated()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_Enumerated();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getLob <em>Lob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lob</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getLob()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_Lob();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getAttributeOverride()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_AttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getAssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getAssociationOverride()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_AssociationOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getConvert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Convert</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getConvert()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_Convert();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getCollectionTable <em>Collection Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getCollectionTable()
	 * @see #getElementCollection()
	 * @generated
	 */
	EReference getElementCollection_CollectionTable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getAccess()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getFetch()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getName()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ElementCollection#getTargetClass()
	 * @see #getElementCollection()
	 * @generated
	 */
	EAttribute getElementCollection_TargetClass();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embeddable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable
	 * @generated
	 */
	EClass getEmbeddable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable#getDescription()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable#getAttributes()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EReference getEmbeddable_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable#getAccess()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_Access();

	/**
	 * Returns the meta object for the reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable#getClass_()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EReference getEmbeddable_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embeddable#isMetadataComplete()
	 * @see #getEmbeddable()
	 * @generated
	 */
	EAttribute getEmbeddable_MetadataComplete();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes <em>Embeddable Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embeddable Attributes</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes
	 * @generated
	 */
	EClass getEmbeddableAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getBasic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getBasic()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_Basic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getManyToOne()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_ManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getOneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To Many</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getOneToMany()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_OneToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getOneToOne()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To Many</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getManyToMany()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_ManyToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getElementCollection <em>Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Collection</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getElementCollection()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_ElementCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getEmbedded()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_Embedded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddableAttributes#getTransient()
	 * @see #getEmbeddableAttributes()
	 * @generated
	 */
	EReference getEmbeddableAttributes_Transient();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embedded
	 * @generated
	 */
	EClass getEmbedded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embedded#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embedded#getAttributeOverride()
	 * @see #getEmbedded()
	 * @generated
	 */
	EReference getEmbedded_AttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embedded#getAssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embedded#getAssociationOverride()
	 * @see #getEmbedded()
	 * @generated
	 */
	EReference getEmbedded_AssociationOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embedded#getConvert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Convert</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embedded#getConvert()
	 * @see #getEmbedded()
	 * @generated
	 */
	EReference getEmbedded_Convert();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embedded#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embedded#getAccess()
	 * @see #getEmbedded()
	 * @generated
	 */
	EAttribute getEmbedded_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Embedded#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Embedded#getName()
	 * @see #getEmbedded()
	 * @generated
	 */
	EAttribute getEmbedded_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddedId <em>Embedded Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Id</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddedId
	 * @generated
	 */
	EClass getEmbeddedId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddedId#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddedId#getAttributeOverride()
	 * @see #getEmbeddedId()
	 * @generated
	 */
	EReference getEmbeddedId_AttributeOverride();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddedId#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddedId#getAccess()
	 * @see #getEmbeddedId()
	 * @generated
	 */
	EAttribute getEmbeddedId_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddedId#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmbeddedId#getName()
	 * @see #getEmbeddedId()
	 * @generated
	 */
	EAttribute getEmbeddedId_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EmptyType <em>Empty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EmptyType
	 * @generated
	 */
	EClass getEmptyType();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getDescription()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getTable()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getSecondaryTable <em>Secondary Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secondary Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getSecondaryTable()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SecondaryTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPrimaryKeyJoinColumn()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPrimaryKeyForeignKey <em>Primary Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPrimaryKeyForeignKey()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PrimaryKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getIdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getIdClass()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_IdClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inheritance</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getInheritance()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Inheritance();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getDiscriminatorValue <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Value</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getDiscriminatorValue()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_DiscriminatorValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discriminator Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getDiscriminatorColumn()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_DiscriminatorColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getSequenceGenerator()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SequenceGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Generator</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getTableGenerator()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_TableGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getNamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getNamedQuery()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NamedQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getNamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Native Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getNamedNativeQuery()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NamedNativeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getNamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Stored Procedure Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getNamedStoredProcedureQuery()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NamedStoredProcedureQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Result Set Mapping</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getSqlResultSetMapping()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SqlResultSetMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Default Listeners</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getExcludeDefaultListeners()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ExcludeDefaultListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Superclass Listeners</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getExcludeSuperclassListeners()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ExcludeSuperclassListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getEntityListeners()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_EntityListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPrePersist()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PrePersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPostPersist()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostPersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPreRemove()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PreRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPostRemove()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPreUpdate()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PreUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPostUpdate()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getPostLoad()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_PostLoad();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getAttributeOverride <em>Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getAttributeOverride()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getAssociationOverride <em>Association Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getAssociationOverride()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AssociationOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getConvert <em>Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Convert</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getConvert()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Convert();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getNamedEntityGraph <em>Named Entity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Entity Graph</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getNamedEntityGraph()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_NamedEntityGraph();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getAccess()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#isCacheable <em>Cacheable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cacheable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#isCacheable()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Cacheable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#isMetadataComplete()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_MetadataComplete();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Entity#getClass_()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Class();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener <em>Entity Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Listener</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener
	 * @generated
	 */
	EClass getEntityListener();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getDescription()
	 * @see #getEntityListener()
	 * @generated
	 */
	EAttribute getEntityListener_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPrePersist()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PrePersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPostPersist()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostPersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPreRemove()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PreRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPostRemove()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPreUpdate()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PreUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPostUpdate()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getPostLoad()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_PostLoad();

	/**
	 * Returns the meta object for the reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListener#getClass_()
	 * @see #getEntityListener()
	 * @generated
	 */
	EReference getEntityListener_Class();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Listeners</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListeners
	 * @generated
	 */
	EClass getEntityListeners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityListeners#getEntityListener <em>Entity Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Listener</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityListeners#getEntityListener()
	 * @see #getEntityListeners()
	 * @generated
	 */
	EReference getEntityListeners_EntityListener();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType <em>Entity Mappings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Mappings Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType
	 * @generated
	 */
	EClass getEntityMappingsType();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getDescription()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Metadata</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getPersistenceUnitMetadata()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_PersistenceUnitMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getPackage()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getSchema()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getCatalog()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getAccess()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Access();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Generator</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getSequenceGenerator()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_SequenceGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Generator</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getTableGenerator()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_TableGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getNamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getNamedQuery()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_NamedQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getNamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Native Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getNamedNativeQuery()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_NamedNativeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getNamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Stored Procedure Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getNamedStoredProcedureQuery()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_NamedStoredProcedureQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sql Result Set Mapping</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getSqlResultSetMapping()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_SqlResultSetMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getMappedSuperclass <em>Mapped Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapped Superclass</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getMappedSuperclass()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_MappedSuperclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getEntity()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getEmbeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embeddable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getEmbeddable()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_Embeddable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getConverter <em>Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Converter</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getConverter()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EReference getEntityMappingsType_Converter();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityMappingsType#getVersion()
	 * @see #getEntityMappingsType()
	 * @generated
	 */
	EAttribute getEntityMappingsType_Version();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityResult <em>Entity Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Result</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityResult
	 * @generated
	 */
	EClass getEntityResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityResult#getFieldResult <em>Field Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Result</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityResult#getFieldResult()
	 * @see #getEntityResult()
	 * @generated
	 */
	EReference getEntityResult_FieldResult();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityResult#getDiscriminatorColumn()
	 * @see #getEntityResult()
	 * @generated
	 */
	EAttribute getEntityResult_DiscriminatorColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EntityResult#getEntityClass <em>Entity Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EntityResult#getEntityClass()
	 * @see #getEntityResult()
	 * @generated
	 */
	EAttribute getEntityResult_EntityClass();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.FieldResult <em>Field Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Result</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.FieldResult
	 * @generated
	 */
	EClass getFieldResult();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.FieldResult#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.FieldResult#getColumn()
	 * @see #getFieldResult()
	 * @generated
	 */
	EAttribute getFieldResult_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.FieldResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.FieldResult#getName()
	 * @see #getFieldResult()
	 * @generated
	 */
	EAttribute getFieldResult_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ForeignKey#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ForeignKey#getDescription()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ForeignKey#getConstraintMode <em>Constraint Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Mode</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ForeignKey#getConstraintMode()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_ConstraintMode();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ForeignKey#getForeignKeyDefinition <em>Foreign Key Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key Definition</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ForeignKey#getForeignKeyDefinition()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_ForeignKeyDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ForeignKey#getName()
	 * @see #getForeignKey()
	 * @generated
	 */
	EAttribute getForeignKey_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.GeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Value</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.GeneratedValue
	 * @generated
	 */
	EClass getGeneratedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.GeneratedValue#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.GeneratedValue#getGenerator()
	 * @see #getGeneratedValue()
	 * @generated
	 */
	EAttribute getGeneratedValue_Generator();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.GeneratedValue#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.GeneratedValue#getStrategy()
	 * @see #getGeneratedValue()
	 * @generated
	 */
	EAttribute getGeneratedValue_Strategy();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Id
	 * @generated
	 */
	EClass getId();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Id#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Id#getColumn()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_Column();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Id#getGeneratedValue <em>Generated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generated Value</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Id#getGeneratedValue()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_GeneratedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Id#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Id#getTemporal()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Temporal();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Id#getTableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Generator</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Id#getTableGenerator()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_TableGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Id#getSequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Id#getSequenceGenerator()
	 * @see #getId()
	 * @generated
	 */
	EReference getId_SequenceGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Id#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Id#getAccess()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Id#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Id#getName()
	 * @see #getId()
	 * @generated
	 */
	EAttribute getId_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.IdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.IdClass
	 * @generated
	 */
	EClass getIdClass();

	/**
	 * Returns the meta object for the reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.IdClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.IdClass#getClass_()
	 * @see #getIdClass()
	 * @generated
	 */
	EReference getIdClass_Class();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Index#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Index#getDescription()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Index#getColumnList <em>Column List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column List</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Index#getColumnList()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_ColumnList();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Index#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Index#getName()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Index#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Index#isUnique()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Unique();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Inheritance#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Inheritance#getStrategy()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_Strategy();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn
	 * @generated
	 */
	EClass getJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#getColumnDefinition()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#isInsertable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#getName()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#isNullable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#getReferencedColumnName()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_ReferencedColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#getTable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#isUnique()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinColumn#isUpdatable()
	 * @see #getJoinColumn()
	 * @generated
	 */
	EAttribute getJoinColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable
	 * @generated
	 */
	EClass getJoinTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getJoinColumn()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getForeignKey()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_ForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getInverseJoinColumn <em>Inverse Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverse Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getInverseJoinColumn()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_InverseJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getInverseForeignKey <em>Inverse Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverse Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getInverseForeignKey()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_InverseForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getUniqueConstraint()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getIndex()
	 * @see #getJoinTable()
	 * @generated
	 */
	EReference getJoinTable_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getCatalog()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getName()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.JoinTable#getSchema()
	 * @see #getJoinTable()
	 * @generated
	 */
	EAttribute getJoinTable_Schema();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Lob <em>Lob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lob</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Lob
	 * @generated
	 */
	EClass getLob();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To Many</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany
	 * @generated
	 */
	EClass getManyToMany();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getOrderBy()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_OrderBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getOrderColumn <em>Order Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getOrderColumn()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_OrderColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKey()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyClass <em>Map Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyClass()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyClass();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyTemporal <em>Map Key Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Temporal</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyTemporal()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_MapKeyTemporal();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Enumerated</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyEnumerated()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_MapKeyEnumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Attribute Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyAttributeOverride()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyAttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyConvert <em>Map Key Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Convert</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyConvert()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyConvert();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyColumn <em>Map Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyColumn()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyJoinColumn <em>Map Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyJoinColumn()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyForeignKey <em>Map Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMapKeyForeignKey()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_MapKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getJoinTable()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_JoinTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getCascade()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getAccess()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getFetch()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getMappedBy()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getName()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToMany#getTargetEntity()
	 * @see #getManyToMany()
	 * @generated
	 */
	EAttribute getManyToMany_TargetEntity();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To One</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne
	 * @generated
	 */
	EClass getManyToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getJoinColumn()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getForeignKey()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getJoinTable()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_JoinTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getCascade()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getAccess()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getFetch()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#isId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#isId()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getMapsId <em>Maps Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maps Id</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getMapsId()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_MapsId();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getName()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#isOptional()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ManyToOne#getTargetEntity()
	 * @see #getManyToOne()
	 * @generated
	 */
	EAttribute getManyToOne_TargetEntity();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKey
	 * @generated
	 */
	EClass getMapKey();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKey#getName()
	 * @see #getMapKey()
	 * @generated
	 */
	EAttribute getMapKey_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyClass <em>Map Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyClass
	 * @generated
	 */
	EClass getMapKeyClass();

	/**
	 * Returns the meta object for the reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyClass#getClass_()
	 * @see #getMapKeyClass()
	 * @generated
	 */
	EReference getMapKeyClass_Class();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn <em>Map Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn
	 * @generated
	 */
	EClass getMapKeyColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getColumnDefinition()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#isInsertable()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getLength()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getName()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#isNullable()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getPrecision()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getScale()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#getTable()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#isUnique()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyColumn#isUpdatable()
	 * @see #getMapKeyColumn()
	 * @generated
	 */
	EAttribute getMapKeyColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn <em>Map Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Key Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn
	 * @generated
	 */
	EClass getMapKeyJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#getColumnDefinition()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#isInsertable()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#getName()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#isNullable()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#getReferencedColumnName()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_ReferencedColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#getTable()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#isUnique()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Unique();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MapKeyJoinColumn#isUpdatable()
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 */
	EAttribute getMapKeyJoinColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass <em>Mapped Superclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Superclass</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass
	 * @generated
	 */
	EClass getMappedSuperclass();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getDescription()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getIdClass <em>Id Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getIdClass()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_IdClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Default Listeners</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getExcludeDefaultListeners()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_ExcludeDefaultListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude Superclass Listeners</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getExcludeSuperclassListeners()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_ExcludeSuperclassListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getEntityListeners()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_EntityListeners();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Persist</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPrePersist()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PrePersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Persist</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPostPersist()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostPersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Remove</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPreRemove()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PreRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Remove</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPostRemove()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostRemove();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Update</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPreUpdate()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PreUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Update</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPostUpdate()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostUpdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Load</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getPostLoad()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_PostLoad();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getAttributes()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getAccess()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_Access();

	/**
	 * Returns the meta object for the reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#getClass_()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EReference getMappedSuperclass_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#isMetadataComplete <em>Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata Complete</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.MappedSuperclass#isMetadataComplete()
	 * @see #getMappedSuperclass()
	 * @generated
	 */
	EAttribute getMappedSuperclass_MetadataComplete();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedAttributeNode <em>Named Attribute Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Attribute Node</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedAttributeNode
	 * @generated
	 */
	EClass getNamedAttributeNode();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedAttributeNode#getKeySubgraph <em>Key Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Subgraph</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedAttributeNode#getKeySubgraph()
	 * @see #getNamedAttributeNode()
	 * @generated
	 */
	EAttribute getNamedAttributeNode_KeySubgraph();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedAttributeNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedAttributeNode#getName()
	 * @see #getNamedAttributeNode()
	 * @generated
	 */
	EAttribute getNamedAttributeNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedAttributeNode#getSubgraph <em>Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subgraph</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedAttributeNode#getSubgraph()
	 * @see #getNamedAttributeNode()
	 * @generated
	 */
	EAttribute getNamedAttributeNode_Subgraph();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph <em>Named Entity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity Graph</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph
	 * @generated
	 */
	EClass getNamedEntityGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph#getNamedAttributeNode <em>Named Attribute Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Attribute Node</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph#getNamedAttributeNode()
	 * @see #getNamedEntityGraph()
	 * @generated
	 */
	EReference getNamedEntityGraph_NamedAttributeNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph#getSubgraph <em>Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgraph</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph#getSubgraph()
	 * @see #getNamedEntityGraph()
	 * @generated
	 */
	EReference getNamedEntityGraph_Subgraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph#getSubclassSubgraph <em>Subclass Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subclass Subgraph</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph#getSubclassSubgraph()
	 * @see #getNamedEntityGraph()
	 * @generated
	 */
	EReference getNamedEntityGraph_SubclassSubgraph();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph#isIncludeAllAttributes <em>Include All Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include All Attributes</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph#isIncludeAllAttributes()
	 * @see #getNamedEntityGraph()
	 * @generated
	 */
	EAttribute getNamedEntityGraph_IncludeAllAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedEntityGraph#getName()
	 * @see #getNamedEntityGraph()
	 * @generated
	 */
	EAttribute getNamedEntityGraph_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery <em>Named Native Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Native Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery
	 * @generated
	 */
	EClass getNamedNativeQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getDescription()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getQuery()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hint</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getHint()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EReference getNamedNativeQuery_Hint();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getName()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getResultClass <em>Result Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getResultClass()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_ResultClass();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getResultSetMapping <em>Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Set Mapping</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedNativeQuery#getResultSetMapping()
	 * @see #getNamedNativeQuery()
	 * @generated
	 */
	EAttribute getNamedNativeQuery_ResultSetMapping();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery <em>Named Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery
	 * @generated
	 */
	EClass getNamedQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery#getDescription()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery#getQuery()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Query();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery#getLockMode <em>Lock Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Mode</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery#getLockMode()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_LockMode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hint</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery#getHint()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EReference getNamedQuery_Hint();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedQuery#getName()
	 * @see #getNamedQuery()
	 * @generated
	 */
	EAttribute getNamedQuery_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Stored Procedure Query</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery
	 * @generated
	 */
	EClass getNamedStoredProcedureQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getDescription()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EAttribute getNamedStoredProcedureQuery_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getParameter()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EReference getNamedStoredProcedureQuery_Parameter();

	/**
	 * Returns the meta object for the attribute list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getResultClass <em>Result Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Result Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getResultClass()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EAttribute getNamedStoredProcedureQuery_ResultClass();

	/**
	 * Returns the meta object for the attribute list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getResultSetMapping <em>Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Result Set Mapping</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getResultSetMapping()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EAttribute getNamedStoredProcedureQuery_ResultSetMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hint</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getHint()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EReference getNamedStoredProcedureQuery_Hint();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getName()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EAttribute getNamedStoredProcedureQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getProcedureName <em>Procedure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procedure Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedStoredProcedureQuery#getProcedureName()
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 */
	EAttribute getNamedStoredProcedureQuery_ProcedureName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedSubgraph <em>Named Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Subgraph</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedSubgraph
	 * @generated
	 */
	EClass getNamedSubgraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedSubgraph#getNamedAttributeNode <em>Named Attribute Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Attribute Node</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedSubgraph#getNamedAttributeNode()
	 * @see #getNamedSubgraph()
	 * @generated
	 */
	EReference getNamedSubgraph_NamedAttributeNode();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedSubgraph#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedSubgraph#getClass_()
	 * @see #getNamedSubgraph()
	 * @generated
	 */
	EAttribute getNamedSubgraph_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.NamedSubgraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.NamedSubgraph#getName()
	 * @see #getNamedSubgraph()
	 * @generated
	 */
	EAttribute getNamedSubgraph_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Many</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany
	 * @generated
	 */
	EClass getOneToMany();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getOrderBy()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_OrderBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getOrderColumn <em>Order Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getOrderColumn()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_OrderColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKey()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyClass <em>Map Key Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyClass()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyClass();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyTemporal <em>Map Key Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Temporal</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyTemporal()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_MapKeyTemporal();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key Enumerated</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyEnumerated()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_MapKeyEnumerated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Attribute Override</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyAttributeOverride()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyAttributeOverride();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyConvert <em>Map Key Convert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Convert</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyConvert()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyConvert();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyColumn <em>Map Key Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyColumn()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyJoinColumn <em>Map Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Key Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyJoinColumn()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyForeignKey <em>Map Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Key Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMapKeyForeignKey()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_MapKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getJoinTable()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_JoinTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getJoinColumn()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getForeignKey()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getCascade()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getAccess()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getFetch()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getMappedBy()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getName()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#isOrphanRemoval <em>Orphan Removal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orphan Removal</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#isOrphanRemoval()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_OrphanRemoval();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToMany#getTargetEntity()
	 * @see #getOneToMany()
	 * @generated
	 */
	EAttribute getOneToMany_TargetEntity();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To One</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne
	 * @generated
	 */
	EClass getOneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getPrimaryKeyJoinColumn()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_PrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getPrimaryKeyForeignKey <em>Primary Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getPrimaryKeyForeignKey()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_PrimaryKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getJoinColumn <em>Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getJoinColumn()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_JoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getForeignKey()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getJoinTable <em>Join Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getJoinTable()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_JoinTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getCascade()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getAccess()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getFetch()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Fetch();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#isId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#isId()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getMappedBy()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getMapsId <em>Maps Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maps Id</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getMapsId()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_MapsId();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getName()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#isOptional()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#isOrphanRemoval <em>Orphan Removal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orphan Removal</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#isOrphanRemoval()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_OrphanRemoval();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getTargetEntity <em>Target Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Entity</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OneToOne#getTargetEntity()
	 * @see #getOneToOne()
	 * @generated
	 */
	EAttribute getOneToOne_TargetEntity();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn <em>Order Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn
	 * @generated
	 */
	EClass getOrderColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn#getColumnDefinition()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn#isInsertable <em>Insertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn#isInsertable()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_Insertable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn#getName()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn#isNullable()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn#isUpdatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatable</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.OrderColumn#isUpdatable()
	 * @see #getOrderColumn()
	 * @generated
	 */
	EAttribute getOrderColumn_Updatable();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults <em>Persistence Unit Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit Defaults</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults
	 * @generated
	 */
	EClass getPersistenceUnitDefaults();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getDescription()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getSchema()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getCatalog()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Catalog();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getDelimitedIdentifiers <em>Delimited Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delimited Identifiers</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getDelimitedIdentifiers()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EReference getPersistenceUnitDefaults_DelimitedIdentifiers();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getAccess()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EAttribute getPersistenceUnitDefaults_Access();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getCascadePersist <em>Cascade Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cascade Persist</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getCascadePersist()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EReference getPersistenceUnitDefaults_CascadePersist();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getEntityListeners <em>Entity Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitDefaults#getEntityListeners()
	 * @see #getPersistenceUnitDefaults()
	 * @generated
	 */
	EReference getPersistenceUnitDefaults_EntityListeners();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Unit Metadata</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitMetadata
	 * @generated
	 */
	EClass getPersistenceUnitMetadata();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitMetadata#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitMetadata#getDescription()
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 */
	EAttribute getPersistenceUnitMetadata_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitMetadata#getXmlMappingMetadataComplete <em>Xml Mapping Metadata Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml Mapping Metadata Complete</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitMetadata#getXmlMappingMetadataComplete()
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 */
	EReference getPersistenceUnitMetadata_XmlMappingMetadataComplete();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitMetadata#getPersistenceUnitDefaults <em>Persistence Unit Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence Unit Defaults</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PersistenceUnitMetadata#getPersistenceUnitDefaults()
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 */
	EReference getPersistenceUnitMetadata_PersistenceUnitDefaults();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostLoad <em>Post Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Load</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostLoad
	 * @generated
	 */
	EClass getPostLoad();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostLoad#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostLoad#getDescription()
	 * @see #getPostLoad()
	 * @generated
	 */
	EAttribute getPostLoad_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostLoad#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostLoad#getMethodName()
	 * @see #getPostLoad()
	 * @generated
	 */
	EAttribute getPostLoad_MethodName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostPersist <em>Post Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Persist</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostPersist
	 * @generated
	 */
	EClass getPostPersist();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostPersist#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostPersist#getDescription()
	 * @see #getPostPersist()
	 * @generated
	 */
	EAttribute getPostPersist_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostPersist#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostPersist#getMethodName()
	 * @see #getPostPersist()
	 * @generated
	 */
	EAttribute getPostPersist_MethodName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostRemove <em>Post Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Remove</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostRemove
	 * @generated
	 */
	EClass getPostRemove();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostRemove#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostRemove#getDescription()
	 * @see #getPostRemove()
	 * @generated
	 */
	EAttribute getPostRemove_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostRemove#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostRemove#getMethodName()
	 * @see #getPostRemove()
	 * @generated
	 */
	EAttribute getPostRemove_MethodName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostUpdate <em>Post Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Update</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostUpdate
	 * @generated
	 */
	EClass getPostUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostUpdate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostUpdate#getDescription()
	 * @see #getPostUpdate()
	 * @generated
	 */
	EAttribute getPostUpdate_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PostUpdate#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PostUpdate#getMethodName()
	 * @see #getPostUpdate()
	 * @generated
	 */
	EAttribute getPostUpdate_MethodName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PrePersist <em>Pre Persist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Persist</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PrePersist
	 * @generated
	 */
	EClass getPrePersist();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PrePersist#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PrePersist#getDescription()
	 * @see #getPrePersist()
	 * @generated
	 */
	EAttribute getPrePersist_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PrePersist#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PrePersist#getMethodName()
	 * @see #getPrePersist()
	 * @generated
	 */
	EAttribute getPrePersist_MethodName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PreRemove <em>Pre Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Remove</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PreRemove
	 * @generated
	 */
	EClass getPreRemove();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PreRemove#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PreRemove#getDescription()
	 * @see #getPreRemove()
	 * @generated
	 */
	EAttribute getPreRemove_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PreRemove#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PreRemove#getMethodName()
	 * @see #getPreRemove()
	 * @generated
	 */
	EAttribute getPreRemove_MethodName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PreUpdate <em>Pre Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Update</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PreUpdate
	 * @generated
	 */
	EClass getPreUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PreUpdate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PreUpdate#getDescription()
	 * @see #getPreUpdate()
	 * @generated
	 */
	EAttribute getPreUpdate_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PreUpdate#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PreUpdate#getMethodName()
	 * @see #getPreUpdate()
	 * @generated
	 */
	EAttribute getPreUpdate_MethodName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PrimaryKeyJoinColumn
	 * @generated
	 */
	EClass getPrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PrimaryKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Definition</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PrimaryKeyJoinColumn#getColumnDefinition()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_ColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PrimaryKeyJoinColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PrimaryKeyJoinColumn#getName()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.PrimaryKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.PrimaryKeyJoinColumn#getReferencedColumnName()
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 */
	EAttribute getPrimaryKeyJoinColumn_ReferencedColumnName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.QueryHint <em>Query Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Hint</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.QueryHint
	 * @generated
	 */
	EClass getQueryHint();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.QueryHint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.QueryHint#getDescription()
	 * @see #getQueryHint()
	 * @generated
	 */
	EAttribute getQueryHint_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.QueryHint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.QueryHint#getName()
	 * @see #getQueryHint()
	 * @generated
	 */
	EAttribute getQueryHint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.QueryHint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.QueryHint#getValue()
	 * @see #getQueryHint()
	 * @generated
	 */
	EAttribute getQueryHint_Value();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable <em>Secondary Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable
	 * @generated
	 */
	EClass getSecondaryTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getPrimaryKeyJoinColumn()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_PrimaryKeyJoinColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getPrimaryKeyForeignKey <em>Primary Key Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Key Foreign Key</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getPrimaryKeyForeignKey()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_PrimaryKeyForeignKey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getUniqueConstraint()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getIndex()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EReference getSecondaryTable_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getCatalog()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getName()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SecondaryTable#getSchema()
	 * @see #getSecondaryTable()
	 * @generated
	 */
	EAttribute getSecondaryTable_Schema();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator <em>Sequence Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Generator</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator
	 * @generated
	 */
	EClass getSequenceGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getDescription()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getAllocationSize <em>Allocation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Size</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getAllocationSize()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_AllocationSize();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getCatalog()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getInitialValue()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getName()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getSchema()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SequenceGenerator#getSequenceName()
	 * @see #getSequenceGenerator()
	 * @generated
	 */
	EAttribute getSequenceGenerator_SequenceName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Result Set Mapping</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping
	 * @generated
	 */
	EClass getSqlResultSetMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping#getDescription()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EAttribute getSqlResultSetMapping_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping#getEntityResult <em>Entity Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Result</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping#getEntityResult()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EReference getSqlResultSetMapping_EntityResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping#getConstructorResult <em>Constructor Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructor Result</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping#getConstructorResult()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EReference getSqlResultSetMapping_ConstructorResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping#getColumnResult <em>Column Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Result</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping#getColumnResult()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EReference getSqlResultSetMapping_ColumnResult();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.SqlResultSetMapping#getName()
	 * @see #getSqlResultSetMapping()
	 * @generated
	 */
	EAttribute getSqlResultSetMapping_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.StoredProcedureParameter <em>Stored Procedure Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored Procedure Parameter</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.StoredProcedureParameter
	 * @generated
	 */
	EClass getStoredProcedureParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.StoredProcedureParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.StoredProcedureParameter#getDescription()
	 * @see #getStoredProcedureParameter()
	 * @generated
	 */
	EAttribute getStoredProcedureParameter_Description();

	/**
	 * Returns the meta object for the reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.StoredProcedureParameter#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.StoredProcedureParameter#getClass_()
	 * @see #getStoredProcedureParameter()
	 * @generated
	 */
	EReference getStoredProcedureParameter_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.StoredProcedureParameter#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.StoredProcedureParameter#getMode()
	 * @see #getStoredProcedureParameter()
	 * @generated
	 */
	EAttribute getStoredProcedureParameter_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.StoredProcedureParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.StoredProcedureParameter#getName()
	 * @see #getStoredProcedureParameter()
	 * @generated
	 */
	EAttribute getStoredProcedureParameter_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Table#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Table#getUniqueConstraint()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Table#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Table#getIndex()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Table#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Table#getCatalog()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Table#getSchema()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Schema();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator <em>Table Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Generator</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator
	 * @generated
	 */
	EClass getTableGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getDescription()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getUniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getUniqueConstraint()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EReference getTableGenerator_UniqueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getIndex()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EReference getTableGenerator_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getAllocationSize <em>Allocation Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Size</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getAllocationSize()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_AllocationSize();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getCatalog()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getInitialValue()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getPkColumnName <em>Pk Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Column Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getPkColumnName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_PkColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getPkColumnValue <em>Pk Column Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Column Value</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getPkColumnValue()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_PkColumnValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getSchema()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Schema();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getTable()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getValueColumnName <em>Value Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Column Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TableGenerator#getValueColumnName()
	 * @see #getTableGenerator()
	 * @generated
	 */
	EAttribute getTableGenerator_ValueColumnName();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Transient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Transient
	 * @generated
	 */
	EClass getTransient();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Transient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Transient#getName()
	 * @see #getTransient()
	 * @generated
	 */
	EAttribute getTransient_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link org.gecko.emf.persistence.jpa.model.emfmapping.UniqueConstraint#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.UniqueConstraint#getColumnName()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.UniqueConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.UniqueConstraint#getName()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_Name();

	/**
	 * Returns the meta object for class '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Version#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Version#getColumn()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Column();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Version#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Version#getTemporal()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Temporal();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Version#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Version#getAccess()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Access();

	/**
	 * Returns the meta object for the attribute '{@link org.gecko.emf.persistence.jpa.model.emfmapping.Version#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.Version#getName()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Name();

	/**
	 * Returns the meta object for enum '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ConstraintMode <em>Constraint Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Mode</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ConstraintMode
	 * @generated
	 */
	EEnum getConstraintMode();

	/**
	 * Returns the meta object for enum '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorType <em>Discriminator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Discriminator Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorType
	 * @generated
	 */
	EEnum getDiscriminatorType();

	/**
	 * Returns the meta object for enum '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EnumType
	 * @generated
	 */
	EEnum getEnumType();

	/**
	 * Returns the meta object for enum '{@link org.gecko.emf.persistence.jpa.model.emfmapping.FetchType <em>Fetch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.FetchType
	 * @generated
	 */
	EEnum getFetchType();

	/**
	 * Returns the meta object for enum '{@link org.gecko.emf.persistence.jpa.model.emfmapping.GenerationType <em>Generation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Generation Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.GenerationType
	 * @generated
	 */
	EEnum getGenerationType();

	/**
	 * Returns the meta object for enum '{@link org.gecko.emf.persistence.jpa.model.emfmapping.InheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.InheritanceType
	 * @generated
	 */
	EEnum getInheritanceType();

	/**
	 * Returns the meta object for enum '{@link org.gecko.emf.persistence.jpa.model.emfmapping.LockModeType <em>Lock Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lock Mode Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.LockModeType
	 * @generated
	 */
	EEnum getLockModeType();

	/**
	 * Returns the meta object for enum '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ParameterMode <em>Parameter Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Mode</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ParameterMode
	 * @generated
	 */
	EEnum getParameterMode();

	/**
	 * Returns the meta object for enum '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType <em>Temporal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Type</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType
	 * @generated
	 */
	EEnum getTemporalType();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.AccessType <em>Access Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Type Object</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.AccessType
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.AccessType"
	 *        extendedMetaData="name='access-type:Object' baseType='access-type'"
	 * @generated
	 */
	EDataType getAccessTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ConstraintMode <em>Constraint Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Constraint Mode Object</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ConstraintMode
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.ConstraintMode"
	 *        extendedMetaData="name='constraint-mode:Object' baseType='constraint-mode'"
	 * @generated
	 */
	EDataType getConstraintModeObject();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorType <em>Discriminator Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Discriminator Type Object</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorType
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.DiscriminatorType"
	 *        extendedMetaData="name='discriminator-type:Object' baseType='discriminator-type'"
	 * @generated
	 */
	EDataType getDiscriminatorTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Discriminator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 
     *         @Target({TYPE}) @Retention(RUNTIME)
     *         public @interface DiscriminatorValue {
     *           String value();
     *         }
     * 
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Discriminator Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='discriminator-value' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDiscriminatorValue();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EnumType <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 
     *         @Target({METHOD, FIELD}) @Retention(RUNTIME)
     *         public @interface Enumerated {
     *           EnumType value() default ORDINAL;
     *         }
     * 
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Enumerated</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EnumType
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.EnumType"
	 *        extendedMetaData="name='enumerated' baseType='enum-type'"
	 * @generated
	 */
	EDataType getEnumerated();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.EnumType <em>Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enum Type Object</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.EnumType
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.EnumType"
	 *        extendedMetaData="name='enum-type:Object' baseType='enum-type'"
	 * @generated
	 */
	EDataType getEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.FetchType <em>Fetch Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fetch Type Object</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.FetchType
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.FetchType"
	 *        extendedMetaData="name='fetch-type:Object' baseType='fetch-type'"
	 * @generated
	 */
	EDataType getFetchTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.GenerationType <em>Generation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Generation Type Object</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.GenerationType
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.GenerationType"
	 *        extendedMetaData="name='generation-type:Object' baseType='generation-type'"
	 * @generated
	 */
	EDataType getGenerationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.InheritanceType <em>Inheritance Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Inheritance Type Object</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.InheritanceType
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.InheritanceType"
	 *        extendedMetaData="name='inheritance-type:Object' baseType='inheritance-type'"
	 * @generated
	 */
	EDataType getInheritanceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.LockModeType <em>Lock Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lock Mode Type Object</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.LockModeType
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.LockModeType"
	 *        extendedMetaData="name='lock-mode-type:Object' baseType='lock-mode-type'"
	 * @generated
	 */
	EDataType getLockModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 
     *         @Target({METHOD, FIELD}) @Retention(RUNTIME)
     *         public @interface OrderBy {
     *           String value() default "";
     *         }
     * 
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Order By</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='order-by' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getOrderBy();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.ParameterMode <em>Parameter Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parameter Mode Object</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.ParameterMode
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.ParameterMode"
	 *        extendedMetaData="name='parameter-mode:Object' baseType='parameter-mode'"
	 * @generated
	 */
	EDataType getParameterModeObject();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 
     *         @Target({METHOD, FIELD}) @Retention(RUNTIME)
     *         public @interface Temporal {
     *           TemporalType value();
     *         }
     * 
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Temporal</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType"
	 *        extendedMetaData="name='temporal' baseType='temporal-type'"
	 * @generated
	 */
	EDataType getTemporal();

	/**
	 * Returns the meta object for data type '{@link org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType <em>Temporal Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Temporal Type Object</em>'.
	 * @see org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType
	 * @model instanceClass="org.gecko.emf.persistence.jpa.model.emfmapping.TemporalType"
	 *        extendedMetaData="name='temporal-type:Object' baseType='temporal-type'"
	 * @generated
	 */
	EDataType getTemporalTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='versionType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[0-9]+(\\.[0-9]+)*'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmfmappingFactory getEmfmappingFactory();

} //EmfmappingPackage
