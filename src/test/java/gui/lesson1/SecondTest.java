package gui.lesson1;

import base.config.BaseTest;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test(groups = "test")
    public void secondTest() {
        System.out.println("Second Test");
    }
}
