package com.rs.uk.testbase;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class TestBase
{
    public static Properties Repository = new Properties();
    public File f;
    public FileInputStream fI;
    public static WebDriver driver;
    public static final Logger log = Logger.getLogger(TestBase.class.getName());

    public TestBase()
    {
        PageFactory.initElements(driver,this);
    }



    /**
     * This method will initiate the browser
     */
    public void inIt(){
        log.info("Opening the browser");
        loadPropertiesFile();
        String log4jConfPath = "src\\main\\java\\com\\rs\\uk\\config\\config.properties";
        PropertyConfigurator.configure(log4jConfPath);
        selectBrowser(Repository.getProperty("browser"));
        driver.get(Repository.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * This method will close the browser
     */
    public void closeBrowser(){
        log.info("closing the browser");
        driver.quit();
    }

    /**
     * This method is load Properties from config.properties file
     */
    public void loadPropertiesFile(){
        f = new File("src\\main\\java\\com\\rs\\uk\\config\\config.properties");
        try {
            fI = new FileInputStream(f);
            Repository.load(fI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method initialize browser object
     * @param browser
     * @return
     */
    public WebDriver selectBrowser(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            return driver;
        }else if (browser.equalsIgnoreCase("chrome")){
            System.out.println("Chrome browser started");
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }else if (browser.equalsIgnoreCase("ie")){
            System.out.println("IE browser started");
            System.setProperty("webdriver.IE.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            return driver;
        }else {
            System.out.println("Wrong browser name");
            return null;
        }
    }

    /**
     * This Method is used for sleep driver for specified time
     * @param sec
     */
    public void waitFor(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
