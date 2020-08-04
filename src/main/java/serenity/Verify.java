package serenity;

import io.appium.java_client.MobileElement;
import model.ErrorMessage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import screens.BaseScreen;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Verify {
    BaseScreen screen;
    @Step
    public void ShouldSee(WebElementFacade actual){
        assertThat(actual.waitUntilPresent().isDisplayed(), is(equalTo(true)));
    }

    @Step("Should be displayed {1}")
    public void ShouldSee(String actual, String expected){
        assertThat(actual, is(equalTo(expected)));
    }

    @Step("Should be displayed {0}")
    public void ShouldBeDisplayed(MobileElement actual){
        assertThat(actual.isDisplayed(), is(equalTo(true)));
    }

    @Step("should see text Contain {1}")
    public void ShouldSeeTextContain(String actual, String expected){
        assertThat(actual, containsString(expected));
    }

    @Step("Should be in right Activity")
    public void isCurrentlyOnRightActivity(String expectedScreen){
        assertThat(screen.getCurrentActivityName(), is(equalTo(expectedScreen)));
    }

    @Step("Shouldnt be able to click")
    public void ShouldntClickable(WebElementFacade element){
        assertThat(element.isClickable(), is(equalTo(false)));
    }

    @Step("Should be disabled button")
    public void ShouldntEnabled(WebElementFacade element){
        element.shouldNotBeEnabled();
    }

}
