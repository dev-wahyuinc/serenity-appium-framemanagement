package screens.component.frameloyout;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import screens.BaseScreen;

public class MemberOfAccountFrame extends BaseScreen {

    @AndroidBy(id="com.happyfresh.android:id/account_container")
    WebElementFacade layout;

    @AndroidFindBy(id="com.happyfresh.android:id/logout")
    WebElementFacade logOut;

    @AndroidFindBy(id="com.happyfresh.android:id/user_full_name")
    WebElementFacade textFullName;

    public MobileElement lookUpScreen(){
        return androidDriver().findElement(By.id("com.happyfresh.android:id/account_container"));
    }

    public String getMemberName(){
        return textFullName.waitUntilVisible().getText();
    }
}
