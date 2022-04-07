package sample;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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

import javax.validation.Valid;

@RestController
@RequestMapping("/CardControl")
public class CardControl {


    @Operation(summary = "CardActivate")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "CardActivate Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CardActivateResponse.class)) }) })
    @RequestMapping(path = "/cardActivate", method = RequestMethod.POST)
    public CardActivate cardActivate(@Valid @RequestBody CardActivate cardActivate) {
        return cardActivate;
    }


    @Operation(summary = "Set Pin")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Set Pin Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = SetPinResponse.class)) }) })
    @RequestMapping(path = "/setPin", method = RequestMethod.POST)
    public SetPin setPin(@Valid @RequestBody SetPin setPin) {
        return setPin;
    }

    @Operation(summary = "Change Card Status")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Change Card Status Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CardOrderStatusResponse.class)) }) })
    @RequestMapping(path = "/changeCardStatus", method = RequestMethod.POST)
    public ChangeCardStatus changeCardStatus(@Valid @RequestBody ChangeCardStatus changeCardStatus) {
        return changeCardStatus;
    }

    @Operation(summary = "Get Card Details" )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get Card Details Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = GetCardDetailsResponse.class)) }) })
    @RequestMapping(path = "/getCardDetails", method = RequestMethod.POST)
    public GetCardDetails getCardDetails(@Valid @RequestBody GetCardDetails getCardDetails) {
        return getCardDetails;
    }

    @Operation(summary = "GetClearCard Details" )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "GetClearCard Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = GetClearCardResponse.class)) }) })
    @RequestMapping(path = "/getClearCard", method = RequestMethod.POST)
    public GetClearCard getClearCard(@Valid @RequestBody GetClearCard getClearCard) {
        return getClearCard;
    }

    @Operation(summary = "getCvv Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "getCvv Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = GetCvvResponse.class)) }) })
    @RequestMapping(path = "/getCvv", method = RequestMethod.POST)
    public GetCvv getCvv(@Valid @RequestBody GetCvv getCvv) {
        return getCvv;
    }

    @Operation(summary = "CardSettings Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "CardSettings Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CardSettingsResponse.class)) }) })
    @RequestMapping(path = "/cardSettings", method = RequestMethod.POST)
    public CardSettings cardSettings(@Valid @RequestBody CardSettings cardSettings) {
        return cardSettings;
    }

    @Operation(summary = "AddOnCard Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "AddOnCard Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = AddOnCardResponse.class)) }) })
    @RequestMapping(path = "/addOnCard", method = RequestMethod.POST)
    public AddOnCard addOnCard(@Valid @RequestBody AddOnCard addOnCard) {
        return addOnCard;
    }

    @Operation(summary = "ReplaceCard Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ReplaceCard Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ReplaceCardResponse.class)) }) })
    @RequestMapping(path = "/replaceCard", method = RequestMethod.POST)
    public ReplaceCard replaceCard(@Valid @RequestBody ReplaceCard replaceCard) {
        return replaceCard;
    }

    @Operation(summary = "ProductUpgrade Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ProductUpgrade Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ProductUpgradeResponse.class)) }) })
    @RequestMapping(path = "/productUpgrade", method = RequestMethod.POST)
    public ProductUpgrade productUpgrade(@Valid @RequestBody ProductUpgrade productUpgrade) {
        return productUpgrade;
    }

    @Operation(summary = "CustomerUpdate Details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "CustomerUpdate Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CustomerUpdateResponse.class)) }) })
    @RequestMapping(path = "/customerUpdate", method = RequestMethod.POST)
    public CustomerUpdate customerUpdate(@Valid @RequestBody CustomerUpdate customerUpdate) {
       //

        return customerUpdate;
    }
}
