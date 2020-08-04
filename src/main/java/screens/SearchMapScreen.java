package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchMapScreen extends  BaseScreen {

    @AndroidFindBy(id = "com.happyfresh.android:id/search_src_text")
    public WebElementFacade fieldSearchLocation;

    @AndroidFindBy(id="com.happyfresh.android:id/ui_view_suggestion_address_location_primary")
    private WebElementFacade listSearchResult;

    public void chooseLocationFromSearchResult(String location){
        this.selectListByText("com.happyfresh.android:id/ui_view_suggestion_address_location_primary", location);
    }


}
