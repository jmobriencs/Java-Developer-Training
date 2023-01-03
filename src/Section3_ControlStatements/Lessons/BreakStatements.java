package Section3_ControlStatements.Lessons;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 12/29/22
 */
public class BreakStatements {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char grade;

        System.out.println("Enter a grade");
        grade = keyboard.next().toUpperCase().charAt(0);

        switch(grade) {
            case 'A':
                System.out.println("Great work!");
                break;
            case 'B':
                System.out.println("Good work.");
                break;
            case 'C':
                System.out.println("You are passing.");
                break;
            case 'D':
                System.out.println("You are not passing and getting close to failing. You can do better.");
                break;
            case 'F':
                System.out.println("You are failing. Please see instructor ASAP.");
                break;
            default:
                System.out.println("You have entered an invalid letter grade");
                // does not require a break statement
        }
    }
}
