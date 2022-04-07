package sample.security.verifycvv;


import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import sample.security.SecurityDefaultData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class VerifyCVV {

    private SecurityDefaultData defaultData;

    private VerifyCVVServiceData serviceData;


}
