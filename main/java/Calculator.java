import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public int multiply(int a, int b) {
        logger.info("Multiplication operation for numbers "+a+" and "+b);
        return a * b;
    }

    /*public static void main(String[] args)
    {
        int a =2;
        int b =3;
        Calculator c = new Calculator();
        int d = c.multiply(a,b);
        System.out.println("Sum is :"+d);
    }*/
}



