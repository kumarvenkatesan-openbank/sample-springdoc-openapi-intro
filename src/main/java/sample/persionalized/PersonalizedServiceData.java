package sample.persionalized;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PersonalizedServiceData {
    @Schema(example = "1000001010", title = "Customer Id", required = true)
    private String customerId;
    @Schema(example = "ICICPRODUCT", title = "Product Id", required = true)
    private String productCode;
    @Schema(example = "Mr", title = "Salutation Code", required = true)
    private String title;
    @Schema(example = "Kumar", title = "First Name", required = true)
    private String firstName;
    @Schema(example = "Venkatesan", title = "Last Name", required = true)
    private String lastName;
    @Schema(example = "Kumar Venkatesan", title = "Name On Card", required = false)
    private String nameOnCard;
    @Schema(example = "01-01-1990", title = "Date of Birth", required = true,format = "date")
    private String dateOfBirth;
    @Schema(example = "1,Car Street", title = "Address 1 field", required = true,format = "date")
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String postalCode;
    private String city;
    private String state;
    private String country;
    private String emailId;
    private String mobileNumber;
    private String idType;
    private String idValue;
    private String accountNumber;
}
