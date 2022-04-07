package sample.cardcontrol.getcarddetails;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import lombok.Data;

@Data
@ArraySchema
public class GetCardDetailsResponse {

        private String customerId;
        private String productCode;
        private String title;
        private String firstName;
        private String lastName;
        private String nameOnCard;
        private String dateOfBirth;
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
