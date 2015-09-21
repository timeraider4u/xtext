/**
 */
package org.eclipse.xtext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractTokenAntlrAction;
import org.eclipse.xtext.XtextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Token Antlr Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.impl.AbstractTokenAntlrActionImpl#getPreAction <em>Pre Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.AbstractTokenAntlrActionImpl#getPostAction <em>Post Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.AbstractTokenAntlrActionImpl#isIsSemanticPredicate2 <em>Is Semantic Predicate2</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.AbstractTokenAntlrActionImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 * @since 3.0
 */
public class AbstractTokenAntlrActionImpl extends CompoundElementImpl implements AbstractTokenAntlrAction {
	/**
	 * The default value of the '{@link #getPreAction() <em>Pre Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAction()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreAction() <em>Pre Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAction()
	 * @generated
	 * @ordered
	 */
	protected String preAction = PRE_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostAction() <em>Post Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostAction()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostAction() <em>Post Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostAction()
	 * @generated
	 * @ordered
	 */
	protected String postAction = POST_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSemanticPredicate2() <em>Is Semantic Predicate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSemanticPredicate2()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SEMANTIC_PREDICATE2_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSemanticPredicate2() <em>Is Semantic Predicate2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSemanticPredicate2()
	 * @generated
	 * @ordered
	 */
	protected boolean isSemanticPredicate2 = IS_SEMANTIC_PREDICATE2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractElement element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTokenAntlrActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextPackage.Literals.ABSTRACT_TOKEN_ANTLR_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreAction() {
		return preAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreAction(String newPreAction) {
		String oldPreAction = preAction;
		preAction = newPreAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__PRE_ACTION, oldPreAction, preAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostAction() {
		return postAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostAction(String newPostAction) {
		String oldPostAction = postAction;
		postAction = newPostAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__POST_ACTION, oldPostAction, postAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSemanticPredicate2() {
		return isSemanticPredicate2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSemanticPredicate2(boolean newIsSemanticPredicate2) {
		boolean oldIsSemanticPredicate2 = isSemanticPredicate2;
		isSemanticPredicate2 = newIsSemanticPredicate2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__IS_SEMANTIC_PREDICATE2, oldIsSemanticPredicate2, isSemanticPredicate2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElement getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(AbstractElement newElement, NotificationChain msgs) {
		AbstractElement oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(AbstractElement newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__ELEMENT:
				return basicSetElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__PRE_ACTION:
				return getPreAction();
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__POST_ACTION:
				return getPostAction();
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__IS_SEMANTIC_PREDICATE2:
				return isIsSemanticPredicate2();
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__ELEMENT:
				return getElement();
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
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__PRE_ACTION:
				setPreAction((String)newValue);
				return;
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__POST_ACTION:
				setPostAction((String)newValue);
				return;
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__IS_SEMANTIC_PREDICATE2:
				setIsSemanticPredicate2((Boolean)newValue);
				return;
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__ELEMENT:
				setElement((AbstractElement)newValue);
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
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__PRE_ACTION:
				setPreAction(PRE_ACTION_EDEFAULT);
				return;
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__POST_ACTION:
				setPostAction(POST_ACTION_EDEFAULT);
				return;
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__IS_SEMANTIC_PREDICATE2:
				setIsSemanticPredicate2(IS_SEMANTIC_PREDICATE2_EDEFAULT);
				return;
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__ELEMENT:
				setElement((AbstractElement)null);
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
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__PRE_ACTION:
				return PRE_ACTION_EDEFAULT == null ? preAction != null : !PRE_ACTION_EDEFAULT.equals(preAction);
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__POST_ACTION:
				return POST_ACTION_EDEFAULT == null ? postAction != null : !POST_ACTION_EDEFAULT.equals(postAction);
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__IS_SEMANTIC_PREDICATE2:
				return isSemanticPredicate2 != IS_SEMANTIC_PREDICATE2_EDEFAULT;
			case XtextPackage.ABSTRACT_TOKEN_ANTLR_ACTION__ELEMENT:
				return element != null;
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
		result.append(" (preAction: ");
		result.append(preAction);
		result.append(", postAction: ");
		result.append(postAction);
		result.append(", isSemanticPredicate2: ");
		result.append(isSemanticPredicate2);
		result.append(')');
		return result.toString();
	}

} //AbstractTokenAntlrActionImpl
