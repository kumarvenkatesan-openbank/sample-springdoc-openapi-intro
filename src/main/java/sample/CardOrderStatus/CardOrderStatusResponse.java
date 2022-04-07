package sample.CardOrderStatus;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CardOrderStatusResponse {
        @Schema(example = "PAM", title = "Card Life Cycle Stage /PAN/PIN/EMBOSA", required = true)
        private String currentStage;


}
