package base.config;

import com.codeborne.selenide.*;
import org.testng.annotations.*;

// USE Swag Labs (https://www.saucedemo.com)

public class BaseTest {

    @BeforeClass
    public void configuration() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1024x768";
//        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        Configuration.headless = false;  // true - Відпрацювання тестів без відображення
        Configuration.screenshots = false;
        Configuration.savePageSource = false;

    }

    @BeforeMethod
    public void login() {
        Selenide.open("https://www.saucedemo.com");
    }

//    @AfterMethod
//    public void cleanWebDriver() {
//        Selenide.clearBrowserCookies();
//        Selenide.refresh();
//        Selenide.open("about:blank");
//    }
//
//    @AfterClass
//    public void quit() {
//        Selenide.closeWebDriver();
//    }
}
