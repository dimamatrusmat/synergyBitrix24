package javastream;

import javastream.Client;
import javastream.configs.Configs;
import javastream.entity.Contact;
import javastream.entity.Deal;
import org.json.JSONObject;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        // ID сделки
        String dealId = "5232295";

        ArrayList<JSONObject> infoContactAndDeal = start(Configs.token, Configs.account, Configs.restId, dealId);

        for (JSONObject entity: infoContactAndDeal) {

            while (true) {
                if (entity.isEmpty()) {
                    break;
                } else {
                    String key = entity.keys().next();
                    // Выводи все не пустые поля
                    if (!entity.get(key).toString().trim().isEmpty()) {
                        System.out.println(key + " " + entity.get(key));
                    }
                    entity.remove(key);
                }
            }


            System.out.println(entity);
        }
    }

    public static ArrayList<JSONObject> start (String token, String account, Integer id, String dealId) {
        final Client client = new Client(token, account, id);
        ArrayList<JSONObject> infoContactAndDeal = new ArrayList<>();

        JSONObject dead  = getDead(Integer.parseInt(dealId), client);
        infoContactAndDeal.add(dead);

        String contactId = dead.getString("CONTACT_ID");
        JSONObject contact = getContact(Integer.parseInt(contactId), client);
        infoContactAndDeal.add(contact);

        return infoContactAndDeal;
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
