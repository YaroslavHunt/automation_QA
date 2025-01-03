package gui.lesson1;

import base.config.BaseTest;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

public class FirstTest extends BaseTest {

    @Test
    public void firstTest() {
        Selenide.open("https://www.google.com");
    }
}
