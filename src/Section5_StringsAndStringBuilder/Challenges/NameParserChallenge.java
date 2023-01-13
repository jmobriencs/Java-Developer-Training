package Section5_StringsAndStringBuilder.Challenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 1/12/23
 *
 * Prompt the user for their first and last names as a single String
 * Once you have the user's full name, split the String into two separate
 * Strings for the first and last names
 * Print out the uppercase version of the first name
 * Print out the lowercase version of the last name
 */
public class NameParserChallenge {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;

        System.out.print("Please enter your first and last name: ");
        fullName = keyboard.nextLine();

        int spaceIndex = fullName.indexOf(" ");

        firstName = fullName.substring(0, spaceIndex);
        lastName = fullName.substring(spaceIndex, fullName.length());

        System.out.println("Uppercase first name is: " + firstName.toUpperCase());
        System.out.println("Lowercase last name is: " + lastName.toLowerCase());
    }
}
