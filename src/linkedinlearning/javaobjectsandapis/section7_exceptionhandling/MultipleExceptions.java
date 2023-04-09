package linkedinlearning.javaobjectsandapis.section7_exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 4/8/23
 */
public class MultipleExceptions {
    public static void main(String[] args) {
        File file = new File("src/linkedinlearning/javaobjectsandapis/files/numbers.txt");
        Scanner fileReader = null;

        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException e) { // known exceptions
            e.printStackTrace();
        } catch (Exception e) { // catch any other potential exceptions. has to be declared after since it is a superclass of the other 2 exceptions
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }
}
