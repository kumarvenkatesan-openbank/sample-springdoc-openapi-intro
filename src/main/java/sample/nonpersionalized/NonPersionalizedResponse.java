package sample.nonpersionalized;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "result")
public class NonPersionalizedResponse {
    @Schema(example = "0010000101", title = "Order Reference number to track the request", required = true)
    private String orderReference;

}
