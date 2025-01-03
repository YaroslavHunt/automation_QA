package gui.lesson1;

import base.config.BaseTest;
import org.testng.annotations.*;

public class FirstTest extends BaseTest {

    @Test(groups = "test")
    public void firstTest() {
        System.out.println("First Test");
    }

}
