package com.ea.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser
{
    public BrowserType Type;

    private WebDriver driver;

    public Browser(WebDriver driver) {
        this.driver = driver;
    }

    public void goToUrl(String url)
    {
        driver.get(url);
    }

    public void maximise()
    {
        driver.manage().window().maximize();
    }
}
