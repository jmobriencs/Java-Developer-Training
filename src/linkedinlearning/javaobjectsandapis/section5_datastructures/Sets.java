package linkedinlearning.javaobjectsandapis.section5_datastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author john-michael.obrien
 * @since 4/4/23
 *
 * If you declare a datatype in the declaration, the assignment infers the data type using the <> diamond operator
 * You can also not declare a data type, in which case your set can contain any number of data types, but this is can cause errors.
 * Order is not maintained. Use a linked hash set if order is required.
 */
public class Sets {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("Contains lemons? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("Num of elements after removing lemon: " + fruits.size());

        // Immutable set. Cannot add or remove but is a fast way to initialize a set of elements.
        Set<String> moreFruits = new HashSet<>(Arrays.asList("peach", "pear", "cherry"));
        System.out.println(moreFruits.size());


        // Immutable set. Cannot add or remove but is a fast way to initialize a set of elements.
        // Available in Java 9 or higher
        // Set moreFruit = Set.of("pear", "raisin", "cherry");
    }
}
