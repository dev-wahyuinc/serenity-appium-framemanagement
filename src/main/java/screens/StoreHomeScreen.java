package screens;

import io.appium.java_client.pagefactory.AndroidBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StoreHomeScreen extends BaseScreen {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdsScreen.class);
    public final String screenActivityName = "com.happyfresh.ui.module.storehome.StoreHomeActivity";

    @AndroidBy(id="com.happyfresh.android:id/textview_search_store_home")
    WebElementFacade fieldSearchProduct;

    @AndroidBy(id="com.happyfresh.android:id/ui_view_category_store_home_text_view_see_all")
    public WebElementFacade linkTextSeeAll;

    @AndroidBy(id="com.happyfresh.android:id/ui_view_newsfeed_display_on_store_home_button_see_all")
    public WebElementFacade linkTextSeeAllPromotions;

    public void lookUpSearchScreen(){
        fieldSearchProduct.waitUntilClickable().click();
    }

    public void isCurrentlyInStoreHome(){
        if (getCurrentActivityName().equals(screenActivityName))
            LOGGER.info("Sekarang berada di Screen: "+ getCurrentActivityName());
        else
            throw new NoSuchElementException("Current Activity in " + getCurrentActivityName());
    }

    public void chooseCategory(String categoryName){
        findText(categoryName).click();
    }

}
