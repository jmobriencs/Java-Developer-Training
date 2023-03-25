package linkedinlearning.datastructures.section1_arrays.lessons;

import java.util.Arrays;

/**
 * @author john-michael.obrien
 * @since 3/15/23
 *
 * Array indexes start from 0
 * Last index is length minus 1
 * Each element in the same array must be the same data type
 * Array class in java, comment methods:
 *  -toString()
 *  -asList()
 *  -sort()
 *  -binarySearch()
 *
 *  Two different ways to initalize arrays. Implicit and explicit initalization.
 *   -Implicit: directly assign values to the array
 *   -Explicit: create array to a specific size, and then add values to it
 *      -This is done using the new keyword
 */

public class ArrayPractice {
    public static void main (String[] args) {
        String[] weekdays1 = new String[7]; // specified length array
        System.out.println(Arrays.toString(weekdays1)); // will print 7 nulls

        // initialize the array for each specific index (explicit initialization)
        weekdays1[0] = "Monday";
        weekdays1[1] = "Tuesday";
        weekdays1[2] = "Wednesday";
        weekdays1[3] = "Thursday";
        weekdays1[4] = "Friday";
        weekdays1[5] = "Saturday";
        weekdays1[6] = "Sunday";
        System.out.println(Arrays.toString(weekdays1));

        // Overwrite prev array with new values (size will also change)
        weekdays1 = new String[]{"Lunes", "Martes", "Miercoles"};
        System.out.println(Arrays.toString(weekdays1));

        //another way to initialize an array (implicit initialization)
        String[] weekdays2 = {"Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun"};
        System.out.println(Arrays.toString(weekdays2));

        // Iterate over each element in weekday arr 2
        for (String day : weekdays2) {
            System.out.println("Weekday: " + day);
        }

        // Change each string value in array weekday2 to uppercase
        for (int i = 0; i < weekdays2.length; i++) {
            weekdays2[i] = weekdays2[i].toUpperCase();
        }
        System.out.println(Arrays.toString(weekdays2));
    }
}
