package src;
/**
 * Substractor class extends abstract calculator
 */


public class Multiplier extends Calculator {
     /**
     * Multiply the first parameter by the second parameter using the parent abstract method
     * @param A the left side operator
     * @param B the right side operator
     * 
     */
    @Override
    public double compute(double A, double B) {
        return A * B;
    }


    
}
