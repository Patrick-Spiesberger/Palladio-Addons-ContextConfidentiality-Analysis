package edu.kit.ipd.sdq.kamp4attack.core.changepropagation.attackhandlers;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.confidentiality.attacker.analysis.common.data.DataHandlerAttacker;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.attackSpecification.Attack;
import org.palladiosimulator.pcm.confidentiality.context.model.ContextAttribute;
import org.palladiosimulator.pcm.confidentiality.context.set.ContextSet;
import org.palladiosimulator.pcm.confidentiality.context.set.SetFactory;

import edu.kit.ipd.sdq.kamp4attack.core.BlackboardWrapper;
import edu.kit.ipd.sdq.kamp4attack.model.modificationmarks.KAMP4attackModificationmarks.ContextChange;
import edu.kit.ipd.sdq.kamp4attack.model.modificationmarks.KAMP4attackModificationmarks.CredentialChange;

public abstract class AttackHandler {
    private BlackboardWrapper modelStorage;
    private DataHandlerAttacker dataHandler;
    
    
    public AttackHandler(BlackboardWrapper modelStorage, DataHandlerAttacker dataHandler) {
        Objects.requireNonNull(modelStorage);
        Objects.requireNonNull(dataHandler);
        this.modelStorage = modelStorage;
        this.dataHandler = dataHandler;
        
    }
    
    protected BlackboardWrapper getModelStorage() {
        return this.modelStorage;
    }
    
    protected DataHandlerAttacker getDataHandler() {
        return this.dataHandler;
    }
    
    protected final ContextSet getCredentials(CredentialChange changes) {
        var contexts = changes.getContextchange().stream().map(ContextChange::getAffectedElement)
                .collect(Collectors.toList());
        return createContextSet(contexts);
    }
    
    protected final ContextSet createContextSet(List<ContextAttribute> contexts) {
        var set = SetFactory.eINSTANCE.createContextSet();
        set.getContexts().addAll(contexts);
        return set;
    }
    //TODO: Think about better location
    protected List<Attack> getAttacks() {
        var listAttackers = this.modelStorage.getModificationMarkRepository().getSeedModifications()
                .getAttackcomponent();
        return listAttackers.stream().flatMap(e -> e.getAffectedElement().getAttacks().stream())
                .collect(Collectors.toList());
    }
}
