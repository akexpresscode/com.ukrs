package com.rs.uk.PageLibrary;

import com.rs.uk.utils.GenericMethods;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class HomePage extends GenericMethods
{
    By searchBox = By.id("searchTerm");
    By searchButton = By.id("btnSearch");
    By allProductTab = By.xpath("//*[@class='headerContainer']/div/ul/li[1]/a");
    //("//div[@class='headerContainer']/div/ul/li/a[@title='All Products']");
    By ourBrandsTab = By.xpath("//*[@class='headerContainer']/div/ul/li[2]/a");




    /**
     * This method will click on search box field on home page.
     */

    @Step("click on Search box" )
    public void clickOnSearchBox(){
        clickOnElement(searchBox);
    }

    /**
     * This method will click on search button on home page.
     */
    @Step("click on search button")
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }

    /**
     * This method will click on All Products Tab on home page.
     */
    @Step("click on All Products Tab")
    public void clickOnAllProductsTab(){
        clickOnElement(allProductTab);
        waitFor(10);
    }

    /**
     * This method will select categories on home page.
     */
    @Step("selection of categories on AllProducts Tab")
    public void selectCategoriesOnAllProductsTab(){
        By Connectors = By.xpath("/html/body/div[3]/div/ul/li[1]/ul/li[3]/a");
        mouseHover(Connectors);
        By PCBConnector = By.xpath("/html/body/div[3]/div/ul/li[1]/ul/li[3]/div/ul[2]/li[4]/a");
        mouseHover(PCBConnector);
        element(PCBConnector).click();
    }



    /**
     * This method will type the text in search box on home page.
     * @param keyword
     */
    @Step("type keyword {0} in search box")
    public void typeKeywordInSearchBox(String keyword){
        sendTextToField(searchBox,keyword);
    }

    /**
     * This method will check search box field displayed on home page
     * @return
     */
    @Step("verify search box is displayed")
    public boolean isSearchBoxDisplay(){
        try {
            element(searchBox).isDisplayed();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * This method will verify page tile of home page
     * @return
     */
    @Step("verify Page Title")
    public boolean verifyPageTitle() {
        log.info("verifying page title");
        String title = "RS Components | Electronic and Electrical Components";
        if (title.equalsIgnoreCase(driver.getTitle())) {
            return true;
        } else {
            return false;
        }
    }
    @Step("click on Our Brands")
    public void clickOnOurBrands(){
        clickOnElement(ourBrandsTab);
    }



}
