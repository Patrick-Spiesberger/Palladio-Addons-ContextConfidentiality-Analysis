package org.palladiosimulator.pcm.confidentiality.context.xacml.javapdp.handlers.impl;

import org.palladiosimulator.pcm.confidentiality.context.policy.Operations;
import org.palladiosimulator.pcm.confidentiality.context.xacml.javapdp.handlers.ContextTypeConverter;

import com.att.research.xacml.api.XACML3;

public class OperationHandler implements ContextTypeConverter<String, Operations> {

    @Override
    public String transform(Operations inputModel) {

        switch (inputModel) {
        case STRING_EQUAL:
            return XACML3.ID_FUNCTION_STRING_EQUAL.stringValue();
        case BOOLEAN_EQUAL:
            return XACML3.ID_FUNCTION_BOOLEAN_EQUAL.stringValue();
        case INTEGER_EQUAL:
            return XACML3.ID_FUNCTION_INTEGER_EQUAL.stringValue();
        case DOUBLE_EQUAL:
            return XACML3.ID_FUNCTION_DOUBLE_EQUAL.stringValue();
        case DATE_EQUAL:
            return XACML3.ID_FUNCTION_DATE_EQUAL.stringValue();
        case TIME_EQUAL:
            return XACML3.ID_FUNCTION_TIME_EQUAL.stringValue();
        case DATETIME_EQUAL:
            return XACML3.ID_FUNCTION_DATETIME_EQUAL.stringValue();
        case DAYTIMEDURATION_EQUAL:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_EQUAL.stringValue();
        case YEARMONTHDURATION_EQUAL:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_EQUAL.stringValue();
        case STRING_EQUAL_IGNORE_CASE:
            return XACML3.ID_FUNCTION_STRING_EQUAL_IGNORE_CASE.stringValue();
        case ANYURI_EQUAL:
            return XACML3.ID_FUNCTION_ANYURI_EQUAL.stringValue();
        case X500NAME_EQUAL:
            return XACML3.ID_FUNCTION_X500NAME_EQUAL.stringValue();
        case RFC822NAME_EQUAL:
            return XACML3.ID_FUNCTION_RFC822NAME_EQUAL.stringValue();
        case HEXBINARY_EQUAL:
            return XACML3.ID_FUNCTION_HEXBINARY_EQUAL.stringValue();
        case BASE64BINARY_EQUAL:
            return XACML3.ID_FUNCTION_BASE64BINARY_EQUAL.stringValue();
        case INTEGER_ADD:
            return XACML3.ID_FUNCTION_INTEGER_ADD.stringValue();
        case DOUBLE_ADD:
            return XACML3.ID_FUNCTION_DOUBLE_ADD.stringValue();
        case INTEGER_SUBTRACT:
            return XACML3.ID_FUNCTION_INTEGER_SUBTRACT.stringValue();
        case DOUBLE_SUBTRACT:
            return XACML3.ID_FUNCTION_DOUBLE_SUBTRACT.stringValue();
        case INTEGER_MULTIPLY:
            return XACML3.ID_FUNCTION_INTEGER_MULTIPLY.stringValue();
        case DOUBLE_MULTIPLY:
            return XACML3.ID_FUNCTION_DOUBLE_MULTIPLY.stringValue();
        case INTEGER_DIVIDE:
            return XACML3.ID_FUNCTION_INTEGER_DIVIDE.stringValue();
        case DOUBLE_DIVIDE:
            return XACML3.ID_FUNCTION_DOUBLE_DIVIDE.stringValue();
        case INTEGER_MOD:
            return XACML3.ID_FUNCTION_INTEGER_MOD.stringValue();
        case INTEGER_ABS:
            return XACML3.ID_FUNCTION_INTEGER_ABS.stringValue();
        case DOUBLE_ABS:
            return XACML3.ID_FUNCTION_DOUBLE_ABS.stringValue();
        case ROUND:
            return XACML3.ID_FUNCTION_ROUND.stringValue();
        case FLOOR:
            return XACML3.ID_FUNCTION_FLOOR.stringValue();
        case STRING_NORMALIZE_SPACE:
            return XACML3.ID_FUNCTION_STRING_NORMALIZE_SPACE.stringValue();
        case STRING_NORMALIZE_TO_LOWER_CASE:
            return XACML3.ID_FUNCTION_STRING_NORMALIZE_TO_LOWER_CASE.stringValue();
        case DOUBLE_TO_INTEGER:
            return XACML3.ID_FUNCTION_DOUBLE_TO_INTEGER.stringValue();
        case INTEGER_TO_DOUBLE:
            return XACML3.ID_FUNCTION_INTEGER_TO_DOUBLE.stringValue();
        case OR:
            return XACML3.ID_FUNCTION_OR.stringValue();
        case AND:
            return XACML3.ID_FUNCTION_AND.stringValue();
        case NOF:
            return XACML3.ID_FUNCTION_N_OF.stringValue();
        case NOT:
            return XACML3.ID_FUNCTION_NOT.stringValue();
        case PRESENT:
            return XACML3.ID_FUNCTION_PRESENT.stringValue();
        case INTEGER_GREATER_THAN:
            return XACML3.ID_FUNCTION_INTEGER_GREATER_THAN.stringValue();
        case INTEGER_GREATER_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_INTEGER_GREATER_THAN_OR_EQUAL.stringValue();
        case INTEGER_LESS_THAN:
            return XACML3.ID_FUNCTION_INTEGER_LESS_THAN.stringValue();
        case INTEGER_LESS_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_INTEGER_LESS_THAN_OR_EQUAL.stringValue();
        case DOUBLE_GREATER_THAN:
            return XACML3.ID_FUNCTION_DOUBLE_GREATER_THAN.stringValue();
        case DOUBLE_GREATER_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_DOUBLE_GREATER_THAN_OR_EQUAL.stringValue();
        case DOUBLE_LESS_THAN:
            return XACML3.ID_FUNCTION_DOUBLE_LESS_THAN.stringValue();
        case DOUBLE_LESS_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_DOUBLE_LESS_THAN_OR_EQUAL.stringValue();
        case DATETIME_ADD_DAYTIMEDURATION:
            return XACML3.ID_FUNCTION_DATETIME_ADD_DAYTIMEDURATION.stringValue();
        case DATETIME_ADD_YEARMONTHDURATION:
            return XACML3.ID_FUNCTION_DATETIME_ADD_YEARMONTHDURATION.stringValue();
        case DATETIME_SUBTRACT_DAYTIMEDURATION:
            return XACML3.ID_FUNCTION_DATETIME_SUBTRACT_DAYTIMEDURATION.stringValue();
        case DATETIME_SUBTRACT_YEARMONTHDURATION:
            return XACML3.ID_FUNCTION_DATETIME_SUBTRACT_YEARMONTHDURATION.stringValue();
        case DATE_ADD_YEARMONTHDURATION:
            return XACML3.ID_FUNCTION_DATE_ADD_YEARMONTHDURATION.stringValue();
        case DATE_SUBTRACT_YEARMONTHDURATION:
            return XACML3.ID_FUNCTION_DATE_SUBTRACT_YEARMONTHDURATION.stringValue();
        case STRING_GREATER_THAN:
            return XACML3.ID_FUNCTION_STRING_GREATER_THAN.stringValue();
        case STRING_GREATER_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_STRING_GREATER_THAN_OR_EQUAL.stringValue();
        case STRING_LESS_THAN:
            return XACML3.ID_FUNCTION_STRING_LESS_THAN.stringValue();
        case STRING_LESS_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_STRING_LESS_THAN_OR_EQUAL.stringValue();
        case TIME_GREATER_THAN:
            return XACML3.ID_FUNCTION_TIME_GREATER_THAN.stringValue();
        case TIME_GREATER_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_TIME_GREATER_THAN_OR_EQUAL.stringValue();
        case TIME_LESS_THAN:
            return XACML3.ID_FUNCTION_TIME_LESS_THAN.stringValue();
        case TIME_LESS_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_TIME_LESS_THAN_OR_EQUAL.stringValue();
        case TIME_IN_RANGE:
            return XACML3.ID_FUNCTION_TIME_IN_RANGE.stringValue();
        case DATETIME_GREATER_THAN:
            return XACML3.ID_FUNCTION_DATETIME_GREATER_THAN.stringValue();
        case DATETIME_GREATER_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_DATETIME_GREATER_THAN_OR_EQUAL.stringValue();
        case DATETIME_LESS_THAN:
            return XACML3.ID_FUNCTION_DATETIME_LESS_THAN.stringValue();
        case DATETIME_LESS_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_DATETIME_LESS_THAN_OR_EQUAL.stringValue();
        case DATE_GREATER_THAN:
            return XACML3.ID_FUNCTION_DATE_GREATER_THAN.stringValue();
        case DATE_GREATER_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_DATE_GREATER_THAN_OR_EQUAL.stringValue();
        case DATE_LESS_THAN:
            return XACML3.ID_FUNCTION_DATE_LESS_THAN.stringValue();
        case DATE_LESS_THAN_OR_EQUAL:
            return XACML3.ID_FUNCTION_DATE_LESS_THAN_OR_EQUAL.stringValue();
        case STRING_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_STRING_ONE_AND_ONLY.stringValue();
        case STRING_BAG_SIZE:
            return XACML3.ID_FUNCTION_STRING_BAG_SIZE.stringValue();
        case STRING_IS_IN:
            return XACML3.ID_FUNCTION_STRING_IS_IN.stringValue();
        case STRING_BAG:
            return XACML3.ID_FUNCTION_STRING_BAG.stringValue();
        case BOOLEAN_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_BOOLEAN_ONE_AND_ONLY.stringValue();
        case BOOLEAN_BAG_SIZE:
            return XACML3.ID_FUNCTION_BOOLEAN_BAG_SIZE.stringValue();
        case BOOLEAN_IS_IN:
            return XACML3.ID_FUNCTION_BOOLEAN_IS_IN.stringValue();
        case BOOLEAN_BAG:
            return XACML3.ID_FUNCTION_BOOLEAN_BAG.stringValue();
        case INTEGER_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_INTEGER_ONE_AND_ONLY.stringValue();
        case INTEGER_BAG_SIZE:
            return XACML3.ID_FUNCTION_INTEGER_BAG_SIZE.stringValue();
        case INTEGER_IS_IN:
            return XACML3.ID_FUNCTION_INTEGER_IS_IN.stringValue();
        case INTEGER_BAG:
            return XACML3.ID_FUNCTION_INTEGER_BAG.stringValue();
        case DOUBLE_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_DOUBLE_ONE_AND_ONLY.stringValue();
        case DOUBLE_BAG_SIZE:
            return XACML3.ID_FUNCTION_DOUBLE_BAG_SIZE.stringValue();
        case DOUBLE_IS_IN:
            return XACML3.ID_FUNCTION_DOUBLE_IS_IN.stringValue();
        case DOUBLE_BAG:
            return XACML3.ID_FUNCTION_DOUBLE_BAG.stringValue();
        case TIME_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_TIME_ONE_AND_ONLY.stringValue();
        case TIME_BAG_SIZE:
            return XACML3.ID_FUNCTION_TIME_BAG_SIZE.stringValue();
        case TIME_IS_IN:
            return XACML3.ID_FUNCTION_TIME_IS_IN.stringValue();
        case TIME_BAG:
            return XACML3.ID_FUNCTION_TIME_BAG.stringValue();
        case DATE_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_DATE_ONE_AND_ONLY.stringValue();
        case DATE_BAG_SIZE:
            return XACML3.ID_FUNCTION_DATE_BAG_SIZE.stringValue();
        case DATE_IS_IN:
            return XACML3.ID_FUNCTION_DATE_IS_IN.stringValue();
        case DATE_BAG:
            return XACML3.ID_FUNCTION_DATE_BAG.stringValue();
        case DATETIME_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_DATETIME_ONE_AND_ONLY.stringValue();
        case DATETIME_BAG_SIZE:
            return XACML3.ID_FUNCTION_DATETIME_BAG_SIZE.stringValue();
        case DATETIME_IS_IN:
            return XACML3.ID_FUNCTION_DATETIME_IS_IN.stringValue();
        case DATETIME_BAG:
            return XACML3.ID_FUNCTION_DATETIME_BAG.stringValue();
        case ANYURI_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_ANYURI_ONE_AND_ONLY.stringValue();
        case ANYURI_BAG_SIZE:
            return XACML3.ID_FUNCTION_ANYURI_BAG_SIZE.stringValue();
        case ANYURI_IS_IN:
            return XACML3.ID_FUNCTION_ANYURI_IS_IN.stringValue();
        case ANYURI_BAG:
            return XACML3.ID_FUNCTION_ANYURI_BAG.stringValue();
        case HEXBINARY_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_HEXBINARY_ONE_AND_ONLY.stringValue();
        case HEXBINARY_BAG_SIZE:
            return XACML3.ID_FUNCTION_HEXBINARY_BAG_SIZE.stringValue();
        case HEXBINARY_IS_IN:
            return XACML3.ID_FUNCTION_HEXBINARY_IS_IN.stringValue();
        case HEXBINARY_BAG:
            return XACML3.ID_FUNCTION_HEXBINARY_BAG.stringValue();
        case BASE64BINARY_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_BASE64BINARY_ONE_AND_ONLY.stringValue();
        case BASE64BINARY_BAG_SIZE:
            return XACML3.ID_FUNCTION_BASE64BINARY_BAG_SIZE.stringValue();
        case BASE64BINARY_IS_IN:
            return XACML3.ID_FUNCTION_BASE64BINARY_IS_IN.stringValue();
        case BASE64BINARY_BAG:
            return XACML3.ID_FUNCTION_BASE64BINARY_BAG.stringValue();
        case DAYTIMEDURATION_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_ONE_AND_ONLY.stringValue();
        case DAYTIMEDURATION_BAG_SIZE:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_BAG_SIZE.stringValue();
        case DAYTIMEDURATION_IS_IN:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_IS_IN.stringValue();
        case DAYTIMEDURATION_BAG:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_BAG.stringValue();
        case YEARMONTHDURATION_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_ONE_AND_ONLY.stringValue();
        case YEARMONTHDURATION_BAG_SIZE:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_BAG_SIZE.stringValue();
        case YEARMONTHDURATION_IS_IN:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_IS_IN.stringValue();
        case YEARMONTHDURATION_BAG:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_BAG.stringValue();
        case X500NAME_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_X500NAME_ONE_AND_ONLY.stringValue();
        case X500NAME_BAG_SIZE:
            return XACML3.ID_FUNCTION_X500NAME_BAG_SIZE.stringValue();
        case X500NAME_IS_IN:
            return XACML3.ID_FUNCTION_X500NAME_IS_IN.stringValue();
        case X500NAME_BAG:
            return XACML3.ID_FUNCTION_X500NAME_BAG.stringValue();
        case RFC822NAME_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_RFC822NAME_ONE_AND_ONLY.stringValue();
        case RFC822NAME_BAG_SIZE:
            return XACML3.ID_FUNCTION_RFC822NAME_BAG_SIZE.stringValue();
        case RFC822NAME_IS_IN:
            return XACML3.ID_FUNCTION_RFC822NAME_IS_IN.stringValue();
        case RFC822NAME_BAG:
            return XACML3.ID_FUNCTION_RFC822NAME_BAG.stringValue();
        case IPADDRESS_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_IPADDRESS_ONE_AND_ONLY.stringValue();
        case IPADDRESS_BAG_SIZE:
            return XACML3.ID_FUNCTION_IPADDRESS_BAG_SIZE.stringValue();
        case IPADDRESS_IS_IN:
            return XACML3.ID_FUNCTION_IPADDRESS_IS_IN.stringValue();
        case IPADDRESS_BAG:
            return XACML3.ID_FUNCTION_IPADDRESS_BAG.stringValue();
        case DNSNAME_ONE_AND_ONLY:
            return XACML3.ID_FUNCTION_DNSNAME_ONE_AND_ONLY.stringValue();
        case DNSNAME_BAG_SIZE:
            return XACML3.ID_FUNCTION_DNSNAME_BAG_SIZE.stringValue();
        case DNSNAME_IS_IN:
            return XACML3.ID_FUNCTION_DNSNAME_IS_IN.stringValue();
        case DNSNAME_BAG:
            return XACML3.ID_FUNCTION_DNSNAME_BAG.stringValue();
        case STRING_CONCATENATE:
            return XACML3.ID_FUNCTION_STRING_CONCATENATE.stringValue();
        case BOOLEAN_FROM_STRING:
            return XACML3.ID_FUNCTION_BOOLEAN_FROM_STRING.stringValue();
        case STRING_FROM_BOOLEAN:
            return XACML3.ID_FUNCTION_STRING_FROM_BOOLEAN.stringValue();
        case INTEGER_FROM_STRING:
            return XACML3.ID_FUNCTION_INTEGER_FROM_STRING.stringValue();
        case STRING_FROM_INTEGER:
            return XACML3.ID_FUNCTION_STRING_FROM_INTEGER.stringValue();
        case DOUBLE_FROM_STRING:
            return XACML3.ID_FUNCTION_DOUBLE_FROM_STRING.stringValue();
        case STRING_FROM_DOUBLE:
            return XACML3.ID_FUNCTION_STRING_FROM_DOUBLE.stringValue();
        case TIME_FROM_STRING:
            return XACML3.ID_FUNCTION_TIME_FROM_STRING.stringValue();
        case STRING_FROM_TIME:
            return XACML3.ID_FUNCTION_STRING_FROM_TIME.stringValue();
        case DATE_FROM_STRING:
            return XACML3.ID_FUNCTION_DATE_FROM_STRING.stringValue();
        case STRING_FROM_DATE:
            return XACML3.ID_FUNCTION_STRING_FROM_DATE.stringValue();
        case DATETIME_FROM_STRING:
            return XACML3.ID_FUNCTION_DATETIME_FROM_STRING.stringValue();
        case STRING_FROM_DATETIME:
            return XACML3.ID_FUNCTION_STRING_FROM_DATETIME.stringValue();
        case ANYURI_FROM_STRING:
            return XACML3.ID_FUNCTION_ANYURI_FROM_STRING.stringValue();
        case STRING_FROM_ANYURI:
            return XACML3.ID_FUNCTION_STRING_FROM_ANYURI.stringValue();
        case DAYTIMEDURATION_FROM_STRING:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_FROM_STRING.stringValue();
        case STRING_FROM_DAYTIMEDURATION:
            return XACML3.ID_FUNCTION_STRING_FROM_DAYTIMEDURATION.stringValue();
        case YEARMONTHDURATION_FROM_STRING:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_FROM_STRING.stringValue();
        case STRING_FROM_YEARMONTHDURATION:
            return XACML3.ID_FUNCTION_STRING_FROM_YEARMONTHDURATION.stringValue();
        case X500NAME_FROM_STRING:
            return XACML3.ID_FUNCTION_X500NAME_FROM_STRING.stringValue();
        case STRING_FROM_X500NAME:
            return XACML3.ID_FUNCTION_STRING_FROM_X500NAME.stringValue();
        case RFC822NAME_FROM_STRING:
            return XACML3.ID_FUNCTION_RFC822NAME_FROM_STRING.stringValue();
        case STRING_FROM_RFC822NAME:
            return XACML3.ID_FUNCTION_STRING_FROM_RFC822NAME.stringValue();
        case IPADDRESS_FROM_STRING:
            return XACML3.ID_FUNCTION_IPADDRESS_FROM_STRING.stringValue();
        case STRING_FROM_IPADDRESS:
            return XACML3.ID_FUNCTION_STRING_FROM_IPADDRESS.stringValue();
        case DNSNAME_FROM_STRING:
            return XACML3.ID_FUNCTION_DNSNAME_FROM_STRING.stringValue();
        case STRING_FROM_DNSNAME:
            return XACML3.ID_FUNCTION_STRING_FROM_DNSNAME.stringValue();
        case STRING_STARTS_WITH:
            return XACML3.ID_FUNCTION_STRING_STARTS_WITH.stringValue();
        case ANYURI_STARTS_WITH:
            return XACML3.ID_FUNCTION_ANYURI_STARTS_WITH.stringValue();
        case STRING_ENDS_WITH:
            return XACML3.ID_FUNCTION_STRING_ENDS_WITH.stringValue();
        case ANYURI_ENDS_WITH:
            return XACML3.ID_FUNCTION_ANYURI_ENDS_WITH.stringValue();
        case STRING_CONTAINS:
            return XACML3.ID_FUNCTION_STRING_CONTAINS.stringValue();
        case ANYURI_CONTAINS:
            return XACML3.ID_FUNCTION_ANYURI_CONTAINS.stringValue();
        case STRING_SUBSTRING:
            return XACML3.ID_FUNCTION_STRING_SUBSTRING.stringValue();
        case ANYURI_SUBSTRING:
            return XACML3.ID_FUNCTION_ANYURI_SUBSTRING.stringValue();
        case ANY_OF:
            return XACML3.ID_FUNCTION_ANY_OF.stringValue();
        case ALL_OF:
            return XACML3.ID_FUNCTION_ALL_OF.stringValue();
        case ANY_OF_ANY:
            return XACML3.ID_FUNCTION_ANY_OF_ANY.stringValue();
        case ALL_OF_ANY:
            return XACML3.ID_FUNCTION_ALL_OF_ANY.stringValue();
        case ANY_OF_ALL:
            return XACML3.ID_FUNCTION_ANY_OF_ALL.stringValue();
        case ALL_OF_ALL:
            return XACML3.ID_FUNCTION_ALL_OF_ALL.stringValue();
        case MAP:
            return XACML3.ID_FUNCTION_MAP.stringValue();
        case X500NAME_MATCH:
            return XACML3.ID_FUNCTION_X500NAME_MATCH.stringValue();
        case RFC822NAME_MATCH:
            return XACML3.ID_FUNCTION_RFC822NAME_MATCH.stringValue();
        case STRING_REGEXP_MATCH:
            return XACML3.ID_FUNCTION_STRING_REGEXP_MATCH.stringValue();
        case ANYURI_REGEXP_MATCH:
            return XACML3.ID_FUNCTION_ANYURI_REGEXP_MATCH.stringValue();
        case IPADDRESS_REGEXP_MATCH:
            return XACML3.ID_FUNCTION_IPADDRESS_REGEXP_MATCH.stringValue();
        case DNSNAME_REGEXP_MATCH:
            return XACML3.ID_FUNCTION_DNSNAME_REGEXP_MATCH.stringValue();
        case RFC822NAME_REGEXP_MATCH:
            return XACML3.ID_FUNCTION_RFC822NAME_REGEXP_MATCH.stringValue();
        case X500NAME_REGEXP_MATCH:
            return XACML3.ID_FUNCTION_X500NAME_REGEXP_MATCH.stringValue();
        case XPATH_NODE_COUNT:
            return XACML3.ID_FUNCTION_XPATH_NODE_COUNT.stringValue();
        case XPATH_NODE_EQUAL:
            return XACML3.ID_FUNCTION_XPATH_NODE_EQUAL.stringValue();
        case XPATH_NODE_MATCH:
            return XACML3.ID_FUNCTION_XPATH_NODE_MATCH.stringValue();
        case STRING_INTERSECTION:
            return XACML3.ID_FUNCTION_STRING_INTERSECTION.stringValue();
        case STRING_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_STRING_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case STRING_UNION:
            return XACML3.ID_FUNCTION_STRING_UNION.stringValue();
        case STRING_SUBSET:
            return XACML3.ID_FUNCTION_STRING_SUBSET.stringValue();
        case STRING_SET_EQUALS:
            return XACML3.ID_FUNCTION_STRING_SET_EQUALS.stringValue();
        case BOOLEAN_INTERSECTION:
            return XACML3.ID_FUNCTION_BOOLEAN_INTERSECTION.stringValue();
        case BOOLEAN_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_BOOLEAN_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case BOOLEAN_UNION:
            return XACML3.ID_FUNCTION_BOOLEAN_UNION.stringValue();
        case BOOLEAN_SUBSET:
            return XACML3.ID_FUNCTION_BOOLEAN_SUBSET.stringValue();
        case BOOLEAN_SET_EQUALS:
            return XACML3.ID_FUNCTION_BOOLEAN_SET_EQUALS.stringValue();
        case INTEGER_INTERSECTION:
            return XACML3.ID_FUNCTION_INTEGER_INTERSECTION.stringValue();
        case INTEGER_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_INTEGER_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case INTEGER_UNION:
            return XACML3.ID_FUNCTION_INTEGER_UNION.stringValue();
        case INTEGER_SUBSET:
            return XACML3.ID_FUNCTION_INTEGER_SUBSET.stringValue();
        case INTEGER_SET_EQUALS:
            return XACML3.ID_FUNCTION_INTEGER_SET_EQUALS.stringValue();
        case DOUBLE_INTERSECTION:
            return XACML3.ID_FUNCTION_DOUBLE_INTERSECTION.stringValue();
        case DOUBLE_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_DOUBLE_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case DOUBLE_UNION:
            return XACML3.ID_FUNCTION_DOUBLE_UNION.stringValue();
        case DOUBLE_SUBSET:
            return XACML3.ID_FUNCTION_DOUBLE_SUBSET.stringValue();
        case DOUBLE_SET_EQUALS:
            return XACML3.ID_FUNCTION_DOUBLE_SET_EQUALS.stringValue();
        case TIME_INTERSECTION:
            return XACML3.ID_FUNCTION_TIME_INTERSECTION.stringValue();
        case TIME_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_TIME_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case TIME_UNION:
            return XACML3.ID_FUNCTION_TIME_UNION.stringValue();
        case TIME_SUBSET:
            return XACML3.ID_FUNCTION_TIME_SUBSET.stringValue();
        case TIME_SET_EQUALS:
            return XACML3.ID_FUNCTION_TIME_SET_EQUALS.stringValue();
        case DATE_INTERSECTION:
            return XACML3.ID_FUNCTION_DATE_INTERSECTION.stringValue();
        case DATE_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_DATE_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case DATE_UNION:
            return XACML3.ID_FUNCTION_DATE_UNION.stringValue();
        case DATE_SUBSET:
            return XACML3.ID_FUNCTION_DATE_SUBSET.stringValue();
        case DATE_SET_EQUALS:
            return XACML3.ID_FUNCTION_DATE_SET_EQUALS.stringValue();
        case DATETIME_INTERSECTION:
            return XACML3.ID_FUNCTION_DATETIME_INTERSECTION.stringValue();
        case DATETIME_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_DATETIME_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case DATETIME_UNION:
            return XACML3.ID_FUNCTION_DATETIME_UNION.stringValue();
        case DATETIME_SUBSET:
            return XACML3.ID_FUNCTION_DATETIME_SUBSET.stringValue();
        case DATETIME_SET_EQUALS:
            return XACML3.ID_FUNCTION_DATETIME_SET_EQUALS.stringValue();
        case ANYURI_INTERSECTION:
            return XACML3.ID_FUNCTION_ANYURI_INTERSECTION.stringValue();
        case ANYURI_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_ANYURI_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case ANYURI_UNION:
            return XACML3.ID_FUNCTION_ANYURI_UNION.stringValue();
        case ANYURI_SUBSET:
            return XACML3.ID_FUNCTION_ANYURI_SUBSET.stringValue();
        case ANYURI_SET_EQUALS:
            return XACML3.ID_FUNCTION_ANYURI_SET_EQUALS.stringValue();
        case HEXBINARY_INTERSECTION:
            return XACML3.ID_FUNCTION_HEXBINARY_INTERSECTION.stringValue();
        case HEXBINARY_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_HEXBINARY_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case HEXBINARY_UNION:
            return XACML3.ID_FUNCTION_HEXBINARY_UNION.stringValue();
        case HEXBINARY_SUBSET:
            return XACML3.ID_FUNCTION_HEXBINARY_SUBSET.stringValue();
        case HEXBINARY_SET_EQUALS:
            return XACML3.ID_FUNCTION_HEXBINARY_SET_EQUALS.stringValue();
        case BASE64BINARY_INTERSECTION:
            return XACML3.ID_FUNCTION_BASE64BINARY_INTERSECTION.stringValue();
        case BASE64BINARY_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_BASE64BINARY_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case BASE64BINARY_UNION:
            return XACML3.ID_FUNCTION_BASE64BINARY_UNION.stringValue();
        case BASE64BINARY_SUBSET:
            return XACML3.ID_FUNCTION_BASE64BINARY_SUBSET.stringValue();
        case BASE64BINARY_SET_EQUALS:
            return XACML3.ID_FUNCTION_BASE64BINARY_SET_EQUALS.stringValue();
        case DAYTIMEDURATION_INTERSECTION:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_INTERSECTION.stringValue();
        case DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case DAYTIMEDURATION_UNION:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_UNION.stringValue();
        case DAYTIMEDURATION_SUBSET:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_SUBSET.stringValue();
        case DAYTIMEDURATION_SET_EQUALS:
            return XACML3.ID_FUNCTION_DAYTIMEDURATION_SET_EQUALS.stringValue();
        case YEARMONTHDURATION_INTERSECTION:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_INTERSECTION.stringValue();
        case YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case YEARMONTHDURATION_UNION:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_UNION.stringValue();
        case YEARMONTHDURATION_SUBSET:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_SUBSET.stringValue();
        case YEARMONTHDURATION_SET_EQUALS:
            return XACML3.ID_FUNCTION_YEARMONTHDURATION_SET_EQUALS.stringValue();
        case X500NAME_INTERSECTION:
            return XACML3.ID_FUNCTION_X500NAME_INTERSECTION.stringValue();
        case X500NAME_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_X500NAME_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case X500NAME_UNION:
            return XACML3.ID_FUNCTION_X500NAME_UNION.stringValue();
        case X500NAME_SUBSET:
            return XACML3.ID_FUNCTION_X500NAME_SUBSET.stringValue();
        case X500NAME_SET_EQUALS:
            return XACML3.ID_FUNCTION_X500NAME_SET_EQUALS.stringValue();
        case RFC822NAME_INTERSECTION:
            return XACML3.ID_FUNCTION_RFC822NAME_INTERSECTION.stringValue();
        case RFC822NAME_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_RFC822NAME_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case RFC822NAME_UNION:
            return XACML3.ID_FUNCTION_RFC822NAME_UNION.stringValue();
        case RFC822NAME_SUBSET:
            return XACML3.ID_FUNCTION_RFC822NAME_SUBSET.stringValue();
        case RFC822NAME_SET_EQUALS:
            return XACML3.ID_FUNCTION_RFC822NAME_SET_EQUALS.stringValue();
        case IPADDRESS_INTERSECTION:
            return XACML3.ID_FUNCTION_IPADDRESS_INTERSECTION.stringValue();
        case IPADDRESS_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_IPADDRESS_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case IPADDRESS_UNION:
            return XACML3.ID_FUNCTION_IPADDRESS_UNION.stringValue();
        case IPADDRESS_SUBSET:
            return XACML3.ID_FUNCTION_IPADDRESS_SUBSET.stringValue();
        case IPADDRESS_SET_EQUALS:
            return XACML3.ID_FUNCTION_IPADDRESS_SET_EQUALS.stringValue();
        case DNSNAME_INTERSECTION:
            return XACML3.ID_FUNCTION_DNSNAME_INTERSECTION.stringValue();
        case DNSNAME_AT_LEAST_ONE_MEMBER_OF:
            return XACML3.ID_FUNCTION_DNSNAME_AT_LEAST_ONE_MEMBER_OF.stringValue();
        case DNSNAME_UNION:
            return XACML3.ID_FUNCTION_DNSNAME_UNION.stringValue();
        case DNSNAME_SUBSET:
            return XACML3.ID_FUNCTION_DNSNAME_SUBSET.stringValue();
        case DNSNAME_SET_EQUALS:
            return XACML3.ID_FUNCTION_DNSNAME_SET_EQUALS.stringValue();
        default:
            break;

        }
        return null;
    }
}
