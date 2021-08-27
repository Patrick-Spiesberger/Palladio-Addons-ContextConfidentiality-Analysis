package edu.kit.ipd.sdq.kamp4attack.core;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.confidentiality.attackerSpecification.pcmIntegration.PCMElement;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import edu.kit.ipd.sdq.kamp4attack.model.modificationmarks.KAMP4attackModificationmarks.CompromisedAssembly;
import edu.kit.ipd.sdq.kamp4attack.model.modificationmarks.KAMP4attackModificationmarks.CompromisedLinkingResource;
import edu.kit.ipd.sdq.kamp4attack.model.modificationmarks.KAMP4attackModificationmarks.CompromisedResource;
import edu.kit.ipd.sdq.kamp4attack.model.modificationmarks.KAMP4attackModificationmarks.CredentialChange;

public class CompromisedElementHelper {

    private CompromisedElementHelper() {
        // TODO Auto-generated constructor stub
    }

    public static boolean isHacked(PCMElement element, CredentialChange change) {

        return isHacked(element.getAssemblycontext(), change) && isHacked(element.getLinkingresource(), change)
                && isHacked(element.getResourcecontainer(), change);

    }

    public static boolean isHacked(AssemblyContext component, CredentialChange change) {
        return change.getCompromisedassembly().stream().map(CompromisedAssembly::getAffectedElement)
                .anyMatch(e -> EcoreUtil.equals(component, e));
    }

    public static boolean isHacked(ResourceContainer container, CredentialChange change) {
        return change.getCompromisedresource().stream().map(CompromisedResource::getAffectedElement)
                .anyMatch(e -> EcoreUtil.equals(container, e));
    }

    public static boolean isHacked(LinkingResource container, CredentialChange change) {
        return change.getCompromisedlinkingresource().stream().map(CompromisedLinkingResource::getAffectedElement)
                .anyMatch(e -> EcoreUtil.equals(container, e));
    }

}