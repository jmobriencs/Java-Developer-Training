package Section3_ControlStatements.Lessons;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 12/30/22
 */
public class RepetitionLoops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        int input;

        // pretest loop, does not always execute if conditional statement fails
        while (count < 5) {
            System.out.println("The current while loop count is " + count);
            count++;
        }
        System.out.println();

        //post test loop, always executes at least once
        count = 0;
        do {
            System.out.println("The current do-while loop count is " + count);
            count++;
        } while (count < 5);
        System.out.println();

        // pretest for loop, does not always execute if conditional statement fails
        for (count = 0; count < 5; count++) {
            System.out.println("The current for loop count is " + count);
        }
        System.out.println();

        // Additional while loop practice
        System.out.println("Enter a non-negative integer");
        System.out.println("Or enter a negative integer to exit.");
        input = keyboard.nextInt();

        while (input >= 0) {
            System.out.println("Enter another non-negative integer");
            System.out.println("Or enter a negative integer to exit.");
            input = keyboard.nextInt();
        }
        System.out.println("You entered a negative integer. You have exited the while loop.");
    }
}
