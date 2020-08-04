package serenity;

import model.ErrorMessage;
import net.thucydides.core.annotations.Step;
import screens.SignUpScreen;

public class Registration {
    public SignUpScreen signUpScreen;

    @Step("submit registration with firstname={0}, email={1}, password={2}")
    public void submitRegistration(String username, String email, String password) {
        signUpScreen.fieldFirstName.waitUntilVisible().sendKeys(username);
        signUpScreen.fieldEmail.waitUntilVisible().sendKeys(email);
        signUpScreen.fieldPassword.waitUntilVisible().sendKeys(password);
        signUpScreen.buttonSignUp.waitUntilClickable().click();
    }

    @Step("Filled registration with firstname={0}, email={1}, password={2}")
    public void  filledRegistration(String username, String email, String password) {
        signUpScreen.fieldFirstName.waitUntilVisible().sendKeys(username);
        signUpScreen.fieldEmail.waitUntilVisible().sendKeys(email);
        signUpScreen.fieldPassword.waitUntilVisible().sendKeys(password);
    }

}
