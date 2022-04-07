package sample.persionalized;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import sample.DefaultData;

@Data
public class PersonalizedCard {

    private DefaultData defaultData;
    private PersonalizedServiceData serviceData;


}
