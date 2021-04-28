package org.palladiosimulator.pcm.confidentiality.attacker.analysis.common.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

public class CollectionHelper {
    private CollectionHelper() {
        
    }

    public static List<AssemblyContext> getAssemblyContext(List<ResourceContainer> reachableResources,
            Allocation allocation) {
        return allocation.getAllocationContexts_Allocation().stream()
                .filter(container -> searchResource(container.getResourceContainer_AllocationContext(),
                        reachableResources))
                .map(AllocationContext::getAssemblyContext_AllocationContext).distinct().collect(Collectors.toList());

    }

    @SuppressWarnings("unchecked")
    public static <T extends EObject> List<T> removeDuplicates(Collection<T> collection){       
        return (List<T>) EcoreUtil.filterDescendants(collection); //checked by incoming values
    }
    
    private static boolean searchResource(ResourceContainer targetContainer, List<ResourceContainer> listContainer) {
        return listContainer.stream().anyMatch(container -> EcoreUtil.equals(container, targetContainer));
    }
}
