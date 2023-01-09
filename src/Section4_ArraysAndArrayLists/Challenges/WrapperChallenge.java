package Section4_ArraysAndArrayLists.Challenges;

/**
 * @author john-michael.obrien
 * @since 1/8/23
 *
 * Create a string holding "3.14159"
 * Use the appropriate Wrapper class to convert the string to a double
 * Add 2.5 to the double
 * Print the double out
 * Answer should be: 5.64159
 */
public class WrapperChallenge {
    public static void main (String[] args) {
        String pi = "3.14159";
        double piDub = Double.parseDouble(pi);
        piDub += 2.5;
        System.out.println(piDub);
    }
}
