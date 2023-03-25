package javadevelopercourse.section5_stringsandstringbuilder.projects;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 1/13/23
 *
 * Prompt the user to give 5 full names (First and Last)
 * Separate first and last names
 * Place them into two separate array lists
 * Once all 5 full names have been entered and split iterate and print out all possible permutations of the first and last names.
 * AKA for each first name, print them out with each last name.
 * Since there are 5 first names and five last names for a total of 25 permutations.
 */
public class NamePermutationProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> firstNameList = new ArrayList<>();
        ArrayList<String> lastNameList = new ArrayList<>();
        String fullName;
        String firstName;
        String lastName;
        int indexOfSpace;
        final int NUM_NAMES = 5;

        System.out.println("Please enter 5 full names:");
        for (int i = 0; i < NUM_NAMES; i++) {
            fullName = keyboard.nextLine();
            indexOfSpace = fullName.indexOf(" ");
            firstName = fullName.substring(0, indexOfSpace);
            lastName = fullName.substring(indexOfSpace + 1);
            firstNameList.add(firstName);
            lastNameList.add(lastName);
        }

        for (int i = 0; i < firstNameList.size(); i++) {
            for (int j = 0; j < lastNameList.size(); j++) {
                System.out.println(firstNameList.get(i) + " " + lastNameList.get(j));
            }
        }
    }
}
