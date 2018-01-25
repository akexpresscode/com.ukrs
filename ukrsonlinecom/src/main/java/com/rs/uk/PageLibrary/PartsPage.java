package com.rs.uk.PageLibrary;

import com.rs.uk.utils.GenericMethods;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class PartsPage extends GenericMethods
{

    By rSStockNo = By.xpath("//*[@id='mainContent']/div[1]/div[1]/div[1]/div[3]/div[1]/ul/li[1]/span[2]");
    By mfrPartNo = By.xpath("//*[@id='mainContent']/div[1]/div[1]/div[1]/div[3]/div[1]/ul/li[3]/span[2]/span");
    @Step("verify same search part is displayed")
    public boolean verifyThatSameSearchPartIsDisplayed(String type, String partNo){
        if ("Mfr. Part No".equalsIgnoreCase(type)){
            element(mfrPartNo).getText().equalsIgnoreCase(partNo);
            return true;
        }else if("RS Stock No".equalsIgnoreCase(type)){
            element(rSStockNo).getText().equalsIgnoreCase(partNo);
            return true;
        }else {
            return false;
        }
    }
}
