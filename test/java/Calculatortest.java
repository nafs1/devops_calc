import org.junit.*;
import static org.junit.Assert.*;

public class Calculatortest {

    @BeforeClass
    public static void beforeCalculatorClass(){
        System.out.println("Before Calculator Class Testing");
    }

    @Before
    public void beforeCalculatorTest(){
        System.out.println("Before Calculator Testing");
    }

    @Test
    public void truePositiveCalcvalue() {
        Calculator calc = new Calculator();
        assertEquals(calc.multiply(2,3), 6);

    }


    @After
    public void afterCalculatorTest(){
        System.out.println("After Calculator Testing");
    }

    @AfterClass
    public static void afterCalculatorClass(){
        System.out.println("After Calculator Class Testing");
    }
}
