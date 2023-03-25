package javadevelopercourse.section3_controlstatements.challenges;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 12/29/22
 *
 * Create a SumFun file
 * Maintain a sum of integers that the user enters
 * Exit the loop if the user enters a negative integer
 * Print out the sum after the loop
 */
public class SumFunChallenge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        int sum = 0;

        sumRules();
        input = keyboard.nextInt();

        while (input >= 0) {
            sum += input;
            sumRules();
            input = keyboard.nextInt();
        }
        System.out.println("Sum is: " + sum);
    }

    private static void sumRules() {
        System.out.println("Enter an integer.");
        System.out.println("Enter a negative integer to end program and calculate the sum.");
    }
}
