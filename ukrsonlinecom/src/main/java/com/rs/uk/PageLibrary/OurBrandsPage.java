package com.rs.uk.PageLibrary;

import com.rs.uk.utils.GenericMethods;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class OurBrandsPage extends GenericMethods {


    By siemens = By.cssSelector("a.sprite.sprite-brand-13");
    By topBrandsText = By.xpath("//li[@class='ourBrands']/ul/li[1]");


  By barthSTG600LogicControl_siemens = By.xpath(".//*[@id='results-table']/tbody/tr[1]/td[2]/div[1]/a");

  @Step("click on seimens")
  public void clickOnSiemens(){
      clickOnElement(siemens);
      //waitFor(5);
  }
  @Step("verify Top Brand Text")
  public boolean isTopBrandTextDisplayed(){
      if (element(topBrandsText).isDisplayed())
      {
          return true;
      }
      return false;
  }
}


