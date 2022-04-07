package sample;

import io.swagger.v3.oas.annotations.media.Schema;

public class ApiDetail {

    @Schema(required = true)
    private String type;
    private String jksPath;
    private String endPoint;
    private String reqType;
    private String requestBody;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJksPath() {
        return jksPath;
    }

    public void setJksPath(String jksPath) {
        this.jksPath = jksPath;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }
}
