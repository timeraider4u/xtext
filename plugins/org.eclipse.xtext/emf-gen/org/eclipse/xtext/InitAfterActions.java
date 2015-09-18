/**
 */
package org.eclipse.xtext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init After Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.InitAfterActions#getInitAction <em>Init Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.InitAfterActions#getAfterAction <em>After Action</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.XtextPackage#getInitAfterActions()
 * @model
 * @generated
 * @since 3.0
 */
public interface InitAfterActions extends EObject {
	/**
	 * Returns the value of the '<em><b>Init Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Action</em>' attribute.
	 * @see #setInitAction(String)
	 * @see org.eclipse.xtext.XtextPackage#getInitAfterActions_InitAction()
	 * @model
	 * @generated
	 */
	String getInitAction();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.InitAfterActions#getInitAction <em>Init Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Action</em>' attribute.
	 * @see #getInitAction()
	 * @generated
	 */
	void setInitAction(String value);

	/**
	 * Returns the value of the '<em><b>After Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Action</em>' attribute.
	 * @see #setAfterAction(String)
	 * @see org.eclipse.xtext.XtextPackage#getInitAfterActions_AfterAction()
	 * @model
	 * @generated
	 */
	String getAfterAction();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.InitAfterActions#getAfterAction <em>After Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Action</em>' attribute.
	 * @see #getAfterAction()
	 * @generated
	 */
	void setAfterAction(String value);

} // InitAfterActions
