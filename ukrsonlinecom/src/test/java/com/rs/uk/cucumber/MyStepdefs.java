package com.rs.uk.cucumber;

import com.rs.uk.PageLibrary.*;
import com.rs.uk.testbase.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.testng.Assert;


public class MyStepdefs extends TestBase {


    HomePage homePage;
    CategoriesPage cP;
    PartsPage partsPage;
    BackplaneAccessories bA;
    BasketPage basketPage;
    ConnectorsPage connectorsPage;
    PCBConnectors pcbConnectors;
    SeimensPage seimensPage;
    OurBrandsPage ourBrandsPage;
    LogicModules logicModules;
    String actualRsStockNo;
    String expectedRsStockNo;
    String actualRsStockNoSTG600=null;
    String expectedRsStockNoSTG600=null;



    public MyStepdefs() {
        homePage =new HomePage();
        cP = new CategoriesPage();
        partsPage = new PartsPage();
        bA = new BackplaneAccessories();
        basketPage = new BasketPage();
        connectorsPage = new ConnectorsPage();
        pcbConnectors = new PCBConnectors();
        ourBrandsPage = new OurBrandsPage();
        seimensPage = new SeimensPage();
        logicModules = new LogicModules();
    }

    @When("^I enter url in to browser bar$")
    public void iEnterUrlInToBrowserBar()  {

    }

    @Then("^I should navigate to homepage successfully$")
    public void iShouldNavigateToHomepageSuccessfully()  {
        Assert.assertTrue(homePage.verifyPageTitle());
    }

    @And("^I should see a search box successfully$")
    public void iShouldSeeASearchBoxSuccessfully()  {
        Assert.assertTrue(homePage.isSearchBoxDisplay(),"SearchBox is not display on homepage");

    }

    @Given("^I want to buy a Batteries$")
    public void iWantToBuyABatteries()  {

    }

    @When("^I search for items containing \"([^\"]*)\"$")
    public void iSearchForItemsContaining(String keyword)  {
        homePage.typeKeywordInSearchBox(keyword);
        homePage.clickOnSearchButton();

    }

    @Then("^I should only see items related to \"([^\"]*)\"$")
    public void iShouldOnlySeeItemsRelatedTo(String keyword)  {
        Assert.assertTrue(cP.isSearchItemByKeywordInList(keyword));

    }

    @Given("^I want to buy items using \"([^\"]*)\"$")
    public void iWantToBuyItemsUsing(String type)  {

    }

    @When("^I enter \"([^\"]*)\" in to search box$")
    public void iEnterInToSearchBox(String partNo)  {
        homePage.typeKeywordInSearchBox(partNo);
        homePage.clickOnSearchButton();
    }

    @Then("^I should only see item with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iShouldOnlySeeItemWithAnd(String type, String partNo)  {
        Assert.assertTrue(partsPage.verifyThatSameSearchPartIsDisplayed(type,partNo),"Same parts is not display");
    }

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage()  {


    }


    @When("^I click on All Product Tab$")
    public void iClickOnAllProductTab()  {

        homePage.clickOnAllProductsTab();


    }
    @And("^I select category from 'Connectors'$")
    public void iSelectCategoryFromConnectors()  {
        homePage.selectCategoriesOnAllProductsTab();
    }

    @And("^I select sub-category from 'PCBConnectors'$")
    public void iSelectSubCategoryFromPCBConnectors()  {

    }

    @And("^I select category pats from 'Backplane Accessories'$")
    public void iSelectCategoryPatsFromBackplaneAccessories()  {
        pcbConnectors.selectCategoriesOnPCBConnectorsList();

    }

    @And("^I click on Add button of selected part by '476-457'$")
    public void iClickOnAddButtonOfSelectedPartBy()  {
        actualRsStockNo =bA.getRsStockNumberOfParts();
        bA.clickOnAddButtonOfPartByRsStockNo();

    }
    @And("^I click on Basket on right hand top corner$")
    public void iClickOnBasketOnRightHandTopCorner()  {
        basketPage.clickOnBasketTab();
        waitFor(10);
        expectedRsStockNo =basketPage.rsStockNumberOfPartsInBasket();
    }


    @Then("^I add product in to basket successfully$")
    public void iAddProductInToBasketSuccessfully() {
        Assert.assertTrue(bA.isAddedMessageDisplay());
    }


    @And("^I click on Checkout$")
    public void iClickOnCheckout()  {
        basketPage.clickOnCheckOutSecurelyAndPuchBtn();
    }



    @When("^I click on Our Brands on home page$")
    public void iClickOnOurBrandsOnHomePage()  {
        homePage.clickOnOurBrands();

    }

    @And("^I click on SEIMENS$")
    public void iClickOnSEIMENS() {
        ourBrandsPage.clickOnSiemens();
    }

    @And("^I click on Logic Modul under Popular categories for Siemens$")
    public void iClickOnLogicModulUnderPopularCategoriesForSiemens()  {
        seimensPage.clickOnLogicModules();
    }

    @And("^I click on product 'BARTH STG-600' Logic Control$")
    public void iClickOnProductBARTHSTGLogicControl()  {
        logicModules.clickOnbarthSTG600LogicControlProdcut();
        expectedRsStockNoSTG600 = logicModules.rsStockNoOfProductBARTHstg600();
    }

    @And("^I click on Add to Basket tab next to quantity$")
    public void iClickOnAddToBasketTabNextToQuantity()  {

        logicModules.clickOnAddToBasketTab();
    }


    @Then("^Product should be added to basket page successsfully$")
    public void productShouldBeAddedToBasketPageSuccesssfully() {
        basketPage.clickOnBasketTab();
        actualRsStockNoSTG600 = basketPage.rsStockNoOfProductBARTHstg600();
        Assert.assertEquals(actualRsStockNoSTG600,expectedRsStockNoSTG600);
    }
}
