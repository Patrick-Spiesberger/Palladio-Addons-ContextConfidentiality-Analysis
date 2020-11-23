/**
 */
package org.palladiosimulator.pcm.confidentiality.context.analysis.outputmodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.palladiosimulator.pcm.confidentiality.context.analysis.outputmodel.OutputmodelPackage;
import org.palladiosimulator.pcm.confidentiality.context.analysis.outputmodel.ScenarioOutput;

import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;

import org.palladiosimulator.pcm.core.composition.Connector;

import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;

import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.analysis.outputmodel.impl.ScenarioOutputImpl#isResult <em>Result</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.analysis.outputmodel.impl.ScenarioOutputImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.analysis.outputmodel.impl.ScenarioOutputImpl#getOperationsignature <em>Operationsignature</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.analysis.outputmodel.impl.ScenarioOutputImpl#getOperationinterface <em>Operationinterface</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.analysis.outputmodel.impl.ScenarioOutputImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.analysis.outputmodel.impl.ScenarioOutputImpl#getRequestorSet <em>Requestor Set</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.analysis.outputmodel.impl.ScenarioOutputImpl#getRequiredSets <em>Required Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioOutputImpl extends CDOObjectImpl implements ScenarioOutput {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScenarioOutputImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return OutputmodelPackage.Literals.SCENARIO_OUTPUT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isResult() {
        return (Boolean) eGet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__RESULT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResult(boolean newResult) {
        eSet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__RESULT, newResult);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsageScenario getScenario() {
        return (UsageScenario) eGet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__SCENARIO, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScenario(UsageScenario newScenario) {
        eSet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__SCENARIO, newScenario);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationSignature getOperationsignature() {
        return (OperationSignature) eGet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__OPERATIONSIGNATURE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperationsignature(OperationSignature newOperationsignature) {
        eSet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__OPERATIONSIGNATURE, newOperationsignature);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationInterface getOperationinterface() {
        return (OperationInterface) eGet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__OPERATIONINTERFACE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperationinterface(OperationInterface newOperationinterface) {
        eSet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__OPERATIONINTERFACE, newOperationinterface);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connector getConnector() {
        return (Connector) eGet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__CONNECTOR, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnector(Connector newConnector) {
        eSet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__CONNECTOR, newConnector);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSet getRequestorSet() {
        return (ContextSet) eGet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__REQUESTOR_SET, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequestorSet(ContextSet newRequestorSet) {
        eSet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__REQUESTOR_SET, newRequestorSet);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<ContextSet> getRequiredSets() {
        return (EList<ContextSet>) eGet(OutputmodelPackage.Literals.SCENARIO_OUTPUT__REQUIRED_SETS, true);
    }

} //ScenarioOutputImpl
