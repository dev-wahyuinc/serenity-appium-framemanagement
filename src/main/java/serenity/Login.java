package serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import screens.LoginScreen;
import screens.MyAccountScreen;

public class Login {
    public LoginScreen loginComponent;
    public MyAccountScreen memberComponent;

    @Steps
    Verify verify;

    public void submitLoginForm(String email, String password){
        filledLogin(email,password);
        loginComponent.buttonLogin.waitUntilClickable().click();
    }

    public void filledLogin(String email, String password){
        loginComponent.fieldEmail.waitUntilVisible().sendKeys(email);
        loginComponent.fieldPassword.sendKeys(password);
    }

    @Step("login succesfull")
    public void isLoginSuccessfull(){
        verify.ShouldBeDisplayed(
                memberComponent.memberFrame.lookUpScreen()
        );
        verify.ShouldSeeTextContain(
                memberComponent.memberFrame.getMemberName(),
                "saprol test"
        );
    }
}
