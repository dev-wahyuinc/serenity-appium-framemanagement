package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import model.DisplayStatus;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jsoup.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import screens.component.dialogs.AnswerDialog;
import screens.component.dialogs.NoStoreAroundYou;


public class AdsScreen extends BaseScreen {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdsScreen.class);

    @AndroidFindBy(id = "com.happyfresh.android:id/textview_search_store_home")
    public WebElementFacade buttonNotNow;

    @AndroidFindBy(id = "com.happyfresh.android:id/com_appboy_inappmessage_full_button_dual_two")
    public WebElementFacade buttontellMeMore;

    @AndroidFindBy(id = "com.happyfresh.android:id/com_appboy_inappmessage_full_close_button")
    public WebElementFacade buttonClose;

    public void closeScreenWhenDisplayed() {
        if (isAdsDisplayed().equals(DisplayStatus.DISPLAY))
            buttonClose.click();
        else
            LOGGER.debug("Skip, Ads tidak tampil.");
    }

    public DisplayStatus isAdsDisplayed() {
        return buttonClose.isVisible() ? DisplayStatus.DISPLAY : DisplayStatus.NO_DISPLAY;
    }
}

