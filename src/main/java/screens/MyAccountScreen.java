package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import screens.component.frameloyout.UserOfMyAccountFrame;
import screens.component.frameloyout.MemberOfAccountFrame;

public class MyAccountScreen extends BaseScreen {
    public UserOfMyAccountFrame userComponent;
    public MemberOfAccountFrame memberFrame;

    @AndroidFindBy(id="com.happyfresh.android:id/login_description")
    WebElementFacade textDescriptionScreen;

    public final String screenActivityName = "com.happyfresh.activities.MyAccountActivity";





}
