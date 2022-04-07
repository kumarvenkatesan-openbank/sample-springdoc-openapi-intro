package sample;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;
import sample.CardOrderStatus.CardOrderStatusResponse;
import sample.cardcontrol.addoncard.AddOnCard;
import sample.cardcontrol.addoncard.AddOnCardResponse;
import sample.cardcontrol.cardactivate.CardActivate;
import sample.cardcontrol.cardactivate.CardActivateResponse;
import sample.cardcontrol.cardsettings.CardSettings;
import sample.cardcontrol.cardsettings.CardSettingsResponse;
import sample.cardcontrol.changecardstutus.ChangeCardStatus;
import sample.cardcontrol.customerupdate.CustomerUpdate;
import sample.cardcontrol.customerupdate.CustomerUpdateResponse;
import sample.cardcontrol.getcarddetails.GetCardDetails;
import sample.cardcontrol.getcarddetails.GetCardDetailsResponse;
import sample.cardcontrol.getclearcard.GetClearCard;
import sample.cardcontrol.getclearcard.GetClearCardResponse;
import sample.cardcontrol.getcvv.GetCvv;
import sample.cardcontrol.getcvv.GetCvvResponse;
import sample.cardcontrol.productupgrade.ProductUpgrade;
import sample.cardcontrol.productupgrade.ProductUpgradeResponse;
import sample.cardcontrol.replacecard.ReplaceCard;
import sample.cardcontrol.replacecard.ReplaceCardResponse;
import sample.cardcontrol.setpin.SetPin;
import sample.cardcontrol.setpin.SetPinResponse;
import sample.security.generateCVV.GenerateCVV;
import sample.security.generateCVV.GenerateCVVResponse;
import sample.security.issuarkey.IssuerKey;
import sample.security.issuarkey.IssuerKeyResponse;
import sample.security.networkkey.NetworkKey;
import sample.security.networkkey.NetworkKeyResponse;
import sample.security.networkkey.NetworkKeyServiceData;
import sample.security.storecard.StoreCard;
import sample.security.storecard.StoreCardResponse;
import sample.security.verifycvv.VerifyCVV;
import sample.security.verifycvv.VerifyCVVResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/Security")
public class SecurityManagement {


    @Operation(summary = "IssuerKey")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "IssuerKey Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = IssuerKeyResponse.class)) }) })
    @RequestMapping(path = "/issuerKey/{id}", method = RequestMethod.GET)
    public IssuerKey issuerKey(@Valid  @PathVariable @Schema(example = "#ISSUERKEYID",title = "Unique Issuer key Id",required = true) String id ,@RequestBody IssuerKey issuerKey) {
        return issuerKey;
    }

    @Operation(summary = "NetworkKey")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "NetworkKey Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = NetworkKeyResponse.class)) }) })
    @RequestMapping(path = "/networkKey/{id}", method = RequestMethod.GET)
    public NetworkKey networkKey(@Valid  @Schema(example = "#NETWORKKEYID",title = "Unique Issuer key Id",required = true) @PathVariable String id , @RequestBody NetworkKey networkKey) {
        return networkKey;
    }

    @Operation(summary = "GenerateCVV")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "GenerateCVV Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = GenerateCVVResponse.class)) }) })
    @RequestMapping(path = "/generateCVV", method = RequestMethod.POST)
    public GenerateCVV generateCVV(@Valid  @RequestBody GenerateCVV generateCVV) {
        return generateCVV;
    }

    @Operation(summary = "VerifyCVV")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "NetworkKey Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = VerifyCVVResponse.class)) }) })
    @RequestMapping(path = "/verifyCVV", method = RequestMethod.POST)
    public VerifyCVV verifyCVV(@Valid  @RequestBody VerifyCVV verifyCVV) {
        return verifyCVV;
    }

    @Operation(summary = "StoreCard")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "StoreCard Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = StoreCardResponse.class)) }) })
    @RequestMapping(path = "/storeCard", method = RequestMethod.POST)
    public StoreCard storeCard(@Valid  @RequestBody StoreCard storeCard) {
        return storeCard;
    }


}
