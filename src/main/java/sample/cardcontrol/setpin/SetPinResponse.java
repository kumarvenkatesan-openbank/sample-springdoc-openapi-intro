package sample.cardcontrol.setpin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class SetPinResponse {

        @Schema(example = "request status", title = "set pin response", required = true)
        private String status;

}
