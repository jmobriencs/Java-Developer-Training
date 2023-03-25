package javadevelopercourse.section2_introtojava;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 12/20/22
 */
public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double michaelDouble;
        double result = 0;

        System.out.println("Please give me a double yo:");
        michaelDouble = keyboard.nextDouble();
        result = michaelDouble *= 2;
        System.out.println("Double has been updated to: " + result + '\n');
        System.out.print("Test is this on a skipped line with no additional space after?");
    }
}
