package base.config;

import com.codeborne.selenide.*;
import org.testng.annotations.*;

public class BaseTest {

    @BeforeClass
    public void configuration() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1024x768";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        Configuration.headless = false;  // true - Відпрацювання тестів без відображення
        Configuration.screenshots = false;
        Configuration.savePageSource = false;

    }

    @BeforeMethod
    public void login() {}

    @AfterMethod
    public void logout() {}



}
