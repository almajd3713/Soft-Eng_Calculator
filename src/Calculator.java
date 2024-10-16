package src;

/**
 * Abstract class for all the operations
 */
public abstract class Calculator {
    /**
     * Abstract method that will be implemented by subclasses 
     * @param A the left side operand
     * @param B the right side operand
     * */ 
    public abstract double compute(double A, double B);
}