package src;
/**
 * Divider class extends abstract calculator and implements the arithmetic division
 */
public class Divider extends Calculator {
    @Override
     /**
     *  Divides the left side operand over the right side operand using the parents abstract method
     * @param A the left side operand
     * @param B the right side operand
     * @throws ArithmeticException if the right side operand equals zero (division by zero exception)
     * */ 
    public double compute(double A, double B) {
        if (B == 0) {
            throw new ArithmeticException("Error: Division by zero.");
        }
        return A / B;
    }
}