import org.junit.*;
import static org.junit.Assert.*;

public class Calculatortest {

    Calculator calc = new Calculator();
    private static final double delta = 1e-15;	

    @BeforeClass
    public static void beforeCalculatorClass(){
        System.out.println("Before Calculator Class Testing");
    }


    @Test
    public void truePositiveSqrtvalue() {
        assertEquals(calc.square_root(9.0), 3, delta);

    }

    @Test
    public void truePositiveFactvalue() {
        assertEquals(calc.factorial(4), 24);

    }

    @Test
    public void truePositiveNlogvalue() {
        assertEquals(calc.natural_log(10.0), 2.302585092994046, delta);

    }

    @Test
    public void truePositivePowervalue() {
        assertEquals(calc.power_fn(3.0, 4.0), 81.0, delta);

    }


    

    @AfterClass
    public static void afterCalculatorClass(){
        System.out.println("After Calculator Class Testing");
    }
}
