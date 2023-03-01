package MiscPractice.ArraysAndHashing;

import java.util.HashSet;

/**
 * @author john-michael.obrien
 * @since 1/13/23
 *
 * Prints the only number that appears once in an integer array.
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 3, 2, 1, 4, 3, 4,};
        int i = singleNumber(nums);
        System.out.println(i);
    }

    public static int singleNumber( int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int val : nums) {
            if (set.contains(val)) {
                set.remove(val);
            } else {
                set.add(val);
            }
        }
        return set.iterator().next();
    }
}
