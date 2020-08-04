package screens.component.frameloyout;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import screens.BaseScreen;

import java.util.List;
import java.util.stream.Collectors;

public class TopPicksHomeFrame extends BaseScreen {
    @AndroidBy(id="com.happyfresh.android:id/account_container")
    WebElementFacade layout;

    @AndroidBy(id="com.happyfresh.android:id/ui_view_preview_title")
    WebElementFacade textTitle;

    @AndroidBy(id="com.happyfresh.android:id/ui_view_preview_subtitle")
    WebElementFacade subTitle;

        public void chooseFirstFromListMarket() {
            List<WebElementFacade> definitionList = find(By.id("com.happyfresh.android:id/container")).waitUntilClickable();
            definitionList.get(0).click();
        }

}

