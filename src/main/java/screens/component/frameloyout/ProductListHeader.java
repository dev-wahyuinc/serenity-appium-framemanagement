package screens.component.frameloyout;

import io.appium.java_client.pagefactory.AndroidFindBy;
import model.ProductSortOption;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webelements.RadioButtonGroup;
import org.jetbrains.annotations.NotNull;
import screens.BaseScreen;

import java.util.List;

public class ProductListHeader extends BaseScreen {

    @AndroidFindBy(xpath = "//android.widget.RadioGroup[@resource-id='com.happyfresh.android:id/sort_by_options']/android.widget.RadioButton")
    List<WebElementFacade> listsSortBy;

    @AndroidFindBy(id = "com.happyfresh.android:id/ui_view_product_list_page_sortby_container")
    WebElementFacade selectButtonSortByOption;

    @AndroidFindBy(id = "com.happyfresh.android:id/ui_view_product_list_page_sortby_item_text")
    public WebElementFacade textSortBy;

    public void choosingSortOption(String text){
        selectButtonSortByOption.waitUntilClickable().click();
        super.selectListByText(listsSortBy,text);
    }
}
