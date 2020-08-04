package serenity;

import model.Category;
import model.ProductSortOption;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import screens.HomeScreen;
import screens.ProductsByCategoryScreen;
import screens.StoreHomeScreen;

public class SortProduct {
    HomeScreen homeScreen;
    StoreHomeScreen storeHomeScreen;
    ProductsByCategoryScreen productsByCategoryScreen;

    @Steps
    NavigateTo navigateTo;

    @Steps
    Verify verify;

    @Step("Sort Product by {0}")
    public void sortProductBy(String sortBy){
        productsByCategoryScreen.productListHeader.choosingSortOption(sortBy);
    }

    public void verifySortExpected(String sortBy){
        verify.ShouldSee(productsByCategoryScreen
                        .productListHeader.
                                textSortBy.
                                waitUntilVisible().getText(),
                sortBy);
    }
}
