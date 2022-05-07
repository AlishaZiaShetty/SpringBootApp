package com.ea.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkInitialize extends Base
{
    WebDriver driver = null;
    public void initializeBrowser(BrowserType browserType)
    {

        switch (browserType)
        {
            case Chrome:
            {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\91953\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            case Firefox:
            {
                driver = new FirefoxDriver();
                break;
            }
        }

        //set the driver
        DriverContext.setDriver(driver);

        //set the browser
        DriverContext.Browser = new Browser(driver);
    }
}
