package sample.cardcontrol.getclearcard;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class GetClearCardResponse {

        @Schema(example = "A#FFWFSGF@@@$@@@@", title = "Full Card Number- With encrypted", required = true)
        private String cardNumber;
        @Schema(example = "2501", title = "YYMM format expiry date", required = true)
        private String expiryDate;

}
