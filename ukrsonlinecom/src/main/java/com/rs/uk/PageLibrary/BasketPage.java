package com.rs.uk.PageLibrary;

import com.rs.uk.utils.GenericMethods;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class BasketPage extends GenericMethods
{
    By basketTab = By.id("js-basketQty");
    By checkoutSecurelyAndPuchBtn = By.id("checkoutSecurelyAndPuchBtn");
    By rsStockNoBARTHstg600 = By.xpath(".//*[@id='shoppingBasketForm:WebBasketLineWidgetActionVALIDATION_ERROR_EVENT']/table/tbody/tr[3]/td[2]/div[2]/span[2]");

    @Step("clicked on basket tab")
    public void clickOnBasketTab(){
        clickOnElement(basketTab);
    }


    @Step("returning rsStock number")
    public String rsStockNumberOfPartsInBasket(){
        By rsStockNo = By.xpath("//*[@id=\"shoppingBasketForm:WebBasketLineWidgetActionVALIDATION_ERROR_EVENT\"]/table/tbody/tr[3]/td[2]/div[2]/span[2]");
        String rsStockNumber = element(rsStockNo).getText();
        return rsStockNumber;
    }

    @Step("click on check out button")
    public void clickOnCheckOutSecurelyAndPuchBtn(){
        clickOnElement(checkoutSecurelyAndPuchBtn);
    }
    public String rsStockNoOfProductBARTHstg600(){
        String rsStock = element(rsStockNoBARTHstg600).getText();
        return rsStock;
    }
}
