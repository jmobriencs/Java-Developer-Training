package linkedinlearning.javaobjectsandapis.section7_exceptionhandling;

/**
 * @author john-michael.obrien
 * @since 4/9/23
 */
public class NegativeInputException extends Exception {
    public NegativeInputException() {
        this("Input must be greater than or equal to 0");
    }

    public NegativeInputException(String message) {
        super(message);
    }
}
