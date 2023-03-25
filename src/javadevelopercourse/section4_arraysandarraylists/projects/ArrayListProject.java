package javadevelopercourse.section4_arraysandarraylists.projects;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 1/8/23
 *
 * Create an ArrayList and populate it with non-negative numbers (real numbers 0 or greater)
 * Stop asking fro numbers when the user enters a negative number
 * When the user prompted loop is finished, you should print the values in the ArrayList in reverse order
 * Consider doing a priming read before you loop
 */
public class ArrayListProject {
    public static void main(String[] args) {
        ArrayList<Double> arrList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter numbers 0 or greater. Enter a negative number to stop input.");

        double input = keyboard.nextDouble();

        while (input >= 0) {
            arrList.add(input);
            System.out.println("Enter numbers 0 or greater. Enter a negative number to stop input.");
            input = keyboard.nextDouble();
        }

        // reverse for loop to print ArrayList backwards
        for (int i = arrList.size() - 1; i >= 0 ; i--) {
            System.out.println(arrList.get(i));
        }
    }
}
