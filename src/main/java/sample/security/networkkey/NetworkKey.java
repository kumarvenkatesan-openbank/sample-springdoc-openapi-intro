package sample.security.networkkey;


import lombok.Data;
import sample.security.SecurityDefaultData;

@Data
public class NetworkKey {

    private SecurityDefaultData defaultData;
    private NetworkKeyServiceData serviceData;
   

}
