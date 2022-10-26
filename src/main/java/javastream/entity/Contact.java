package javastream.entity;

import com.google.gson.annotations.SerializedName;
import javastream.entity.model.Email;
import javastream.entity.model.Phone;
import lombok.Data;
import lombok.ToString;
import java.util.List;

/**
 * Contact.
 *
 * UPD: name and lastName are mandatory fields for creation a new Contract
 *
 * @author javastream
 */
@Data
@ToString
public class Contact {

    public Contact(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @SerializedName("ID")
    private Integer id;

    @SerializedName("NAME")
    private String name;

    @SerializedName("LAST_NAME")
    private String lastName;

    @SerializedName("SECOND_NAME")
    private String secondName;

    @SerializedName("UF_CRM_1434698981")
    private String mesto_rosdeeniy;

    @SerializedName("BIRTHDATE")
    private String birthday;

    @SerializedName("UF_CRM_1432204895")
    private String pas1;

    @SerializedName("UF_CRM_1432204517")
    private String pas1sak;

    @SerializedName("UF_CRM_1432204911")
    private String pas2;

    @SerializedName("UF_CRM_1432204550")
    private String pas2sak;

    @SerializedName("UF_CRM_1432204929")
    private String pas3;

    @SerializedName("UF_CRM_1432204568")
    private String pas3sak;

    @SerializedName("UF_CRM_1432204941")
    private String pas4;

    @SerializedName("UF_CRM_1432204586")
    private String pas4sak;

    @SerializedName("UF_CRM_1432204634")
    private String pas5;

    @SerializedName("UF_CRM_1432204604")
    private String pas5sak;

    @SerializedName("F_CRM_C_ADR_L_RGN")
    private String region;

    @SerializedName("UF_UF_CRM_C_ADR_DSTR")
    private String raion;

    @SerializedName("UF_CRM_1456761325")
    private String naseleniy;

    @SerializedName("UF_CRM_1456761351")
    private String strit;

    @SerializedName("PHONE")
    private List<Phone> phones;

    @SerializedName("EMAIL")
    private List<Email> emails;

}