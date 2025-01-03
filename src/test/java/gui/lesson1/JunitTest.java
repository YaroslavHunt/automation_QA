package gui.lesson1;

import org.junit.jupiter.api.*;

public class JunitTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("This is junit before each test");
    }

    @Test
    public void test() {
        System.out.println("This is junit test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("This is junit after each test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }
}
