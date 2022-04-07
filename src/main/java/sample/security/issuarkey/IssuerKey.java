package sample.security.issuarkey;


import lombok.Data;
import sample.security.SecurityDefaultData;

@Data
public class IssuerKey {

    private SecurityDefaultData defaultData;
    private IssuerKeyServiceData serviceData;


}
