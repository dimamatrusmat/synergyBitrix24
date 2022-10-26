package javastream.service;

import javastream.uriParamsCreator.UriParamsCreator;
import javastream.utils.PushRunner;
import javastream.utils.deal.ParamDealUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * LeadService.
 *
 * @author javastream
 */
public class DealService {

    private Logger logger = LoggerFactory.getLogger(DealService.class);
    private final static String GET_METHOD = "crm.deal.get";


    public JSONObject get(Integer idDeal) {
        logger.info("Request: Get the deal by id: {}", idDeal);
        UriParamsCreator params = new ParamDealUtils().getMethod(idDeal);

        JSONObject json = PushRunner.get(params, GET_METHOD);
        JSONObject result = json.getJSONObject("result");

        return result;
    }

}