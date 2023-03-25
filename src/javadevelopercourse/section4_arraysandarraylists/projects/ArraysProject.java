package javadevelopercourse.section4_arraysandarraylists.projects;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 1/8/23
 *
 * Prompt the user to input 5 integers
 * Store each of the integers in a regular, built-in array
 * After the storing is completed, in a separate loop, print each of the values in the array
 * multiplied by 2
 */
public class ArraysProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Please enter 5 integers.");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Integer " + i + ": ");
            arr[i] = keyboard.nextInt();
        }

        System.out.println("Printing each array value multiplied by 2:");
        for (int num : arr) {
            System.out.println(num * 2);
        }
    }
}
