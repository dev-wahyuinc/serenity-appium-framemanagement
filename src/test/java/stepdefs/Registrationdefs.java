package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Account;
import model.ErrorMessage;
import model.StaticAccount;
import net.thucydides.core.annotations.Steps;
import serenity.NavigateTo;
import serenity.Registration;
import serenity.Verify;
import utils.RandomNumber;

public class Registrationdefs {
    @Steps
    NavigateTo navigateTo;

    @Steps
    Registration registrationStep;

    @Steps
    Verify verify;

    Account acc = new Account();

    @Then("should see alert message minimum password character")
    public void shouldSeeAlertMessageMinumumPassword() {
        verify.ShouldSee(
                registrationStep.signUpScreen.errorMessage.getErrorMessage(),
                ErrorMessage.PasswordIsToShort.getMessage()
        );
        
    }

    @Given("access register screen")
    public void accessRegisterScreen() {
        navigateTo.accessinRegisterForm();
        verify.isCurrentlyOnRightActivity(
                registrationStep.signUpScreen
                        .screenActivityName);
    }

    @Then("register successfull")
    public void registerSuccessfull() {
        
    }

    @When("register using valid data")
    public void registerUsingValidData() {
        
    }

    @When("register using {string}")
    public void registerUsing(String password) {
        registrationStep.submitRegistration(acc.getUsername(),acc.getEmail(),password);
        
    }

    @When("register using email has registered")
    public void registerUsingEmailHasRegistered() {
        registrationStep.submitRegistration(
                acc.getUsername(),
                StaticAccount.REGISTERED.getEmail(),
                StaticAccount.REGISTERED.getValidPassword());
    }

    @When("register using {string} {string} {string}")
    public void registerUsing(String name, String email, String password) {
        registrationStep.filledRegistration(name,email,password);
    }

    @Then("shouldnt be able submit")
    public void shouldntBeAbleSubmit() {
        verify.ShouldntEnabled(
                registrationStep.signUpScreen.buttonSignUp
        );
    }

    @Then("should see alert message invalid register")
    public void shouldSeeAlertMessageInvalidRegister() {
        verify.ShouldSee(
                registrationStep.signUpScreen.errorMessage.getErrorMessage(),
                ErrorMessage.EmailIsRegistered.getMessage()
        );
    }

    @When("filled valid data")
    public void filledValidData() {
        registrationStep.submitRegistration(
                acc.getUsername(),
                "sap"+ RandomNumber.randomIntegerUntilHundred()+"@sap.com",
                acc.getPassword());
    }
}
