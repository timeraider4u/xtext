/**
 */
package org.eclipse.xtext.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.XtextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.impl.TerminalRuleImpl#isFragment <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.TerminalRuleImpl#getPreAntlrAction <em>Pre Antlr Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.TerminalRuleImpl#getPostAntlrAction <em>Post Antlr Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.impl.TerminalRuleImpl#getIsSemanticPredicate <em>Is Semantic Predicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminalRuleImpl extends AbstractRuleImpl implements TerminalRule {
	/**
	 * The default value of the '{@link #isFragment() <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFragment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRAGMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFragment() <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFragment()
	 * @generated
	 * @ordered
	 */
	protected boolean fragment = FRAGMENT_EDEFAULT;

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
	 * The default value of the '{@link #getIsSemanticPredicate() <em>Is Semantic Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSemanticPredicate()
	 * @generated
	 * @ordered
	 * @since 3.0
	 */
	protected static final Boolean IS_SEMANTIC_PREDICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSemanticPredicate() <em>Is Semantic Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSemanticPredicate()
	 * @generated
	 * @ordered
	 * @since 3.0
	 */
	protected Boolean isSemanticPredicate = IS_SEMANTIC_PREDICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextPackage.Literals.TERMINAL_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFragment() {
		return fragment;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragment(boolean newFragment) {
		boolean oldFragment = fragment;
		fragment = newFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.TERMINAL_RULE__FRAGMENT, oldFragment, fragment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.TERMINAL_RULE__PRE_ANTLR_ACTION, oldPreAntlrAction, preAntlrAction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.TERMINAL_RULE__POST_ANTLR_ACTION, oldPostAntlrAction, postAntlrAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 3.0
	 */
	public Boolean getIsSemanticPredicate() {
		return isSemanticPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 3.0
	 */
	public void setIsSemanticPredicate(Boolean newIsSemanticPredicate) {
		Boolean oldIsSemanticPredicate = isSemanticPredicate;
		isSemanticPredicate = newIsSemanticPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.TERMINAL_RULE__IS_SEMANTIC_PREDICATE, oldIsSemanticPredicate, isSemanticPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XtextPackage.TERMINAL_RULE__FRAGMENT:
				return isFragment();
			case XtextPackage.TERMINAL_RULE__PRE_ANTLR_ACTION:
				return getPreAntlrAction();
			case XtextPackage.TERMINAL_RULE__POST_ANTLR_ACTION:
				return getPostAntlrAction();
			case XtextPackage.TERMINAL_RULE__IS_SEMANTIC_PREDICATE:
				return getIsSemanticPredicate();
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
			case XtextPackage.TERMINAL_RULE__FRAGMENT:
				setFragment((Boolean)newValue);
				return;
			case XtextPackage.TERMINAL_RULE__PRE_ANTLR_ACTION:
				setPreAntlrAction((String)newValue);
				return;
			case XtextPackage.TERMINAL_RULE__POST_ANTLR_ACTION:
				setPostAntlrAction((String)newValue);
				return;
			case XtextPackage.TERMINAL_RULE__IS_SEMANTIC_PREDICATE:
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
			case XtextPackage.TERMINAL_RULE__FRAGMENT:
				setFragment(FRAGMENT_EDEFAULT);
				return;
			case XtextPackage.TERMINAL_RULE__PRE_ANTLR_ACTION:
				setPreAntlrAction(PRE_ANTLR_ACTION_EDEFAULT);
				return;
			case XtextPackage.TERMINAL_RULE__POST_ANTLR_ACTION:
				setPostAntlrAction(POST_ANTLR_ACTION_EDEFAULT);
				return;
			case XtextPackage.TERMINAL_RULE__IS_SEMANTIC_PREDICATE:
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
			case XtextPackage.TERMINAL_RULE__FRAGMENT:
				return fragment != FRAGMENT_EDEFAULT;
			case XtextPackage.TERMINAL_RULE__PRE_ANTLR_ACTION:
				return PRE_ANTLR_ACTION_EDEFAULT == null ? preAntlrAction != null : !PRE_ANTLR_ACTION_EDEFAULT.equals(preAntlrAction);
			case XtextPackage.TERMINAL_RULE__POST_ANTLR_ACTION:
				return POST_ANTLR_ACTION_EDEFAULT == null ? postAntlrAction != null : !POST_ANTLR_ACTION_EDEFAULT.equals(postAntlrAction);
			case XtextPackage.TERMINAL_RULE__IS_SEMANTIC_PREDICATE:
				return IS_SEMANTIC_PREDICATE_EDEFAULT == null ? isSemanticPredicate != null : !IS_SEMANTIC_PREDICATE_EDEFAULT.equals(isSemanticPredicate);
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
		result.append(" (fragment: ");
		result.append(fragment);
		result.append(", preAntlrAction: ");
		result.append(preAntlrAction);
		result.append(", postAntlrAction: ");
		result.append(postAntlrAction);
		result.append(", isSemanticPredicate: ");
		result.append(isSemanticPredicate);
		result.append(')');
		return result.toString();
	}

} //TerminalRuleImpl
