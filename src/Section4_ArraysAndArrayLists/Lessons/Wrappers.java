package Section4_ArraysAndArrayLists.Lessons;

/**
 * @author john-michael.obrien
 * @since 1/6/23
 *
 * Wrapper classes:
 * Byte, Short, Integer, Long
 * Float, Double
 * Character, Boolean
 */
public class Wrappers {
    public static void main (String[] args) {
        // wrapping
        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;

        System.out.println(numericValue);
    }
}
