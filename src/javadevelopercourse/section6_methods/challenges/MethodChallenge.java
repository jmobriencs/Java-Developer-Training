package javadevelopercourse.section6_methods.challenges;

/**
 * @author john-michael.obrien
 * @since 1/19/23
 *
 * Write a method that returns he square of double that is passed in as a parameter
 */
public class MethodChallenge {
    public static void main(String[] args) {
        System.out.println(doubleSquared(7.25));
    }

    public static double doubleSquared(double num) {
        return Math.pow(num, 2);
    }
}
