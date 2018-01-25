package com.rs.uk.PageLibrary;

import com.rs.uk.utils.GenericMethods;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class BackplaneAccessories extends GenericMethods {

    By backPlaneAccessoriesParts = By.xpath("//*[@id=\"atbBtn-1\"]");
    By addedMessage = By.xpath("//*[@id='results-table']/tbody/tr[1]/td[3]/div[3]/div/div");


    @Step("click on add button of part by rs stock number")
    public void clickOnAddButtonOfPartByRsStockNo(){
        element(backPlaneAccessoriesParts).click();
    }

    @Step("getting rs stock number of parts")
    public String getRsStockNumberOfParts(){
        By rsStockNoOfParts = By.xpath("//*[@id=\"results-table\"]/tbody/tr[1]/td[2]/div[2]/a");
        return element(rsStockNoOfParts).getText();
    }

    @Step("verify added message is displayed")
    public boolean isAddedMessageDisplay(){
        if (element(addedMessage).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }
}
