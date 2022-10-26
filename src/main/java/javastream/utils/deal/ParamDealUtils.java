package javastream.utils.deal;

import javastream.entity.Deal;
import javastream.uriParamsCreator.UriParamsCreator;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * ParamLeadUtils.
 *
 * @author javastream
 */
public class ParamDealUtils {
    private final static String ID = "id";

    private final static String SPACE_PARAM = "%20";
    private final static String LEVEL_OBR = "UF_CRM_1433333639";
    private final static String FORM_OBR = "UF_CRM_1433333701";
    private final static String DATE_DOC = "UF_CRM_1448347600";
    private final static String START_LEARN = "UF_DATESTARTLEARN";
    private final static String DOC_NUMBER = "UF_CRM_1435304800";
    private final static String COST_OBR = "OPPORTUNITY";
    private final static String PROFILE = "UF_CRM_1433333673";
    private final static String NAPRAVLENIE = "UF_CRM_1433333663";
    private final static String SERIY_DIPLOMA = "UF_CRM_1432203732";
    private final static String NUMBER_DIPLOMA = "UF_CRM_1432203740";
    private final static String DATE_DIPLOMA = "UF_CRM_1432203754";

    public UriParamsCreator addMethod(Deal deal) throws UnsupportedEncodingException {
        UriParamsCreator params = createFieldsForAddMethod(deal);
        params.build();
        return params;
    }

    private UriParamsCreator createFieldsForAddMethod(Deal deal) throws UnsupportedEncodingException {
        UriParamsCreator params = new UriParamsCreator();

        params.put(LEVEL_OBR, check(deal.getLevel_obr()));
        params.put(FORM_OBR, check(deal.getForm_obr()));
        params.put(DATE_DOC, check(deal.getDate_doc()));
        params.put(START_LEARN, check(deal.getStart_learn()));
        params.put(DOC_NUMBER, check(deal.getDoc_number()));
        params.put(COST_OBR, check(deal.getCost_obr()));
        params.put(PROFILE, check(deal.getProfile()));
        params.put(NAPRAVLENIE, check(deal.getNapraflenie()));
        params.put(SERIY_DIPLOMA, check(deal.getSeriy_diplom()));
        params.put(NUMBER_DIPLOMA, check(deal.getNumber_diplom()));
        params.put(DATE_DIPLOMA, check(deal.getDate_diplom()));


        return params;
    }

    public UriParamsCreator getMethod(Integer idDead) {
        UriParamsCreator params = new UriParamsCreator();
        params.put(ID, idDead.toString());
        params.build();

        return params;
    }

    private String check(String field) {
        if (field == null) {
            return SPACE_PARAM;
        } else {
            return URLEncoder.encode(field.toString());
        }
    }

    private UriParamsCreator createFieldsForUpdateMethod(Deal deal) throws UnsupportedEncodingException {

        UriParamsCreator params = new UriParamsCreator();
        params.put(LEVEL_OBR, check(deal.getLevel_obr()));
        params.put(FORM_OBR, check(deal.getForm_obr()));
        params.put(DATE_DOC, check(deal.getDate_doc()));
        params.put(START_LEARN, check(deal.getStart_learn()));
        params.put(DOC_NUMBER, check(deal.getDoc_number()));
        params.put(COST_OBR, check(deal.getCost_obr()));
        params.put(PROFILE, check(deal.getProfile()));
        params.put(NAPRAVLENIE, check(deal.getNapraflenie()));
        params.put(SERIY_DIPLOMA, check(deal.getSeriy_diplom()));
        params.put(NUMBER_DIPLOMA, check(deal.getNumber_diplom()));
        params.put(DATE_DIPLOMA, check(deal.getDate_diplom()));

        return params;
    }


}