package sample.CardOrderStatus;



import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import sample.DefaultData;
import sample.nonpersionalized.NonPersonalizedServiceData;

@Data
public class CardOrderStatus {


    private DefaultData defaultData;
    private CardOrderStatusServiceData serviceData;



}
