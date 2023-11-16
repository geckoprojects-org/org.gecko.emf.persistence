/*
 * Copyright (c) 2012 - 2022
 */
package ;

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
 * @see .OrmFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
public interface OrmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "null";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "null";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrmPackage eINSTANCE = .impl.OrmPackageImpl.init();

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 10;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 11;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 4;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 7;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 8;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 9;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 10;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 11;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 12;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 13;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 10;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 11;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 12;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 13;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 14;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 15;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 16;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 17;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 18;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 19;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 20;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 21;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 22;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 14;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 15;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 16;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 17;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 18;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 19;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 10;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 11;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 12;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 13;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 14;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 15;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 16;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 17;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 18;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 19;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 20;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 21;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 22;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 23;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 24;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 25;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 26;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 27;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 28;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 29;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 30;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 31;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 32;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 33;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 34;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 35;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 20;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 21;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 22;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 10;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 11;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 12;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 13;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 14;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 15;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 16;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 23;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 24;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 25;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 26;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 27;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 28;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 29;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 30;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 31;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 32;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 33;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 34;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 10;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 11;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 12;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 13;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 14;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 15;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 16;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 17;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 35;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 10;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 36;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 37;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 38;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 39;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 40;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 10;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 11;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 12;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 13;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 14;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 15;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 41;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 42;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 43;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 44;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 45;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 46;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 47;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 10;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 11;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 12;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 13;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 14;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 15;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 16;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 17;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 18;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 19;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 20;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 48;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 10;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 11;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 12;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 13;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 14;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 49;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 50;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 51;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 52;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 53;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 54;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 55;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 56;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 57;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 58;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 59;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 60;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 61;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 62;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 63;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 64;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 65;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 66;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 4;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 5;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 6;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 7;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 8;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 9;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 10;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 11;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 67;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 68;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link .impl.Impl <em>Orm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .impl.Impl
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 69;

	/**
	 * The feature id for the '<em><b></b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 0;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 1;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 2;

	/**
	 * The feature id for the '<em><b></b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ = 3;

	/**
	 * The number of structural features of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Orm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link . <em>Orm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 70;

	/**
	 * The meta object id for the '{@link . <em>Orm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 71;

	/**
	 * The meta object id for the '{@link . <em>Orm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 72;

	/**
	 * The meta object id for the '{@link . <em>Orm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 73;

	/**
	 * The meta object id for the '{@link . <em>Orm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 74;

	/**
	 * The meta object id for the '{@link . <em>Orm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 75;

	/**
	 * The meta object id for the '{@link . <em>Orm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 76;

	/**
	 * The meta object id for the '{@link . <em>Orm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 77;

	/**
	 * The meta object id for the '{@link . <em>Orm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 78;

	/**
	 * The meta object id for the '{@link . <em>Orm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see .
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 79;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 80;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 81;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 82;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 83;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 84;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 85;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 86;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 87;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 88;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 89;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 90;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 91;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 92;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 93;

	/**
	 * The meta object id for the '<em>Orm</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see 
	 * @see .impl.OrmPackageImpl#getnull()
	 * @generated
	 */
	int ORM = 94;


	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for class '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EClass getnull();

	/**
	 * Returns the meta object for the reference '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EReference get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for the attribute '{@link .#get <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em></em>'.
	 * @see .#get()
	 * @see #getnull()
	 * @generated
	 */
	EAttribute get_();

	/**
	 * Returns the meta object for enum '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EEnum getnull();

	/**
	 * Returns the meta object for enum '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EEnum getnull();

	/**
	 * Returns the meta object for enum '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EEnum getnull();

	/**
	 * Returns the meta object for enum '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EEnum getnull();

	/**
	 * Returns the meta object for enum '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EEnum getnull();

	/**
	 * Returns the meta object for enum '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EEnum getnull();

	/**
	 * Returns the meta object for enum '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EEnum getnull();

	/**
	 * Returns the meta object for enum '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EEnum getnull();

	/**
	 * Returns the meta object for enum '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EEnum getnull();

	/**
	 * Returns the meta object for enum '{@link . <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orm</em>'.
	 * @see .
	 * @generated
	 */
	EEnum getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the meta object for data type '{@link  <em>Orm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orm</em>'.
	 * @see 
	 * @model
	 * @generated
	 */
	EDataType getnull();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrmFactory getOrmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link .impl.Impl <em>Orm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .impl.Impl
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em><b></b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '<em><b></b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM__ = eINSTANCE.get_();

		/**
		 * The meta object literal for the '{@link . <em>Orm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EEnum ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link . <em>Orm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EEnum ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link . <em>Orm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EEnum ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link . <em>Orm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EEnum ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link . <em>Orm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EEnum ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link . <em>Orm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EEnum ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link . <em>Orm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EEnum ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link . <em>Orm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EEnum ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link . <em>Orm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EEnum ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '{@link . <em>Orm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see .
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EEnum ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

		/**
		 * The meta object literal for the '<em>Orm</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see 
		 * @see .impl.OrmPackageImpl#getnull()
		 * @generated
		 */
		EDataType ORM = eINSTANCE.getnull();

	}

} //OrmPackage
