package sample.cardcontrol.cardactivate;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CardActivateResponse {

        @Schema(example = "request status", title = "CardActivate response", required = true)
        private String status;

}
