package javastream;

import javastream.configs.Settings;
import javastream.service.*;

public class Client {

   private final LeadService leadService = new LeadService();
   private final DealService dealService = new DealService();
   private final ContactService contactService = new ContactService();

    public Client(String token, String account, Integer rest_ID) {
        Settings.token = token;
        Settings.account = account;
        Settings.restID = rest_ID;
    }

    public ContactService contactService() {
        return contactService;
    }

    public LeadService leadService() { return leadService;}
    public DealService dealService(){
        return dealService;
    }


}
