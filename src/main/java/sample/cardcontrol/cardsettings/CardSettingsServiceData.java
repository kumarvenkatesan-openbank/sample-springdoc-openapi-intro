package sample.cardcontrol.cardsettings;

import lombok.Data;
import sample.DefaultData;

@Data
public class CardSettingsServiceData {

    private Channels channels;
    private String switchOnOff;
    private String enableContactLess;

}
