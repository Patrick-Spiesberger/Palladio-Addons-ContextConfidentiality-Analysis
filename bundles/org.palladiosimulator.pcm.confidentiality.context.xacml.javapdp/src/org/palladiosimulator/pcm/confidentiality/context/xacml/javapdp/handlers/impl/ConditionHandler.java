package org.palladiosimulator.pcm.confidentiality.context.xacml.javapdp.handlers.impl;

import org.osgi.service.component.annotations.Component;
import org.palladiosimulator.pcm.confidentiality.context.policy.Expression;
import org.palladiosimulator.pcm.confidentiality.context.xacml.javapdp.handlers.ContextTypeConverter;

import oasis.names.tc.xacml._3_0.core.schema.wd_17.ConditionType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory;

@Component(service = ConditionHandler.class)
public class ConditionHandler implements ContextTypeConverter<ConditionType, Expression> {
    private ObjectFactory factory = new ObjectFactory();

    @Override
    public ConditionType transform(Expression inputModel) {
        var conditionType = this.factory.createConditionType();

        var conditionSwitch = new ExpressionSwitch();

//        var newInput = EcoreUtil.copy(inputModel);
//
//        new ExpressionPreCalculation().doSwitch(newInput);

        var expressionType = conditionSwitch.doSwitch(inputModel);

        conditionType.setExpression(expressionType);

        return conditionType;
    }

}
