package sample.cardcontrol.addoncard;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AddOnCardServiceData {
    @Schema(example = "01212131331", title = "Card Proxy Number", required = true)
    private String proxyNumber;
    @Schema(example = "01212121212", title = "If field exists addon card link else generate new card and link", required = false)
    private String linkProxyNumber;
    @Schema(example = "OPENCARD", title = "If field exists addon card link else generate new card and link using default card product", required = false)
    private String linkCardProduct;

}
