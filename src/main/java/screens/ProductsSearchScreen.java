package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import screens.component.frameloyout.ProductListHeader;

public class ProductsSearchScreen extends BaseScreen {
    public ProductListHeader sortProduct;

    @AndroidFindBy(id = "com.happyfresh.android:id/ui_view_input_product_find_product")
    WebElementFacade fieldSearchProduct;

    String textSearchSuggested ="com.happyfresh.android:id/suggested_name";

   public void setFieldSearchProduct(String product){
       fieldSearchProduct.waitUntilVisible().sendKeys(product);
   }

   public void choosingSearchSuggested(String productName){
       selectListByText(textSearchSuggested, productName);
   }
}
