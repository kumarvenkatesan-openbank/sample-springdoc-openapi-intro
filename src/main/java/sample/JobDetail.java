package sample;


import io.swagger.v3.oas.annotations.media.Schema;

public class JobDetail {

    @Schema(example = "job1",title = "Unique Job Id",required = true)
    private String jobName;
    private String jobDesc;
    private char jobStatus;
    private String cronExpression;
    private String targetDate;
    private ApiDetail apiDetail;
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public char getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(char jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    public ApiDetail getApiDetail() {
        return apiDetail;
    }

    public void setApiDetail(ApiDetail apiDetail) {
        this.apiDetail = apiDetail;
    }



}
