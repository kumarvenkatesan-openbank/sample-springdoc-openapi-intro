package sample.cardcontrol.cardsettings;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CardSettingsResponse {

        @Schema(example = "001", title = "CVV- With encrypted", required = true)
        private String cvv;
        @Schema(example = "2501", title = "YYMM format expiry date", required = true)
        private String expiryDate;

}
