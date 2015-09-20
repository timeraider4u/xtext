/**
 */
package org.eclipse.xtext.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.XtextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.impl.AbstractElementImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.AbstractElementImpl#isPredicated <em>Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.AbstractElementImpl#isFirstSetPredicated <em>First Set Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.AbstractElementImpl#getPreAntlrAction <em>Pre Antlr Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.AbstractElementImpl#getPostAntlrAction <em>Post Antlr Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.AbstractElementImpl#isIsSemanticPredicate <em>Is Semantic Predicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractElementImpl extends MinimalEObjectImpl.Container implements AbstractElement {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPredicated() <em>Predicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredicated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREDICATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPredicated() <em>Predicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredicated()
	 * @generated
	 * @ordered
	 */
	protected boolean predicated = PREDICATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isFirstSetPredicated() <em>First Set Predicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.6
	 * <!-- end-user-doc -->
	 * @see #isFirstSetPredicated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIRST_SET_PREDICATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFirstSetPredicated() <em>First Set Predicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.6
	 * <!-- end-user-doc -->
	 * @see #isFirstSetPredicated()
	 * @generated
	 * @ordered
	 */
	protected boolean firstSetPredicated = FIRST_SET_PREDICATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreAntlrAction() <em>Pre Antlr Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAntlrAction()
	 * @generated
	 * @ordered
	 * @since 3.0
	 */
	protected static final String PRE_ANTLR_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreAntlrAction() <em>Pre Antlr Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAntlrAction()
	 * @generated
	 * @ordered
	 * @since 3.0
	 */
	protected String preAntlrAction = PRE_ANTLR_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostAntlrAction() <em>Post Antlr Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostAntlrAction()
	 * @generated
	 * @ordered
	 * @since 3.0
	 */
	protected static final String POST_ANTLR_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostAntlrAction() <em>Post Antlr Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostAntlrAction()
	 * @generated
	 * @ordered
	 * @since 3.0
	 */
	protected String postAntlrAction = POST_ANTLR_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSemanticPredicate() <em>Is Semantic Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSemanticPredicate()
	 * @generated
	 * @ordered
	 * @since 3.0
	 */
	protected static final boolean IS_SEMANTIC_PREDICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSemanticPredicate() <em>Is Semantic Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSemanticPredicate()
	 * @generated
	 * @ordered
	 * @since 3.0
	 */
	protected boolean isSemanticPredicate = IS_SEMANTIC_PREDICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextPackage.Literals.ABSTRACT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(String newCardinality) {
		String oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_ELEMENT__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPredicated() {
		return predicated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicated(boolean newPredicated) {
		boolean oldPredicated = predicated;
		predicated = newPredicated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_ELEMENT__PREDICATED, oldPredicated, predicated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.6
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFirstSetPredicated() {
		return firstSetPredicated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 2.6
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstSetPredicated(boolean newFirstSetPredicated) {
		boolean oldFirstSetPredicated = firstSetPredicated;
		firstSetPredicated = newFirstSetPredicated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_ELEMENT__FIRST_SET_PREDICATED, oldFirstSetPredicated, firstSetPredicated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 3.0
	 */
	public String getPreAntlrAction() {
		return preAntlrAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 3.0
	 */
	public void setPreAntlrAction(String newPreAntlrAction) {
		String oldPreAntlrAction = preAntlrAction;
		preAntlrAction = newPreAntlrAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_ELEMENT__PRE_ANTLR_ACTION, oldPreAntlrAction, preAntlrAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 3.0
	 */
	public String getPostAntlrAction() {
		return postAntlrAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 3.0
	 */
	public void setPostAntlrAction(String newPostAntlrAction) {
		String oldPostAntlrAction = postAntlrAction;
		postAntlrAction = newPostAntlrAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_ELEMENT__POST_ANTLR_ACTION, oldPostAntlrAction, postAntlrAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 3.0
	 */
	public boolean isIsSemanticPredicate() {
		return isSemanticPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 3.0
	 */
	public void setIsSemanticPredicate(boolean newIsSemanticPredicate) {
		boolean oldIsSemanticPredicate = isSemanticPredicate;
		isSemanticPredicate = newIsSemanticPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_ELEMENT__IS_SEMANTIC_PREDICATE, oldIsSemanticPredicate, isSemanticPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtextPackage.ABSTRACT_ELEMENT__CARDINALITY:
				return getCardinality();
			case XtextPackage.ABSTRACT_ELEMENT__PREDICATED:
				return isPredicated();
			case XtextPackage.ABSTRACT_ELEMENT__FIRST_SET_PREDICATED:
				return isFirstSetPredicated();
			case XtextPackage.ABSTRACT_ELEMENT__PRE_ANTLR_ACTION:
				return getPreAntlrAction();
			case XtextPackage.ABSTRACT_ELEMENT__POST_ANTLR_ACTION:
				return getPostAntlrAction();
			case XtextPackage.ABSTRACT_ELEMENT__IS_SEMANTIC_PREDICATE:
				return isIsSemanticPredicate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XtextPackage.ABSTRACT_ELEMENT__CARDINALITY:
				setCardinality((String)newValue);
				return;
			case XtextPackage.ABSTRACT_ELEMENT__PREDICATED:
				setPredicated((Boolean)newValue);
				return;
			case XtextPackage.ABSTRACT_ELEMENT__FIRST_SET_PREDICATED:
				setFirstSetPredicated((Boolean)newValue);
				return;
			case XtextPackage.ABSTRACT_ELEMENT__PRE_ANTLR_ACTION:
				setPreAntlrAction((String)newValue);
				return;
			case XtextPackage.ABSTRACT_ELEMENT__POST_ANTLR_ACTION:
				setPostAntlrAction((String)newValue);
				return;
			case XtextPackage.ABSTRACT_ELEMENT__IS_SEMANTIC_PREDICATE:
				setIsSemanticPredicate((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XtextPackage.ABSTRACT_ELEMENT__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case XtextPackage.ABSTRACT_ELEMENT__PREDICATED:
				setPredicated(PREDICATED_EDEFAULT);
				return;
			case XtextPackage.ABSTRACT_ELEMENT__FIRST_SET_PREDICATED:
				setFirstSetPredicated(FIRST_SET_PREDICATED_EDEFAULT);
				return;
			case XtextPackage.ABSTRACT_ELEMENT__PRE_ANTLR_ACTION:
				setPreAntlrAction(PRE_ANTLR_ACTION_EDEFAULT);
				return;
			case XtextPackage.ABSTRACT_ELEMENT__POST_ANTLR_ACTION:
				setPostAntlrAction(POST_ANTLR_ACTION_EDEFAULT);
				return;
			case XtextPackage.ABSTRACT_ELEMENT__IS_SEMANTIC_PREDICATE:
				setIsSemanticPredicate(IS_SEMANTIC_PREDICATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XtextPackage.ABSTRACT_ELEMENT__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case XtextPackage.ABSTRACT_ELEMENT__PREDICATED:
				return predicated != PREDICATED_EDEFAULT;
			case XtextPackage.ABSTRACT_ELEMENT__FIRST_SET_PREDICATED:
				return firstSetPredicated != FIRST_SET_PREDICATED_EDEFAULT;
			case XtextPackage.ABSTRACT_ELEMENT__PRE_ANTLR_ACTION:
				return PRE_ANTLR_ACTION_EDEFAULT == null ? preAntlrAction != null : !PRE_ANTLR_ACTION_EDEFAULT.equals(preAntlrAction);
			case XtextPackage.ABSTRACT_ELEMENT__POST_ANTLR_ACTION:
				return POST_ANTLR_ACTION_EDEFAULT == null ? postAntlrAction != null : !POST_ANTLR_ACTION_EDEFAULT.equals(postAntlrAction);
			case XtextPackage.ABSTRACT_ELEMENT__IS_SEMANTIC_PREDICATE:
				return isSemanticPredicate != IS_SEMANTIC_PREDICATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", predicated: ");
		result.append(predicated);
		result.append(", firstSetPredicated: ");
		result.append(firstSetPredicated);
		result.append(", preAntlrAction: ");
		result.append(preAntlrAction);
		result.append(", postAntlrAction: ");
		result.append(postAntlrAction);
		result.append(", isSemanticPredicate: ");
		result.append(isSemanticPredicate);
		result.append(')');
		return result.toString();
	}

} //AbstractElementImpl
