package com.ea.test.seleniumTest;

import com.ea.framework.base.Base;
import com.ea.framework.base.BrowserType;
import com.ea.framework.base.DriverContext;
import com.ea.framework.base.FrameworkInitialize;
import com.ea.framework.utilities.LogUtil;
import com.ea.test.pages.HomePage;
import com.ea.test.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.ea.framework.base.Base.CurrentPage;


public class LoginTest extends FrameworkInitialize {

    @Before
    public void initialize()
    {
        LogUtil logUtil = new LogUtil();
        logUtil.CreateLogFile();
        logUtil.Write("Framework Initialised");

        initializeBrowser(BrowserType.Chrome);
        DriverContext.Browser.goToUrl("http://eaapp.somee.com/");
    }

    @Test
    public void login() throws InterruptedException
    {
        CurrentPage = GetInstance(HomePage.class);
        CurrentPage  =  CurrentPage.As(HomePage.class).clickLogin();
        Thread.sleep(1000);
        CurrentPage.As(LoginPage.class).Login("admin","password");
    }
}
