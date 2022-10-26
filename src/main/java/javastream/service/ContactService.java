package javastream.service;

import javastream.uriParamsCreator.UriParamsCreator;
import javastream.utils.PushRunner;
import javastream.utils.contact.ParamContactUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ContactService.
 *
 * @author javastream
 */
public class ContactService {

    private Logger logger = LoggerFactory.getLogger(ContactService.class);
    private final static String GET_METHOD = "crm.contact.get";



    public JSONObject get(Integer idContact) {
        logger.info("Request: Get the contact by id: {}", idContact);
        UriParamsCreator params = new ParamContactUtils().getMethod(idContact);
//        System.out.println(params);
        JSONObject jsonMain = PushRunner.get(params, GET_METHOD);
        JSONObject jsonResult = jsonMain.getJSONObject("result");
//        System.out.println("result");
//        System.out.println(jsonResult);
//        Gson gson = new Gson();
        return jsonResult;
    }

}
