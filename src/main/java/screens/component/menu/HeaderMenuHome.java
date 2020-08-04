package screens.component.menu;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import screens.BaseScreen;

public class HeaderMenuHome extends BaseScreen {
    @AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'com.happyfresh.android:id/toolbar')]/android.widget.ImageButton")
    WebElementFacade buttonShowAllLeftMenu;

    public void openLeftMenu(){
        buttonShowAllLeftMenu.waitUntilVisible().click();
    }
}
