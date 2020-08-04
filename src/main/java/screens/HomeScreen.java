package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import screens.component.menu.HeaderMenuHome;
import screens.component.menu.LeftMenuBar;

public class HomeScreen extends BaseScreen {
    public HeaderMenuHome headerMenu;
    public LeftMenuBar leftMenuBar;

    public final String screenActivityName = "com.happyfresh.ui.module.main.MainHomeActivity";

    @AndroidFindBy(id = "com.happyfresh.android:id/component_address_info")
    public WebElementFacade currentLocation;

    // MarketList
//    @AndroidFindBy(id="com.happyfresh.android:id/container")
    String listTopPickMarket = "com.happyfresh.android:id/container";

    public void selectListProductTopPick(int index){
       selectListByIndex(listTopPickMarket,index);
    }

}
