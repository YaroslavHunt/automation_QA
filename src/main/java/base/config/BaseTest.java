package base.config;


import org.testng.annotations.*;

public class BaseTest {

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void openBrowser() {
        System.out.println("This method open browser");
    }

    @BeforeMethod
    public void login() {
        System.out.println("This method works before each test method");
    }

    @AfterMethod
    public void logout() {
        System.out.println("This method works after each test method");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("This method close browser");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("After Groups");
    }
}
