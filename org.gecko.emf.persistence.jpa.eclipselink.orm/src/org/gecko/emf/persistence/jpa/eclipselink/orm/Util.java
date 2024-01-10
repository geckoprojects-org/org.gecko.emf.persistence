package org.gecko.emf.persistence.jpa.eclipselink.orm;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;

public class Util {
	public static Class convType(EAttribute eAttribute) {
		EClassifier eClassifier = eAttribute.getEType();
		if (eClassifier == EcorePackage.Literals.ESTRING) {
			return String.class;
		} else if (eClassifier == EcorePackage.Literals.EINTEGER_OBJECT) {
			return Integer.class;
		} else if (eClassifier == EcorePackage.Literals.EINT) {
			return int.class;
		} else if (eClassifier == EcorePackage.Literals.EDATE) {
			return Date.class;
		} else if (eClassifier == EcorePackage.Literals.EBIG_DECIMAL) {
			return BigDecimal.class;
		} else if (eClassifier == EcorePackage.Literals.EBOOLEAN) {
			return boolean.class;
		} else if (eClassifier == EcorePackage.Literals.EBOOLEAN_OBJECT) {
			return Boolean.class;
		} else if (eClassifier == EcorePackage.Literals.EBYTE) {
			return byte.class;
		} else if (eClassifier == EcorePackage.Literals.EBYTE_OBJECT) {
			return Byte.class;
		} else if (eClassifier == EcorePackage.Literals.ECHAR) {
			return char.class;
		} else if (eClassifier == EcorePackage.Literals.ECHARACTER_OBJECT) {
			return Character.class;
		} else if (eClassifier == EcorePackage.Literals.ECLASS) {
			return Class.class;
		} else if (eClassifier == EcorePackage.Literals.EDOUBLE) {
			return double.class;
		} else if (eClassifier == EcorePackage.Literals.EDOUBLE_OBJECT) {
			return Double.class;
		} else if (eClassifier == EcorePackage.Literals.EE_LIST) {
			return List.class;
		} else if (eClassifier == EcorePackage.Literals.EFLOAT) {
			return float.class;
		} else if (eClassifier == EcorePackage.Literals.EFLOAT_OBJECT) {
			return Float.class;
		} else if (eClassifier == EcorePackage.Literals.ELONG) {
			return long.class;
		} else if (eClassifier == EcorePackage.Literals.ELONG_OBJECT) {
			return Long.class;
		} else if (eClassifier == EcorePackage.Literals.ESHORT) {
			return short.class;
		} else if (eClassifier == EcorePackage.Literals.ESHORT_OBJECT) {
			return Short.class;
		}
		return String.class;
	}

}