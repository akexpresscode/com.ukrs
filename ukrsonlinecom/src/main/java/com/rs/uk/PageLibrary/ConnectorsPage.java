package com.rs.uk.PageLibrary;

import com.rs.uk.utils.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ConnectorsPage extends GenericMethods
{
    By connectorCatList = By.xpath("html/body/div[6]/div/ul/li[1]/ul/li/a");


    /**
     * This method will select category from Connector categories list on connector cat page.
     */
    public void selectCategoryOnConnectorsCategoriesList(String cat){
        List<WebElement> categories = webElementList(connectorCatList);
        for (WebElement element : categories) {
            if (element.getText().equalsIgnoreCase(cat)){
                element.click();
            }
        }
    }
}
