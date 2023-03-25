package javadevelopercourse.section6_methods.challenges;

/**
 * @author john-michael.obrien
 * @since 1/24/23
 *
 * Write a new method called countUpTo
 *  -Takes two parameters (both integers)
 *  -Starting value (first parameter)
 *  -Ending value (second parameter)
 * Hint: Only change on of the arguments as the recursive call is made
 */
public class RecursionChallenge {
    public static void main(String[] args) {
        countUpTo(0, 7);
    }

    public static void countUpTo(int from, int to) {
        // base case
        if (from <= to) {
            System.out.println(from);
            countUpTo(from + 1, to);
        }
    }
}
