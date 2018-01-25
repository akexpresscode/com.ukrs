$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/e2e.feature");
formatter.feature({
  "line": 2,
  "name": "End to end functionality to buy product",
  "description": "As a user\r\nI should buy product successfully",
  "id": "end-to-end-functionality-to-buy-product",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@e2e"
    }
  ]
});
formatter.before({
  "duration": 61361082951,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add product Connectors in to basket",
  "description": "",
  "id": "end-to-end-functionality-to-buy-product;add-product-connectors-in-to-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on All Product Tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select category from \u0027Connectors\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select sub-category from \u0027PCBConnectors\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select category pats from \u0027Backplane Accessories\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on Add button of selected part by \u0027476-457\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I add product in to basket successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click on Basket on right hand top corner",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on Checkout",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 2725089029,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAllProductTab()"
});
formatter.result({
  "duration": 11979269195,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectCategoryFromConnectors()"
});
formatter.result({
  "duration": 2510073563,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectSubCategoryFromPCBConnectors()"
});
formatter.result({
  "duration": 111537,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectCategoryPatsFromBackplaneAccessories()"
});
formatter.result({
  "duration": 17899022868,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAddButtonOfSelectedPartBy()"
});
formatter.result({
  "duration": 10363601519,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAddProductInToBasketSuccessfully()"
});
formatter.result({
  "duration": 1079950470,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnBasketOnRightHandTopCorner()"
});
formatter.result({
  "duration": 13307575317,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCheckout()"
});
formatter.result({
  "duration": 6993967064,
  "status": "passed"
});
formatter.after({
  "duration": 8577805504,
  "status": "passed"
});
formatter.before({
  "duration": 44291658573,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Add product from Our Brands in to basket",
  "description": "",
  "id": "end-to-end-functionality-to-buy-product;add-product-from-our-brands-in-to-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I click on Our Brands on home page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click on SEIMENS",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on Logic Modul under Popular categories for Siemens",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on product \u0027BARTH STG-600\u0027 Logic Control",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on Add to Basket tab next to quantity",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on Basket on right hand top corner",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Product should be added to basket page successsfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 3779034,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnOurBrandsOnHomePage()"
});
formatter.result({
  "duration": 684458276,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSEIMENS()"
});
formatter.result({
  "duration": 562563655,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLogicModulUnderPopularCategoriesForSiemens()"
});
formatter.result({
  "duration": 17570262089,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnProductBARTHSTGLogicControl()"
});
formatter.result({
  "duration": 19539190457,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAddToBasketTabNextToQuantity()"
});
formatter.result({
  "duration": 2994813518,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnBasketOnRightHandTopCorner()"
});
formatter.result({
  "duration": 12216510822,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: Element not found in the cache - perhaps the page has changed since it was looked up\nCommand duration or timeout: 10.85 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027RAINBOW\u0027, ip: \u0027192.168.1.244\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d47.0.1, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: e1792b08-d590-4727-bac6-de8a27bf0c44\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat com.rs.uk.utils.GenericMethods.clickOnElement(GenericMethods.java:28)\r\n\tat com.rs.uk.PageLibrary.BasketPage.clickOnBasketTab(BasketPage.java:16)\r\n\tat com.rs.uk.cucumber.MyStepdefs.iClickOnBasketOnRightHandTopCorner(MyStepdefs.java:135)\r\n\tat ✽.And I click on Basket on right hand top corner(src/test/resources/features/e2e.feature:26)\r\nCaused by: org.openqa.selenium.StaleElementReferenceException: Element not found in the cache - perhaps the page has changed since it was looked up\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027RAINBOW\u0027, ip: \u0027192.168.1.244\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.fxdriver.cache.getElementAt(resource://fxdriver/modules/web-element-cache.js:9454)\r\n\tat \u003canonymous class\u003e.Utils.getElementAt(file:///C:/Users/User/AppData/Local/Temp/anonymous7602284930214940436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:9039)\r\n\tat \u003canonymous class\u003e.fxdriver.preconditions.visible(file:///C:/Users/User/AppData/Local/Temp/anonymous7602284930214940436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:10090)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.checkPreconditions_(file:///C:/Users/User/AppData/Local/Temp/anonymous7602284930214940436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12644)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/User/AppData/Local/Temp/anonymous7602284930214940436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/User/AppData/Local/Temp/anonymous7602284930214940436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:625)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.productShouldBeAddedToBasketPageSuccesssfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4859416273,
  "status": "passed"
});
formatter.uri("src/test/resources/features/search.feature");
formatter.feature({
  "line": 2,
  "name": "Search functionality",
  "description": "As a user,\r\nI should be able to use search functionality on uk.rs-online.com",
  "id": "search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.before({
  "duration": 29563111889,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Search box on home page",
  "description": "",
  "id": "search-functionality;search-box-on-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I enter url in to browser bar",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should navigate to homepage successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I should see a search box successfully",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iEnterUrlInToBrowserBar()"
});
formatter.result({
  "duration": 3291766,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToHomepageSuccessfully()"
});
formatter.result({
  "duration": 251234826,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeASearchBoxSuccessfully()"
});
formatter.result({
  "duration": 1120050475,
  "status": "passed"
});
formatter.after({
  "duration": 4365659287,
  "status": "passed"
});
formatter.before({
  "duration": 41353345290,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Should list items containing certain keyword",
  "description": "",
  "id": "search-functionality;should-list-items-containing-certain-keyword",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I want to buy a Batteries",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I search for items containing \"Batteries\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should only see items related to \"Batteries\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iWantToBuyABatteries()"
});
formatter.result({
  "duration": 4513478,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Batteries",
      "offset": 31
    }
  ],
  "location": "MyStepdefs.iSearchForItemsContaining(String)"
});
formatter.result({
  "duration": 14280395201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Batteries",
      "offset": 36
    }
  ],
  "location": "MyStepdefs.iShouldOnlySeeItemsRelatedTo(String)"
});
formatter.result({
  "duration": 2276090620,
  "status": "passed"
});
formatter.after({
  "duration": 3503550524,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Should list items containing certain parts numbers",
  "description": "",
  "id": "search-functionality;should-list-items-containing-certain-parts-numbers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "I want to buy items using \"\u003ctype\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter \"\u003cpartnumber\u003e\" in to search box",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should only see item with \"\u003ctype\u003e\" and \"\u003cpartnumber\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "search-functionality;should-list-items-containing-certain-parts-numbers;",
  "rows": [
    {
      "cells": [
        "type",
        "partnumber"
      ],
      "line": 23,
      "id": "search-functionality;should-list-items-containing-certain-parts-numbers;;1"
    },
    {
      "cells": [
        "Mfr. Part No",
        "CSCAK/1"
      ],
      "line": 24,
      "id": "search-functionality;should-list-items-containing-certain-parts-numbers;;2"
    },
    {
      "cells": [
        "RS Stock No",
        "537-5488"
      ],
      "line": 25,
      "id": "search-functionality;should-list-items-containing-certain-parts-numbers;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 36051831739,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Should list items containing certain parts numbers",
  "description": "",
  "id": "search-functionality;should-list-items-containing-certain-parts-numbers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I want to buy items using \"Mfr. Part No\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter \"CSCAK/1\" in to search box",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should only see item with \"Mfr. Part No\" and \"CSCAK/1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Mfr. Part No",
      "offset": 27
    }
  ],
  "location": "MyStepdefs.iWantToBuyItemsUsing(String)"
});
formatter.result({
  "duration": 2580008,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CSCAK/1",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterInToSearchBox(String)"
});
formatter.result({
  "duration": 11157006170,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mfr. Part No",
      "offset": 29
    },
    {
      "val": "CSCAK/1",
      "offset": 48
    }
  ],
  "location": "MyStepdefs.iShouldOnlySeeItemWithAnd(String,String)"
});
formatter.result({
  "duration": 5472104108,
  "status": "passed"
});
formatter.after({
  "duration": 4493010726,
  "status": "passed"
});
formatter.before({
  "duration": 38585060152,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Should list items containing certain parts numbers",
  "description": "",
  "id": "search-functionality;should-list-items-containing-certain-parts-numbers;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Search"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I want to buy items using \"RS Stock No\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter \"537-5488\" in to search box",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should only see item with \"RS Stock No\" and \"537-5488\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "RS Stock No",
      "offset": 27
    }
  ],
  "location": "MyStepdefs.iWantToBuyItemsUsing(String)"
});
formatter.result({
  "duration": 3846145,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "537-5488",
      "offset": 9
    }
  ],
  "location": "MyStepdefs.iEnterInToSearchBox(String)"
});
formatter.result({
  "duration": 10333425966,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RS Stock No",
      "offset": 29
    },
    {
      "val": "537-5488",
      "offset": 47
    }
  ],
  "location": "MyStepdefs.iShouldOnlySeeItemWithAnd(String,String)"
});
formatter.result({
  "duration": 4563055648,
  "status": "passed"
});
formatter.after({
  "duration": 4994460001,
  "status": "passed"
});
});