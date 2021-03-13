import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Math;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double square_root(double num) {
        logger.info("Square root operation of "+num);
        return Math.sqrt(num);
    }

    public int factorial(int num) {

	int f=1;
	for(int i=1;i<=num;i++)
		f=f*i;

	logger.info("Factorial operation of "+num);
	return f;

    }

    public double natural_log(double num) {
	logger.info("Natural log operation of "+num);
	return Math.log(num);
    }

    public double power_fn(double base, double exp) {

	logger.info("Power operation for base "+base+" and exponent"+exp);
	return Math.pow(base,exp);
    }

   
}
