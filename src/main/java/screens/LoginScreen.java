package screens;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import screens.component.popups.ErrorPopUp;

import java.util.Arrays;

public class LoginScreen extends BaseScreen {
    private static final Logger LOGGER = LoggerFactory.getLogger(PageObject.class);
    public ErrorPopUp errorMessage;

    public final String screenActivityName = "com.happyfresh.activities.LoginActivity";

    @AndroidFindBy(id = "com.happyfresh.android:id/email")
    public WebElementFacade fieldEmail;

    @AndroidFindBy(id = "com.happyfresh.android:id/password")
    public WebElementFacade fieldPassword;

    @AndroidFindBy(id = "com.happyfresh.android:id/login")
    public WebElementFacade buttonLogin;

    @AndroidFindBy(id = "com.happyfresh.android:id/forgot_password")
    public WebElementFacade linkForgotPassword;

    public void submitLogin(String email, String password){
        fieldEmail.waitUntilVisible().sendKeys(email);
        fieldPassword.sendKeys(password);
        buttonLogin.waitUntilClickable().click();
        LOGGER.info("Login Succesful");
    }

    public String getMessageErrorEmail(){
     //   return androidDriver().findElementByAndroidUIAutomator("new UiSelector().text(\"Login here\")").isDisplayed();
        MobileElement el = (MobileElement) androidDriver().findElement(MobileBy.id("com.happyfresh.android:id/email"));
        JavascriptExecutor js = (JavascriptExecutor) androidDriver();
        Object o = js.executeScript("mobile:backdoor", ImmutableMap.of(
                "target",
                "element",
                "elementId",
                el.getId(),
                "methods",
                Arrays.asList(ImmutableMap.of("name", "getError"))
        ));
        LOGGER.debug("tampilin error message dari field email :" + String.valueOf(o));
        return String.valueOf(o);
    }



}
