package serenity;

import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import screens.*;

public class NavigateTo {
    BaseScreen screen;
    HomeScreen homeScreen;
    MyAccountScreen myAccountScreen;
    StoreHomeScreen storeHomeScreen;
    AdsScreen adsScreen;

    private static final Logger LOGGER = LoggerFactory.getLogger(NavigateTo.class);

//    NavigateTo(){
//        detectedCurrentActivity();
//    }

    private void detectedCurrentActivity(){
        LOGGER.info("Sekarang berada pada Activity - " + screen.getCurrentActivityName());
    }

    public void accessinLoginForm(){
        LOGGER.info("Sekarang berada pada Activity - " + screen.getCurrentActivityName());
        accessToMyAccount();
        accessToLogin();
    }

    public void accessinRegisterForm(){
        LOGGER.info("Sekarang berada pada Activity - " + screen.getCurrentActivityName());
        accessToMyAccount();
        clickSignUp();
    }

    @Step("Click Login text and direct to Register form")
    public void clickSignUp(){
        myAccountScreen.userComponent.directToSignUp();
        LOGGER.info("Sekarang berada pada Activity - " + screen.getCurrentActivityName());
    }

    @Step("Access MyAccount Screen From Home")
    public void accessToMyAccount(){
        homeScreen.headerMenu.openLeftMenu();
        homeScreen.leftMenuBar.clickMenuLoginOrRegister();
        LOGGER.info("Sekarang berada pada Activity - " + screen.getCurrentActivityName());
    }

    @Step("Click Login text and direct to Login form")
    public void accessToLogin(){
        myAccountScreen.userComponent.clickButtonLogin();
        LOGGER.info("Sekarang berada pada Activity - " + screen.getCurrentActivityName());
    }

    @Step("See products by category {0}")
    public void chooseProductsByCategory(String categoryName){
        storeHomeScreen.isCurrentlyInStoreHome();
        adsScreen.closeScreenWhenDisplayed();
        storeHomeScreen.chooseCategory(categoryName);
    }


}
