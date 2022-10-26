package javastream;

import javastream.Client;
import javastream.entity.Contact;
import javastream.entity.Deal;
import org.json.JSONObject;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {

    }

    public static ArrayList<JSONObject> start (String token, String account, Integer id, String dealId) {
        final Client client = new Client(token, account, id);

        ArrayList<JSONObject> ret = new ArrayList<>();

        JSONObject dead  = getDead(Integer.parseInt(dealId), client);
        ret.add(dead);

        ret.add(getContact(Integer.parseInt(dead.getString("CONTACT_ID")), client));

        return ret;
    }

    private static JSONObject getDead(int dealInt, Client client) {
        JSONObject deal = client.dealService().get(dealInt);

        return deal;
    }

    private static JSONObject getContact(int contactInt, Client client) {
        JSONObject contact = client.contactService().get(contactInt);

        return contact;
    }
}
