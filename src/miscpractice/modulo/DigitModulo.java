package miscpractice.modulo;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 2/27/23
 */
public class DigitModulo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer to output by digit: ");
        int num = keyboard.nextInt();
        printEachDigit(num);
    }

    public static void printEachDigit(int x) {
        // prints out each digit of the integer number from right to left
        while (x > 0) {
            int digit = x % 10;
            x /= 10;
            System.out.println(digit);
        }
    }
}
