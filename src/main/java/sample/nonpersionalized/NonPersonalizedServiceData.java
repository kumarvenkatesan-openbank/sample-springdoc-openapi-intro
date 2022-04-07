package sample.nonpersionalized;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "ServiceData")
public class NonPersonalizedServiceData {
    @Schema(example = "0001", title = "Zonal ID - Refer Dada Dictionary- Default 0001", required = true)
    private String zone;
    @Schema(example = "OPENCARD", title = "Product Code Which created", required = true)
    private String productCode;
    @Schema(example = "50", title = "No of Cards Required", required = true)
    private int noOfcards;
    @Schema(example = "TEST CARD", title = "Default name picked based on the product configuration when not provided", required = false)
    private String nameOnCards;
}

