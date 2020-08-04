package screens.component.frameloyout;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import screens.BaseScreen;

public class UserOfMyAccountFrame extends BaseScreen {
    @AndroidFindBy(id="com.happyfresh.android:id/signup")
    WebElementFacade buttonSignUp;

    @AndroidFindBy(id="com.happyfresh.android:id/login")
    WebElementFacade linkTextLogIn;

    public void clickButtonLogin(){
        linkTextLogIn.waitUntilClickable().click();
    }
    public void directToSignUp(){
        buttonSignUp.waitUntilClickable().click();
    }
}
