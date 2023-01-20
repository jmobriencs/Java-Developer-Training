package Section3_ControlStatements.Projects;

import java.util.Random;
import java.util.Scanner;

/**
 * @author john-michael o'brien
 * @since 1/3/23
 *
 * Randomly generate a number between 1 and 100 (inclusive).
 * Ask the user to guess the computer's number.
 * There are four possibilities to help the user
 * to hone in on the correct number.
 */
public class GuessTheNumberProject {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        int randomNum;
        int inputNum;
        int count = 0;
        boolean guessedNumber = false;


        randomNum = random.nextInt(100) + 1;

        // Sentinel-controlled repetition
        while (!guessedNumber) {

            System.out.println("Please enter a number between 1-100 to guess the computer's number: ");
            inputNum = keyboard.nextInt();
            count++;

            if (inputNum >= 1 && inputNum <= 100) {
                if (randomNum == inputNum) {
                    System.out.println("Congrats! You guessed the number in " + count + " guesses! Thanks for playing!");
                    guessedNumber = true;
                } else if (randomNum > inputNum) {
                    System.out.println("Your guess was too low. Try again.");
                } else {
                        System.out.println("Your guess was too high. Try again.");
                }
            } else {
                System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");
            }
        }
    }
}
