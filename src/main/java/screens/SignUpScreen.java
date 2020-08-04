package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import screens.component.popups.ErrorPopUp;

public class SignUpScreen extends BaseScreen {
    public ErrorPopUp errorMessage;

    public final String screenActivityName = "com.happyfresh.modules.SignUp.SignUpActivity";

    @AndroidFindBy(id = "com.happyfresh.android:id/upper_login")
    WebElementFacade textDescriptionScreen;

    @AndroidFindBy(id = "com.happyfresh.android:id/first_name")
    public WebElementFacade fieldFirstName;

    @AndroidFindBy(id = "com.happyfresh.android:id/last_name")
    public WebElementFacade fieldLastName;

    @AndroidFindBy(id = "com.happyfresh.android:id/edittext_email")
    public WebElementFacade fieldEmail;

    @AndroidFindBy(id = "com.happyfresh.android:id/edittext_password")
    public WebElementFacade fieldPassword;

    @AndroidFindBy(id = "com.happyfresh.android:id/sign_up")
    public WebElementFacade buttonSignUp;

    @AndroidFindBy(id="com.happyfresh.android:id/edittext_phone_number")
    public WebElementFacade fieldPhoneNumber;

    @AndroidFindBy(id="com.happyfresh.android:id/button_next")
    private WebElementFacade buttonSubmitPhoneNumber;

    @AndroidFindBy(id="com.happyfresh.android:id/edittext_verify")
    private WebElementFacade fieldVerifyPhoneNumber;

    @AndroidFindBy(id="com.happyfresh.android:id/button_verify_number")
    private WebElementFacade buttonVerifyPhoneNumber;

    @AndroidFindBy(id="com.happyfresh.android:id/skip")
    private WebElementFacade buttonSkip;


    public void submitSignUp(){
        buttonSignUp.waitUntilClickable().click();
    }

    public void setPhoneNumber(String phone){
        fieldPhoneNumber.waitUntilVisible().sendKeys(phone);
    }

    public void submitPhoneNumber(){
        buttonSubmitPhoneNumber.waitUntilClickable().click();
    }
}
