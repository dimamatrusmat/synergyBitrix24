package javastream.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

/**
 * Contact.
 *
 * UPD: name and lastName are mandatory fields for creation a new Contract
 *
 * @author javastream
 */
@Data
@ToString
public class Deal {

    public Deal(Integer id) {
        this.id = id;
    }


    @SerializedName("ID")
    private Integer id;

    @SerializedName("UF_CRM_1433333639")
    private String level_obr;

    @SerializedName("UF_CRM_1433333701")
    private String form_obr;

    @SerializedName("UF_CRM_1448347600")
    private String date_doc;

    @SerializedName("UF_DATESTARTLEARN")
    private String start_learn;

    @SerializedName("UF_CRM_1435304800")
    private String doc_number;

    @SerializedName("OPPORTUNITY")
    private String cost_obr;

    @SerializedName("UF_CRM_1433333673")
    private String profile;

    @SerializedName("UF_CRM_1433333663")
    private String napraflenie;

    @SerializedName("UF_CRM_1432203732")
    private String seriy_diplom;

    @SerializedName("UF_CRM_1432203740")
    private String number_diplom;

    @SerializedName("UF_CRM_1432203754")
    private String date_diplom;
}