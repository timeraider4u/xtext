/**
 */
package org.eclipse.xtext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.AbstractElement#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipse.xtext.AbstractElement#isPredicated <em>Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.AbstractElement#isFirstSetPredicated <em>First Set Predicated</em>}</li>
 *   <li>{@link org.eclipse.xtext.AbstractElement#getPreAntlrAction <em>Pre Antlr Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.AbstractElement#getPostAntlrAction <em>Post Antlr Action</em>}</li>
 *   <li>{@link org.eclipse.xtext.AbstractElement#isIsSemanticPredicate <em>Is Semantic Predicate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.XtextPackage#getAbstractElement()
 * @model
 * @generated
 */
public interface AbstractElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see org.eclipse.xtext.XtextPackage#getAbstractElement_Cardinality()
	 * @model
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.AbstractElement#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicated</em>' attribute.
	 * @see #setPredicated(boolean)
	 * @see org.eclipse.xtext.XtextPackage#getAbstractElement_Predicated()
	 * @model
	 * @generated
	 */
	boolean isPredicated();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.AbstractElement#isPredicated <em>Predicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicated</em>' attribute.
	 * @see #isPredicated()
	 * @generated
	 */
	void setPredicated(boolean value);

	/**
	 * Returns the value of the '<em><b>First Set Predicated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Set Predicated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 2.6
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Set Predicated</em>' attribute.
	 * @see #setFirstSetPredicated(boolean)
	 * @see org.eclipse.xtext.XtextPackage#getAbstractElement_FirstSetPredicated()
	 * @model
	 * @generated
	 */
	boolean isFirstSetPredicated();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.AbstractElement#isFirstSetPredicated <em>First Set Predicated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 2.6
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Set Predicated</em>' attribute.
	 * @see #isFirstSetPredicated()
	 * @generated
	 */
	void setFirstSetPredicated(boolean value);

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
	 * @see org.eclipse.xtext.XtextPackage#getAbstractElement_PreAntlrAction()
	 * @model
	 * @generated
	 * @since 3.0
	 */
	String getPreAntlrAction();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.AbstractElement#getPreAntlrAction <em>Pre Antlr Action</em>}' attribute.
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
	 * @see org.eclipse.xtext.XtextPackage#getAbstractElement_PostAntlrAction()
	 * @model
	 * @generated
	 * @since 3.0
	 */
	String getPostAntlrAction();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.AbstractElement#getPostAntlrAction <em>Post Antlr Action</em>}' attribute.
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
	 * @see #setIsSemanticPredicate(boolean)
	 * @see org.eclipse.xtext.XtextPackage#getAbstractElement_IsSemanticPredicate()
	 * @model
	 * @generated
	 * @since 3.0
	 */
	boolean isIsSemanticPredicate();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.AbstractElement#isIsSemanticPredicate <em>Is Semantic Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Semantic Predicate</em>' attribute.
	 * @see #isIsSemanticPredicate()
	 * @generated
	 * @since 3.0
	 */
	void setIsSemanticPredicate(boolean value);

} // AbstractElement
