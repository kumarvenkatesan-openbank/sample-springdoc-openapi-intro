package sample.security.generateCVV;


import lombok.Data;
import sample.security.SecurityDefaultData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class GenerateCVV {

    private SecurityDefaultData defaultData;

    private List<GenerateCVVServiceData> serviceData;




}
