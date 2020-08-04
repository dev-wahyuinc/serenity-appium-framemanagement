package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Category;
import model.ProductSortOption;
import net.thucydides.core.annotations.Steps;
import serenity.*;

public class FindingItemToBuydefs {
    @Steps
    Location buyerLocationStep;

    @Steps
    ProductSearch productSearch;

    @Steps
    SortProduct sortProduct;

    @Steps
    Market market;

    @Steps
    NavigateTo navigateTo;


    @Given("choose one of the markets")
    public void chooseMarket() {
        market.chooseMarketFromTopPickList(0);
    }

    @Given("set Location to Ragunan")
    public void setLocationToRagunan() {
        buyerLocationStep.setLocation("Ragunan");
    }

    @Given("at Products List from Category Promotions")
    public void atProductsListFromCategoryPromotions() {
        navigateTo.chooseProductsByCategory(Category.PROMOTIONS.getString());
    }

    @When("i sort products by AZ")
    public void iSortProductsByAZ() {
        sortProduct.sortProductBy(ProductSortOption.ATOZ.getString());
    }

    @Then("should display sort by AZ")
    public void shouldDisplaySortByAZ() {
        sortProduct.verifySortExpected(ProductSortOption.ATOZ.getString());
    }
}
