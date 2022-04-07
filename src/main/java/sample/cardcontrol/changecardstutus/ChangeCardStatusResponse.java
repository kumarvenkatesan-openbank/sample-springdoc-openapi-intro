package sample.cardcontrol.changecardstutus;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ChangeCardStatusResponse {

        @Schema(example = "request status", title = "ChangeCardStatus response", required = true)
        private String status;

}
