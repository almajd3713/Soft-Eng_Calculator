package com.main.softengdev;


/**
 * The ArgumentParser class is responsible for parsing and validating command-line arguments
 * for a simple calculator application. It extracts the operator and operands from the arguments
 * and provides methods to retrieve them.
 * 
 * <p>Usage: java ArgumentParser operator operand1 operand2</p>
 * <p>Example: java ArgumentParser + 5 10</p>
 * 
 * <p>Supported operators:</p>
 * <ul>
 *   <li>"+" for addition</li>
 *   <li>"-" for subtraction</li>
 *   <li>"*" for multiplication</li>
 *   <li>"/" for division</li>
 * </ul>
 * 
 * <p>Operands must be valid numbers.</p>
 * 
 * <p>If the arguments are invalid, the program will print an error message and exit.</p>
 * 
 * @author MHND009
 */
public class ArgumentParser {
    private Double A;
    private Double B;
    private Operator operator;

    /**
     * Constructs an ArgumentParser object, validates the provided arguments,
     * sets the operator, and parses the numerical values.
     *
     * @param args an array of strings where the first element is the operator
     *             and the second and third elements are the numerical values to be parsed.
     * @throws IllegalArgumentException if the arguments are invalid.
     * @throws NumberFormatException if the numerical values cannot be parsed as doubles.
     */
    public ArgumentParser(String[] args){
        validateArguments(args);
        operator = setOperator(args[0]);
        A = Double.parseDouble(args[1]);
        B = Double.parseDouble(args[2]);
    }

    /**
     * Retrieves the operands for the calculation.
     *
     * @return an array containing the operands A and B as Double objects.
     */
    public Double[] getOperands(){
        return new Double[]{A, B};
    }
    /**
     * Retrieves the operator.
     *
     * @return the operator
     */
    public Operator getOperator(){
        return operator;
    }

    /**
     * Validates the command-line arguments passed to the program.
     * 
     * This method checks if the number of arguments is exactly three. It also verifies
     * that the first argument is a valid operator (+, -, *, /) and that the second and
     * third arguments are valid numbers.
     * 
     * If the arguments are invalid, the method prints an appropriate error message and
     * terminates the program.
     * 
     * @param args the command-line arguments to validate
     */
    private static void validateArguments(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java ArgumentParser arg1 arg2 arg3");
            System.exit(1);
        }
        if (!args[0].equals("+") && !args[0].equals("-") && !args[0].equals("*") && !args[0].equals("/")) {
            System.out.println("Invalid operator");
            System.exit(1);
        }
        try {
            Double.parseDouble(args[1]);
            Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
            System.exit(1);
        }
    }

    /**
     * Sets the operator based on the provided string.
     *
     * @param op the string representation of the operator (e.g., "+", "-", "*", "/")
     * @return the corresponding Operator enum value, or null if the operator is not recognized
     */
    private static Operator setOperator(String op) {
        switch (op) {
            case "+":
                return Operator.ADDITION;
            case "-":
                return Operator.SUBTRACTION;
            case "*":
                return Operator.MULTIPLICATION;
            case "/":
                return Operator.DIVISION;
            default:
                return null;
        }
    }

}