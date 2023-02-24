package Section8_FileIOAndExceptions.Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 2/23/23
 *
 * TASK: Take integer input from an input text file and
 * add up all the values and display the total sum.
 */
public class SumTheNumbersChallenge {
    public static void main(String[] args) {
        Scanner infile;
        int input;
        int sumInput = 0;

        try {
            infile = new Scanner(new File("src/IOFiles/input.txt"));

            while (infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
                sumInput += input;
            }

            System.out.println("Sum is: " + sumInput);

        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Error Reading Input");
        }
    }
}
