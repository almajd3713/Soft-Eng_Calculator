package src;
/**
 * Substractor class extends abstract calculator
 */

public class Substarctor extends Calculator {
    /**
     * Substract the first parameter from the second parameter using the parent abstract method
     * @param A the left side operator
     * @param B the right side operator
     * 
     */
    @Override
    public double compute(double A, double B) {
        return A - B;
    }


    
}
