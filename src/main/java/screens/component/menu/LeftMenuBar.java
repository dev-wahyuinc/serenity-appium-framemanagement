package screens.component.menu;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import screens.BaseScreen;

public class LeftMenuBar extends BaseScreen {
    @AndroidFindBy(id = "com.happyfresh.android:id/ui_view_user_info_email")
    WebElementFacade menuNavigateLoginOrRegister;

    public void clickMenuLoginOrRegister(){
        menuNavigateLoginOrRegister.waitUntilClickable().click();
    }

}
