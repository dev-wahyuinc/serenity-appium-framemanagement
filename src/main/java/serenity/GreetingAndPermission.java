package serenity;

import net.thucydides.core.annotations.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import screens.GreetingScreen;
import screens.SplashScreen;
import screens.component.dialogs.AnswerDialog;
import screens.component.dialogs.NoStoreAroundYou;

import static java.util.concurrent.TimeUnit.MINUTES;

public class GreetingAndPermission {
    GreetingScreen greetingScreen;
    SplashScreen splashComponent;
    NoStoreAroundYou noStoreAroundYouDialog;
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingScreen.class);

    @Step("Allow all permission when display")
    public void skipGreetingAndPermissionWhenVisible(){
        if ( greetingScreen.languange.waitUntilVisible().isVisible()){
            LOGGER.info("Greeting is Visible");
            greetingScreen.languange.click();
            greetingScreen.skipFromNextStep();
            LOGGER.info("Allow Greeting");
//            handlePermission();
        } else {
            LOGGER.info("Greeting is Not Visible");
        }
    }

    @Step
    public void handlePermission(){
        if(greetingScreen.permissionDevice.isVisible()){
            greetingScreen.allowPermissionDevice.click();
            greetingScreen.allowPermissionPhotoMedia();
            LOGGER.info("Allow Permission");
        } else {
            LOGGER.info("Permission is Not Visible");
        }
    }

    @Step("Waiting Spash Screen not visible")
    public void waitSplashNotVisible(){
        splashComponent.logoSpash.withTimeoutOf(5,MINUTES).waitUntilNotVisible();
        try {
            LOGGER.info("Splash Screen hilang");
        }catch (Exception e){
            LOGGER.warn("Spalsh masih tampil");
        }
    }

    @Step("Close Pop up confirmation about location")
    public void closePopUpStoreLocation(){
        noStoreAroundYouDialog.answeringDialog(AnswerDialog.OK);
    }
}
