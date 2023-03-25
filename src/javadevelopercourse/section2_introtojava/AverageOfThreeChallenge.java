package javadevelopercourse.section2_introtojava;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 12/21/22
 */
public class AverageOfThreeChallenge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double dub1;
        double dub2;
        double dub3;

        System.out.println("Please enter 3 numbers:");
        dub1 = keyboard.nextDouble();
        dub2 = keyboard.nextDouble();
        dub3 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("The average of those 3 numbers is: " + ((dub1 + dub2 + dub3) / 3) + '\n');


        double[] arr1 = new double[3];
        System.out.println("Please enter 3 numbers:");
        for (int i = 0; i < 3; i++) {
            arr1[i] = keyboard.nextDouble();
        }

        System.out.println("The average of those 3 numbers is: " + Arrays.stream(arr1).average().getAsDouble());
    }
}
