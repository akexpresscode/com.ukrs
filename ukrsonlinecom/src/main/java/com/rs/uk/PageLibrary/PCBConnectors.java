package com.rs.uk.PageLibrary;

import com.rs.uk.utils.GenericMethods;
import org.openqa.selenium.By;


public class PCBConnectors extends GenericMethods
{
    By PCBConnectorsCatList = By.xpath("//*[@id=\"categories\"]/ul/li[1]/div/a");

    /**
     * This method will select category from PCB Connectors list on PCB Connectors cat page.
     */
    public void selectCategoriesOnPCBConnectorsList(){
        mouseHover(PCBConnectorsCatList);
        element(PCBConnectorsCatList).click();
    }
}
