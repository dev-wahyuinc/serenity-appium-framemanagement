package serenity;

import net.thucydides.core.annotations.Step;
import screens.HomeScreen;
import screens.SearchMapScreen;
import screens.component.dialogs.AnswerDialog;
import screens.component.dialogs.ThisYourLocation;

public class Location {
    HomeScreen homeComponent;
    SearchMapScreen searchMapScreen;
    ThisYourLocation thisYourLocationDialog;

    @Step("Set location to {0}")
    public void setLocation(String text){
        homeComponent.currentLocation.waitUntilClickable().click();
        searchMapScreen.fieldSearchLocation.waitUntilVisible().sendKeys(text);
        searchMapScreen.chooseLocationFromSearchResult(text);
        thisYourLocationDialog.answeringDialog(AnswerDialog.OK);
    }
}
