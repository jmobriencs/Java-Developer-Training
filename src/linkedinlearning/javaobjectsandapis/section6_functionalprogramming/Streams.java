package linkedinlearning.javaobjectsandapis.section6_functionalprogramming;

import java.util.Arrays;
import java.util.List;

/**
 * @author john-michael.obrien
 * @since 4/8/23
 */
public class Streams {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};

        Arrays.stream(nums).forEach(n -> System.out.print(n + 1 + " "));
        System.out.println();

        // original array is unchanged
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
