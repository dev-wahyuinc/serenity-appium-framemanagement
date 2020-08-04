package serenity;

import net.thucydides.core.annotations.Step;
import screens.HomeScreen;

public class Market {
    HomeScreen homeScreen;

    @Step("Choose market by index {0}")
    public void chooseMarketFromTopPickList(int index) {
        homeScreen.selectListProductTopPick(index);
    }
}
