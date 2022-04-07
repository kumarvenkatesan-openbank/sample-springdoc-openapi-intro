package sample;
import javax.validation.Valid;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sample.CardOrderStatus.CardOrderStatus;
import sample.CardOrderStatus.CardOrderStatusResponse;
import sample.nonpersionalized.NonPersionalizedCard;
import sample.nonpersionalized.NonPersionalizedResponse;
import sample.persionalized.PersonalizedCard;
import sample.persionalized.PersonalizedCardResponse;

@RestController
@RequestMapping("/CardOrder")
public class CardOrder {

    @Operation(summary = "Non Personalized Card Request / Bulk Inventory card Request")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Bulk Card Request Response",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = NonPersionalizedResponse.class)) }) })
    @RequestMapping(path = "/bulkCardRequest", method = RequestMethod.POST)
    public NonPersionalizedCard nonPersonalizedCard(@Valid @RequestBody NonPersionalizedCard nonPersonalizedCard) {
        return nonPersonalizedCard;
    }

    @Operation(summary = "Personalized Card Request / Single Card Request")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = PersonalizedCardResponse.class)) }) })
    @RequestMapping(path = "/singleCardRequest", method = RequestMethod.POST)
    public PersonalizedCard persionalizedCard(@Valid @RequestBody PersonalizedCard persionalizedCard) {
        return persionalizedCard;
    }


    @Operation(summary = "Card Ordered Status")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CardOrderStatusResponse.class)) }) })
    @RequestMapping(path = "/cardOrderStatus", method = RequestMethod.POST)
    public CardOrderStatus cardOrderStatus(@Valid @RequestBody CardOrderStatus cardOrderStatus) {
        return cardOrderStatus;
    }

}
