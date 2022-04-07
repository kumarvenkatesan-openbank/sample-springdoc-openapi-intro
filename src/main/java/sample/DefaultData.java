package sample;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class DefaultData {

    @Schema(required = true,example = "ZWITCH",title = "Request Initiator id")
    private String source;
    @Schema(required = true,example = "ICIC",title = "Institution Id")
    private String institution;
    @Schema(required = true,example = "01-01-2021 10:10:000",title = "Request Date",format = "timestamp")
    private String requestDate;
    @Schema(required = true,example = "ICIC-USER1",title = "User Id to Initiate request")
    private String userData;

}
