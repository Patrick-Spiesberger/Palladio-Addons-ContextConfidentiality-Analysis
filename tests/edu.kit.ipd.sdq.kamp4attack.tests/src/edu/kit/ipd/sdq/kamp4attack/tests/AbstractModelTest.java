package edu.kit.ipd.sdq.kamp4attack.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.AttackerSpecification;
import org.palladiosimulator.pcm.confidentiality.context.ConfidentialAccessSpecification;
import org.palladiosimulator.pcm.confidentiality.context.analysis.testframework.BaseTest;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.system.System;

import edu.kit.ipd.sdq.kamp4attack.core.BlackboardWrapper;
import edu.kit.ipd.sdq.kamp4attack.model.modificationmarks.KAMP4attackModificationmarks.AbstractKAMP4attackModificationRepository;

public abstract class AbstractModelTest extends BaseTest {

    protected String PATH_ATTACKER;
    protected String PATH_ASSEMBLY;
    protected String PATH_ALLOCATION;
    protected String PATH_CONTEXT;
    protected String PATH_MODIFICATION;
    protected String PATH_REPOSITORY;
    protected String PATH_USAGE;
    protected String PATH_RESOURCES;

    protected System assembly;
    protected ResourceEnvironment environment;
    protected Allocation allocation;
    protected ConfidentialAccessSpecification context;
    protected AttackerSpecification attacker;
    protected AbstractKAMP4attackModificationRepository<?> modification;

    final protected BlackboardWrapper getBlackboardWrapper() {
        return new BlackboardWrapper(this.modification, this.assembly, this.environment, this.allocation,
                this.context.getPcmspecificationcontainer(), this.attacker.getSystemintegration());
    }

    @Override
    protected List<String> getModelsPath(){
        var list = new ArrayList<String>();
        
        list.add(PATH_ASSEMBLY);
        list.add(PATH_ALLOCATION);
        list.add(PATH_RESOURCES);
        list.add(PATH_USAGE);
        list.add(PATH_CONTEXT);
        list.add(PATH_ATTACKER);
        list.add(PATH_MODIFICATION);
        
        return list;
    }
    
    @Override
    protected void assignValues(List<Resource> list) {
        this.assembly = this.getModel(list, System.class);
        this.environment = this.getModel(list, ResourceEnvironment.class);
        this.allocation = this.getModel(list, Allocation.class);
        this.context = this.getModel(list, ConfidentialAccessSpecification.class);
        this.attacker = this.getModel(list, AttackerSpecification.class);
        this.modification = this.getModel(list, AbstractKAMP4attackModificationRepository.class);
    }
    

}