package linkedinlearning.javaobjectsandapis.section7_exceptionhandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 4/8/23
 */
public class TryWithResources {
    public static void main(String[] args) {
        File inputFile = new File("src/linkedinlearning/javaobjectsandapis/files/numbers.txt");
        File outFile = new File("src/linkedinlearning/javaobjectsandapis/files/output.txt");

        try (
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outFile);
                ) {
            while(fileReader.hasNext()) {
                fileWriter.println(fileReader.nextDouble());
            }

        } catch (IOException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
