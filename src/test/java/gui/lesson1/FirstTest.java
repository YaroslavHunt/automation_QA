package gui.lesson1;

import org.testng.annotations.*;

public class FirstTest {

    @BeforeClass
    public void openBrowser() {
        System.out.println("This method open browser");
    }

    @BeforeMethod
    public void login() {
        System.out.println("This method works before each test method");
    }

    @Test
    public void firstTest() {
        System.out.println("First Test");
    }

    @AfterMethod
    public void logout() {
        System.out.println("This method works after each test method");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("This method close browser");
    }
}
