package linkedinlearning.javaobjectsandapis.section7_exceptionhandling;

import java.io.File;
import java.io.IOException;

/**
 * @author john-michael.obrien
 * @since 4/8/23
 */
public class TryCatch {
    public static void main(String[] args) {
        File file = new File("resources/nonexistentfile");

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Sorry, error has occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
