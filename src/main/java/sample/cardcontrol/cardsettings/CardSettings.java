package sample.cardcontrol.cardsettings;


import lombok.Data;
import sample.DefaultData;

@Data
public class CardSettings {

    private DefaultData defaultData;
    private CardSettingsServiceData serviceData;


}
