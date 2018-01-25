package com.rs.uk.utils;

import com.rs.uk.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GenericMethods extends TestBase
{
    /**
     * This Method is used for return web element to passing locator
     * @param by
     * @return
     */
    public static WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;
    }

    /**
     * This method is used for click on Element or Object
     */
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    /**
     * This method is used for send Text to Element or Field
     */
    public static void sendTextToField(By by,String string){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(string);
    }

    /**
     * This method is used for Is Element or Text Display on UI
     */
    public static boolean isElementOrTextDisplay(By by){
        try {
            driver.findElement(by).isDisplayed();
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    /**
     * This method is used for returns the list of web elements
     */
    public static List<WebElement> webElementList(By by){
      List<WebElement> elementsList = driver.findElements(by);
      return elementsList;
    }

    /**
     * This method is for select visible text from Dropdown Menu.
     * @param text
     * @param by
     */
    public void selectVisibleTextFromDropDownMenu(By by,String text){
        Select dropDown =new Select(element(by));
        dropDown.selectByVisibleText(text);
    }

    /**
     * This method is for select by value from Dropdown Menu.
     * @param value
     * @param by
     */
    public void selectByValueFromDropDownMenu(By by,String value){
        Select dropDown =new Select(element(by));
        dropDown.selectByValue(value);
    }

    // Mouse hover any element
    public void mouseHover(By by) {
        WebElement e = element(by);
        Actions actions = new Actions(driver);
        WebElement mouse = e;
        actions.moveToElement(mouse).build().perform();
    }
}