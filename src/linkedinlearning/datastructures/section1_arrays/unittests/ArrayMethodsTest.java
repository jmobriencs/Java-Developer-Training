package linkedinlearning.datastructures.section1_arrays.unittests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author john-michael.obrien
 * @since 3/16/23
 */
public class ArrayMethodsTest {

    ArrayMethods arrayTestMethods = new ArrayMethods();

    @Test
    public void testArrayToUpperCase() {
        String[] input = {"cat", "dog", "fish"};
        arrayTestMethods.arrayToUpperCase(input);
        assertArrayEquals(new String[]{"CAT","DOG","FISH"}, input);
    }

    @Test
    public void testIncrementArray() {
        int[] input = {3, 5, 9};
        arrayTestMethods.incrementArray(input);
        assertArrayEquals(new int[]{4, 6, 10}, input);
    }
}
