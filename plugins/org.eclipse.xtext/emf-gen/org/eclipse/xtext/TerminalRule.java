/**
 */
package org.eclipse.xtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.TerminalRule#isFragment <em>Fragment</em>}</li>
 *   <li>{@link org.eclipse.xtext.TerminalRule#getPreAntlrAction <em>Pre Antlr Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.TerminalRule#getPostAntlrAction <em>Post Antlr Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.TerminalRule#getIsSemanticPredicate <em>Is Semantic Predicate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.XtextPackage#getTerminalRule()
 * @model
 * @generated
 */
public interface TerminalRule extends AbstractRule {
	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' attribute.
	 * @see #setFragment(boolean)
	 * @see org.eclipse.xtext.XtextPackage#getTerminalRule_Fragment()
	 * @model
	 * @generated
	 */
	boolean isFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.TerminalRule#isFragment <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' attribute.
	 * @see #isFragment()
	 * @generated
	 */
	void setFragment(boolean value);

	/**
	 * Returns the value of the '<em><b>Pre Antlr Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Antlr Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Antlr Action</em>' attribute.
	 * @see #setPreAntlrAction(String)
	 * @see org.eclipse.xtext.XtextPackage#getTerminalRule_PreAntlrAction()
	 * @model
	 * @generated
	 * @since 3.0
	 */
	String getPreAntlrAction();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.TerminalRule#getPreAntlrAction <em>Pre Antlr Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Antlr Action</em>' attribute.
	 * @see #getPreAntlrAction()
	 * @generated
	 * @since 3.0
	 */
	void setPreAntlrAction(String value);

	/**
	 * Returns the value of the '<em><b>Post Antlr Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Antlr Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Antlr Action</em>' attribute.
	 * @see #setPostAntlrAction(String)
	 * @see org.eclipse.xtext.XtextPackage#getTerminalRule_PostAntlrAction()
	 * @model
	 * @generated
	 * @since 3.0
	 */
	String getPostAntlrAction();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.TerminalRule#getPostAntlrAction <em>Post Antlr Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Antlr Action</em>' attribute.
	 * @see #getPostAntlrAction()
	 * @generated
	 * @since 3.0
	 */
	void setPostAntlrAction(String value);

	/**
	 * Returns the value of the '<em><b>Is Semantic Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Semantic Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Semantic Predicate</em>' attribute.
	 * @see #setIsSemanticPredicate(Boolean)
	 * @see org.eclipse.xtext.XtextPackage#getTerminalRule_IsSemanticPredicate()
	 * @model
	 * @generated
	 * @since 3.0
	 */
	Boolean getIsSemanticPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.TerminalRule#getIsSemanticPredicate <em>Is Semantic Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Semantic Predicate</em>' attribute.
	 * @see #getIsSemanticPredicate()
	 * @generated
	 * @since 3.0
	 */
	void setIsSemanticPredicate(Boolean value);

} // TerminalRule
