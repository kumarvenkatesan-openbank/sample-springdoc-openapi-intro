package sample.persionalized;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PersonalizedCardResponse {


        @Schema(example = "XXXXXXXXXXXX1234", title = "Masked Card Number", required = true)
        private String maskCardNumber;
        @Schema(example = "0100000101001", title = "Card Proxy Number", required = true)
        private String proxyNumber;

}
