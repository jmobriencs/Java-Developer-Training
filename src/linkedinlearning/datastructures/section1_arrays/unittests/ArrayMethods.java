package linkedinlearning.datastructures.section1_arrays.unittests;

/**
 * @author john-michael.obrien
 * @since 3/16/23
 */
public class ArrayMethods {

    public void arrayToUpperCase(String[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].toUpperCase();
        }
    }

    public void incrementArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] += 1;
        }
    }
}
