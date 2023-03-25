package javadevelopercourse.section8_fileioandexceptions.challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 2/23/23
 * TASK:
 * -Populate an array list with several names (5 or more)
 * -Iterate through the ArrayList and print names to a file
 *  called names.txt
 * -When done, verify that names printed to the names.txt
 *  file matches the names in the original ArrayList
 */
public class WriteNamesChallenge {
    public static void main(String[] args) {
        ArrayList<String> listNames = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        Scanner input;
        int numNames = 0;

        try {
            // Get user input on how many first names they want to enter
            System.out.println("Please enter how many names you would like to store in a file (enter 5 or more): ");
            numNames = keyboard.nextInt();

            // Use must enter 5 or more first names
            while (numNames < 5) {
                System.out.println("Please enter 5 or more names.");
                System.out.println("How many names would like to store in a file (enter 5 or more);");
                numNames = keyboard.nextInt();
            }

            // Have the user enter their chosen amount of first names
            System.out.println("Please enter " + numNames + " names:");
            for (int i = 0; i < numNames; i++) {
                String name = keyboard.next();
                listNames.add(name);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Error! Enter numbers only! Run program again");
        }

        // Send user inputted first names to an output file called names.txt
        try {
            PrintWriter pw = new PrintWriter("src/IOFiles/names.txt");
            for (int i = 0; i < listNames.size(); i++) {
                pw.println(listNames.get(i));
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Could Not Write To File");
            ex.getMessage();
        }

        // Verify that all first names were added to the file successfully and match the list of inputted first names
        try {
            input = new Scanner(new File("src/IOFiles/names.txt"));

            while (input.hasNext()) {
                for (String name : listNames) {
                    if (!name.equals(input.next())) {
                        System.out.println("Names are not equal.");
                    } else {
                        System.out.println("Names are equal");
                    }
                }
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
            ex.getMessage();
        } catch (InputMismatchException ex) {
            System.out.println("Error Reading Input");
        }
    }
}
