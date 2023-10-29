package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("i am before method");
    }

    @Test
    public void aTestCase() {
        System.out.println("i am the first test case");
    }

    @Test
    public void bTestCase() {
        System.out.println("i am the second test case");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("i am after method");
    }

}
