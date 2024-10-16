package src;
/**
 * Adder class extends abstract calculator and implements the arithmetic division
 */
public class Adder extends Calculator{
    @Override
     /**
     *  Adds the left side operand to the right side operand using the parents abstract method
     * @param A the left side operand
     * @param B the right side operand
     * @throws exception if the right side operand equals zero (division by zero exception)
     * */ 
    public double compute(double A, double B) {
        return A + B;
    }
}
