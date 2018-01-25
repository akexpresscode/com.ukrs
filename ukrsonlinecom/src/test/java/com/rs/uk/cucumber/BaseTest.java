package com.rs.uk.cucumber;

import com.rs.uk.testbase.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class BaseTest extends TestBase
{
    @Before
    public void setUp()
    {
        inIt();
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
