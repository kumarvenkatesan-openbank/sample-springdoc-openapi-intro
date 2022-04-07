package sample.nonpersionalized;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class NonPersionalizedCard {


    private SingleCardDefaultData defaultData;
    private NonPersonalizedServiceData serviceData;




}
