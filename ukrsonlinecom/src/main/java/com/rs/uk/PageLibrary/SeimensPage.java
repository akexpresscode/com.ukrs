package com.rs.uk.PageLibrary;

import com.rs.uk.utils.GenericMethods;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SeimensPage extends GenericMethods {
    By logicModules = By.xpath("//*[@id='galleryPopularCategory']/li[2]//a");
    @Step("click on Logic Modules")
    public void clickOnLogicModules(){
        clickOnElement(logicModules);
    }
}
