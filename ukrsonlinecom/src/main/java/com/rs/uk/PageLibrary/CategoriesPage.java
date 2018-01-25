package com.rs.uk.PageLibrary;

import com.rs.uk.utils.GenericMethods;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;
import java.util.List;


public class CategoriesPage extends GenericMethods
{
    By categoriesList = By.xpath("//*[@id='categories']/ul/li/div/a");
    By autotransformer =By.xpath(".//*[@id='categories']/ul/li[2]/div/a");


    @Step("Checking item {0} by keyword in list" )
    public boolean isSearchItemByKeywordInList(String keyword){

        List<WebElement> elementList = webElementList(categoriesList);
        for (WebElement element:elementList){
            System.out.println(element.getText());
            if (element.getText().contains(keyword)){
                return true;
            }
        }
        return false;
    }

//  @Step("click on auto transformers")
//    public void clickOnAutotransformers()
//    {
//        clickOnElement(autotransformer);
//    }

}
