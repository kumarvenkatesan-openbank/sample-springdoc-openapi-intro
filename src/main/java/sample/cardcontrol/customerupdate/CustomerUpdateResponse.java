package sample.cardcontrol.customerupdate;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CustomerUpdateResponse {

        @Schema(example = "200", title = "Updated Status", required = true)
        private String status;

}
