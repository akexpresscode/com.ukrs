package com.rs.uk.PageLibrary;

import com.rs.uk.utils.GenericMethods;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogicModules extends GenericMethods {
     By barthSTG600LogicControl_siemens = By.xpath("//*[@id='results-table']/tbody/tr[1]/td[2]/div[1]/a");

     By addToBasket = By.xpath("//*[@id='addToCartForm_34480978:addToOrder']");

     By rsStockNoBARTHSTG600 =By.xpath("//*[@id='mainContent']/div[1]/div[1]/div[1]/div[3]/div[1]/ul/li[1]/span[2]");
    @Step("click on BARTH STG-600 LOGIC CONTROL PRODUCT")
     public void clickOnbarthSTG600LogicControlProdcut(){
         clickOnElement(barthSTG600LogicControl_siemens);
     }
     public void clickOnAddToBasketTab(){
         clickOnElement(addToBasket);
         //waitFor(5);
     }

     public String rsStockNoOfProductBARTHstg600(){
         String rsStockNo = element(rsStockNoBARTHSTG600).getText();
         return rsStockNo;
     }
}
