package ua.denys.programming.lectures.lecture2;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void BeforeTests(){
        System.out.println("@Before");
    }
    @After
    public void AfterTests(){
        System.out.println("@After");
    }
    @AfterClass
    public static void AfterClass(){
        System.out.println("@ClassAfter");
    }
    @BeforeClass
    public static void BeforeClass(){
        System.out.println("@ClassBefore");
    }

    @Test
    public void sum() throws Exception {
        int actual = Calculator.sum(2, 2);
        int expected = 4;
        System.out.println("@Test");
        assertEquals(expected, actual);
    }

    @Test
    public void devIntToInt() throws Exception {
        int actual = Calculator.dev(6, 3);
        int expected = 2;
        System.out.println("@Test");
        assertEquals(expected, actual);
    }

    @Test
    public void devZeroToInt() throws Exception {
        System.out.println("@Test");
        fail();
    }

    @Test(expected = ArithmeticException.class)
    public void devException() throws Exception {
        System.out.println("@Test");
        int actual = Calculator.dev(6, 0);
    }

    @Test(timeout = 10)
    public void devTimeout() throws Exception {
        System.out.println("@Test");
        int actual = Calculator.dev(6, 2);
    }
}