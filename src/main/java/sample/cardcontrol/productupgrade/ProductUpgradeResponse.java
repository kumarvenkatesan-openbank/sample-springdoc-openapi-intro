package sample.cardcontrol.productupgrade;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProductUpgradeResponse {

        @Schema(example = "01213141414", title = "proxyNumber", required = true)
        private String proxyNumber;
        @Schema(example = "02", title = "productCode", required = true)
        private String productCode;
}
