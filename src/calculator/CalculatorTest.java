package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
        System.out.println("Init Calculation class");
        calculator = new Calculator();
    }

    @After
    public void afterTest() {
        calculator = null;
        System.out.println("Remove Calculation class !");
    }

    @Test
    @DisplayName("😱")
    public void getSum() throws Exception {
        assertEquals(15, calculator.getSum(7,8));
    }

    @Test
    public void getDivide() throws Exception {
        assertEquals(3, calculator.getDivide(6,2));
    }

    @Test
    public void getMultiple() throws Exception {
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }
}