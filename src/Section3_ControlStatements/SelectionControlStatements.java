package Section3_ControlStatements;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 12/29/22
 */
public class SelectionControlStatements {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Folsom Pub and Grille.");
        System.out.print("Please enter your age: ");
        int age = keyboard.nextInt();

        if (age >= 21) {
            System.out.println("You are of legal drinking age!\nCome on in and enjoy an ice cold beer!");
        } else if (age >= 16) {
            System.out.println("You are not old enough for a beer pal\nSoda pop for you kiddo!");
            System.out.println("Hey, but at least you can drive!");
        } else {
            System.out.println("You are not old enough for a beer pal\nSoda pop for you kiddo!");
        }

        System.out.println("\nThanks for visiting the Folsom Pub and Grille. Come back soon!");
    }
}
