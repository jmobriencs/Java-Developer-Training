package Section3_ControlStatements.Challenges;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 12/29/22
 */
public class FraternityChallenge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender;

        System.out.println("Please enter your age:");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter you gender:");
        gender = keyboard.next().toUpperCase().charAt(0);

        if (age >= 19 && gender == 'M') {
            System.out.println("You are eligible to join a fraternity");
        } else if (age < 19 && gender == 'M') {
            System.out.println("You meet the gender but not age requirement for a fraternity. Try again when you are 19 or older.");
        } else {
            System.out.println("You do not meet the age or gender requirement(s)");
        }
    }
}
