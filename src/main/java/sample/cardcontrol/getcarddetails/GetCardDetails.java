package sample.cardcontrol.getcarddetails;


import io.swagger.v3.oas.annotations.media.ArraySchema;
import lombok.Data;
import sample.DefaultData;

import java.util.List;

@Data
public class GetCardDetails {

    private DefaultData defaultData;
    private GetCardDetailsServiceData serviceData;


}
