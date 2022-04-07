package sample.security.issuarkey;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class IssuerKeyResponse {

        @Schema(example = "#ISSUER", title = "Key id for the issuer key", required = true)
        private String keyid;
        @Schema(example = "020006", title = "Represent the value/key to send the HSM", required = true)
        private String value;

}
