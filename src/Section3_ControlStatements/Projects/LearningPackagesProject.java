package Section3_ControlStatements.Projects;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 12/29/22
 *
 * Prompt the user to choose from any of the three available packages.
 * Then calculate the total monthly cost based on the month base fee,
 * and additional course fee(s) based on the package they selected.
 */
public class LearningPackagesProject {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int packageNum;
        int numCourses;
        int baseCost = 0;
        int courseCost = 0;
        int numIncluded = 0;
        int totalCost = 0;


        System.out.println("Please enter your package number (1-3):");
        packageNum = keyboard.nextInt();

        System.out.println("How many courses did you take?");
        numCourses = keyboard.nextInt();

        if (packageNum == 1) {
            baseCost = 10;
            courseCost = 6;
            numIncluded = 2;
        } else if (packageNum == 2){
            baseCost = 12;
            courseCost = 4;
            numIncluded = 4;
        } else if (packageNum == 3) {
            baseCost = 15;
            courseCost = 3;
            numIncluded = 6;
        } else {
            System.out.println("You entered an incorrect package number. Can only be packages 1, 2, or 3.");
        }

        if (numCourses > numIncluded) {
            totalCost = baseCost + (numCourses - numIncluded) * courseCost;
        } else {
            totalCost = baseCost;
        }

        System.out.println("Total monthly package cost is: $" + totalCost);
    }
}
