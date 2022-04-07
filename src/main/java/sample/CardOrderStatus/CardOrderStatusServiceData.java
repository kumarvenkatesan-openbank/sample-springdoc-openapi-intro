package sample.CardOrderStatus;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CardOrderStatusServiceData {
    @Schema(example = "0001", title = "Zonal ID - Refer Dada Dictionary- Default 0001", required = true)
    private String orderReference;
    @Schema(example = "0100000101001", title = "Card Proxy Number", required = true)
    private String proxyNumber;


}
