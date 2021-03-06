package com.ea.test.pages;

import com.ea.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage
{
    public LoginPage()
    { super(); }

    @FindBy( how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy( how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy( how = How.CSS, using = "[class*='btn-default']")
    public WebElement btnLogin;

    public BasePage Login(String userName, String passWord)
    {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(passWord);
        btnLogin.submit();
        return GetInstance(HomePage.class);
    }
}
