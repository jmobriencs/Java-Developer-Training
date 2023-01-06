package Section4_ArraysAndArrayLists.Challenges;

import java.util.Random;

/**
 * @author john-michael o'brien
 * @since 1/6/23
 *
 * Create an array of size 10
 * Use a reg for loop to populate an array of integers
 * In a separate enhanced for loop, print out the elements of the array that you populated
 */
public class ArrayChallenge {
    public static void main (String[] args) {
        Random random = new Random();
        int[] arr1 = new int[10];

        // populate arrays with random ints up to 100 (exclusive, so 0-99)
        for (int i = 0; i < 10; i++) {
            arr1[i] = random.nextInt(100);
        }

        for (int num : arr1) {
            System.out.println(num);
        }
    }
}
