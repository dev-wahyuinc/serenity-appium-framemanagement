package screens.component.popups;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import screens.BaseScreen;

public class ErrorPopUp extends BaseScreen {
    @AndroidFindBy(id = "android:id/content")
    WebElementFacade errorFrame;

    @AndroidFindBy(id = "com.happyfresh.android:id/content")
    WebElementFacade errorContent;

    @AndroidFindBy(id = "com.happyfresh.android:id/buttonDefaultPositive")
    WebElementFacade buttonOk;

    public String getErrorMessage(){
        errorFrame.waitUntilVisible();
       return errorContent.getText();
    }
}
