package linkedinlearning.javaobjectsandapis.section7_exceptionhandling;


import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 4/9/23
 */
public class RethrowingExceptions {
    public static void main(String[] args) throws IOException {
        rethrowException();
    }

    public static void rethrowException() throws IOException {
        File file = new File("resources/fakefilepath");
        file.createNewFile();

        Scanner fileReader = new Scanner(file);
    }
}
