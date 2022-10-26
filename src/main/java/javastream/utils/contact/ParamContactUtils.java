package javastream.utils.contact;

import javastream.entity.Contact;
import javastream.uriParamsCreator.UriParamsCreator;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class ParamContactUtils {
    private final static String ID = "id";
    private final static String SPACE_PARAM = "%20";
    private final static String NAME = "FIELDS[NAME]";
    private final static String LAST_NAME = "FIELDS[LAST_NAME]";
    private final static String SECOND_NAME = "FIELDS[SECOND_NAME]";
    private final static String MESTO_ROSDEENIY = "UF_CRM_1434698981";
    private final static String BIRTHDATE = "FIELDS[BIRTHDATE]";
    private final static String PAS1 = "UF_CRM_1432204895";
    private final static String PAS1SAK = "UF_CRM_1432204517";
    private final static String PAS2 = "UF_CRM_1432204911";
    private final static String PAS2SAK = "UF_CRM_1432204550";
    private final static String PAS3 = "UF_CRM_1432204929";
    private final static String PAS3SAK = "UF_CRM_1432204568";
    private final static String PAS4 = "UF_CRM_1432204941";
    private final static String PAS4SAK = "UF_CRM_1432204586";
    private final static String PAS5 = "UF_CRM_1432204634";
    private final static String PAS5SAK = "UF_CRM_1432204604";
    private final static String REGION = "F_CRM_C_ADR_L_RGN";
    private final static String RAION = "UF_UF_CRM_C_ADR_DSTR";
    private final static String NASELENIY = "UF_CRM_1456761325";
    private final static String STRIT = "UF_CRM_1456761351";
    private final static String PHONE = "FIELDS[PHONE]";
    private final static String EMAIL = "FIELDS[EMAIL]";


    public UriParamsCreator getMethod(Integer idContact) {
        UriParamsCreator params = new UriParamsCreator();
        params.put(ID, idContact.toString());
        params.build();
        return params;
    }


}