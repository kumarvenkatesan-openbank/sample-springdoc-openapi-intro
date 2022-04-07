package sample.security.storecard;


import lombok.Data;
import sample.security.SecurityDefaultData;

@Data
public class StoreCard {

    private SecurityDefaultData defaultData;
    private StoreCardServiceData serviceData;


}
