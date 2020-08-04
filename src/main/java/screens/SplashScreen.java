package screens;

import io.appium.java_client.pagefactory.AndroidBy;
import net.serenitybdd.core.pages.WebElementFacade;
import screens.BaseScreen;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SplashScreen extends BaseScreen {
    @AndroidBy(id="com.happyfresh.android:id/logo")
    public WebElementFacade logoSpash;
}
