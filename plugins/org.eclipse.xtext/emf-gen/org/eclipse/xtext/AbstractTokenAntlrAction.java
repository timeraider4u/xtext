/**
 */
package org.eclipse.xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Token Antlr Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.AbstractTokenAntlrAction#getPreAction <em>Pre Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.AbstractTokenAntlrAction#getPostAction <em>Post Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.AbstractTokenAntlrAction#isIsSemanticPredicate <em>Is Semantic Predicate</em>}</li>
 *   <li>{@link org.eclipse.xtext.AbstractTokenAntlrAction#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.XtextPackage#getAbstractTokenAntlrAction()
 * @model
 * @generated
 * @since 3.0
 */
public interface AbstractTokenAntlrAction extends AbstractElement {
	/**
	 * Returns the value of the '<em><b>Pre Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Action</em>' attribute.
	 * @see #setPreAction(String)
	 * @see org.eclipse.xtext.XtextPackage#getAbstractTokenAntlrAction_PreAction()
	 * @model
	 * @generated
	 */
	String getPreAction();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.AbstractTokenAntlrAction#getPreAction <em>Pre Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Action</em>' attribute.
	 * @see #getPreAction()
	 * @generated
	 */
	void setPreAction(String value);

	/**
	 * Returns the value of the '<em><b>Post Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Action</em>' attribute.
	 * @see #setPostAction(String)
	 * @see org.eclipse.xtext.XtextPackage#getAbstractTokenAntlrAction_PostAction()
	 * @model
	 * @generated
	 */
	String getPostAction();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.AbstractTokenAntlrAction#getPostAction <em>Post Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Action</em>' attribute.
	 * @see #getPostAction()
	 * @generated
	 */
	void setPostAction(String value);

	/**
	 * Returns the value of the '<em><b>Is Semantic Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Semantic Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Semantic Predicate</em>' attribute.
	 * @see #setIsSemanticPredicate(boolean)
	 * @see org.eclipse.xtext.XtextPackage#getAbstractTokenAntlrAction_IsSemanticPredicate()
	 * @model
	 * @generated
	 */
	boolean isIsSemanticPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.AbstractTokenAntlrAction#isIsSemanticPredicate <em>Is Semantic Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Semantic Predicate</em>' attribute.
	 * @see #isIsSemanticPredicate()
	 * @generated
	 */
	void setIsSemanticPredicate(boolean value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(AbstractElement)
	 * @see org.eclipse.xtext.XtextPackage#getAbstractTokenAntlrAction_Element()
	 * @model containment="true"
	 * @generated
	 */
	AbstractElement getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.AbstractTokenAntlrAction#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(AbstractElement value);

} // AbstractTokenAntlrAction
