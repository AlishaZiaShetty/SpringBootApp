package com.ea.test.pages;

import com.ea.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeListPage extends BasePage
{
    public EmployeeListPage() {

    }

    @FindBy( how = How.CSS, using = "[class* ='btn-primary']")
    public WebElement btnCreate;

}
