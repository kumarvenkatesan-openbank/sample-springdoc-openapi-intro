package sample.cardcontrol.replacecard;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ReplaceCardServiceData {
    @Schema(example = "01212131331", title = "Card Proxy Number", required = true)
    private String proxyNumber;
    @Schema(example = "01212121212", title = "If field exists addon card link else generate new card and link", required = false)
    private String linkProxyNumber;

}
