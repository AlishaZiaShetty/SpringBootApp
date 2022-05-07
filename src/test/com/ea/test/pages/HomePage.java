package com.ea.test.pages;

import com.ea.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    public HomePage() {}

    @FindBy( how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy( how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    public BasePage clickLogin()
    {
        lnkLogin.click();
        return GetInstance(LoginPage.class);
    }
}
