package javastream.service;

import javastream.entity.Deal;
import javastream.uriParamsCreator.UriParamsCreator;
import javastream.utils.PushRunner;
import javastream.utils.deal.ParamDealUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;


/**
 * LeadService.
 *
 * @author javastream
 */
public class DealService {

    private Logger logger = LoggerFactory.getLogger(DealService.class);

    private final static String ADD_METHOD = "crm.deal.get";
    private final static String GET_METHOD = "crm.deal.get";

    public void add(Deal deal) {
        logger.info("Request: Add a new deal: {}", deal.getId());
        try {
            UriParamsCreator params = new ParamDealUtils().addMethod(deal);
            PushRunner.post(params, ADD_METHOD);
        } catch (UnsupportedEncodingException e) {
            logger.error("An error occurred while adding new deal", e);
        }
    }

    public JSONObject get(Integer idDeal) {
        logger.info("Request: Get the deal by id: {}", idDeal);
        UriParamsCreator params = new ParamDealUtils().getMethod(idDeal);

        JSONObject json = PushRunner.get(params, GET_METHOD);
        JSONObject result = json.getJSONObject("result");

        return result;
    }

}