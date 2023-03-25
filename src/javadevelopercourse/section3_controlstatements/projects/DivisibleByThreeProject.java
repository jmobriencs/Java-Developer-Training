package javadevelopercourse.section3_controlstatements.projects;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 1/3/23
 *
 * Prompt the user for input of an integer, then print out the appropriate statement, which will be one of the following:
 * ______ is divisible by three
 * ______ is not divisible by three
 */

public class DivisibleByThreeProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numToCheck;

        System.out.println("Enter an integer to see if it is divisible by 3:");
        numToCheck = keyboard.nextInt();

        if (numToCheck % 3 == 0) {
            System.out.println(numToCheck + " is divisible by three.");
        } else {
            System.out.println(numToCheck + " is not divisible by three.");
        }
    }
}
