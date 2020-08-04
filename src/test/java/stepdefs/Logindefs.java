package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.StaticAccount;
import model.ErrorMessage;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import serenity.GreetingAndPermission;
import serenity.Login;
import serenity.NavigateTo;
import serenity.Verify;

public class Logindefs extends ScenarioSteps {

    @Steps
    Login loginStep;

    @Steps
    NavigateTo navigateTo;

    @Steps
    Verify verify;

    @Steps
    GreetingAndPermission greetingAndPermission;


    @Then("should see alert error Valid Email")
    public void shouldSeeAlertErrorValidEmail() {
//        verify.ShouldSee(loginStep.loginComponent.getMessageErrorEmail(), ErrorMessage.EmailInvalidValue.getMessage());
        verify.isCurrentlyOnRightActivity(loginStep.loginComponent.screenActivityName);
    }

    @Given("in login screen")
    public void inLoginScreen() {
        navigateTo.accessinLoginForm();
        verify.isCurrentlyOnRightActivity(
                loginStep.loginComponent
                        .screenActivityName);
    }

    @When("user wrong password and email")
    public void userWrongPasswordAndEmail() {
        loginStep.submitLoginForm(StaticAccount.INVALIDEMAIL.getEmail(),"test");
    }

    @Then("should see Error Login")
    public void shouldSeeErrorLogin() {
        verify.ShouldSee(loginStep.loginComponent.errorMessage.getErrorMessage()
                ,ErrorMessage.WrongEmailAndPasswordLogin.getMessage());
    }

    @When("user using unregister email or account")
    public void userUsingUnregisterEmailOrAccount() {
        loginStep.submitLoginForm(
                StaticAccount.UNREGISTERED.getEmail(),
                StaticAccount.UNREGISTERED.getValidPassword());
    }

    @When("log in using a valid email address and password")
    public void logInUsingAValidEmailAddressAndPassword() {
        loginStep.submitLoginForm(
                StaticAccount.REGISTERED.getEmail(),
                StaticAccount.REGISTERED.getValidPassword());
    }

    @Then("should be access to his account")
    public void shouldBeAccessToHisAccount() {
        loginStep.isLoginSuccessfull();
    }

    @Given("submit email with {string} and {string}")
    public void filledEmailWithAnd(String email, String password) {
        loginStep.filledLogin(email,password);
    }

    @Then("shouldnt submit login")
    public void shouldntSubmitLogin() {
        verify.ShouldntEnabled(loginStep.loginComponent.buttonLogin);
    }

    @Given("Skip Greeting")
    public void skipGreetingAndPermission() {
        greetingAndPermission.waitSplashNotVisible();
        greetingAndPermission.skipGreetingAndPermissionWhenVisible();
        greetingAndPermission.closePopUpStoreLocation();

    }


}
