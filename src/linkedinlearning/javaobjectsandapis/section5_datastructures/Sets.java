package linkedinlearning.javaobjectsandapis.section5_datastructures;

import java.util.*;

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

        // Fast way to initialize a set of elements.
        Set<String> moreFruits = new HashSet<>(Arrays.asList("peach", "pear", "cherry"));
        Set<String> immutableFruits = Collections.unmodifiableSet(moreFruits); // makes set immutable (but isn't truly immutable, see below)
        System.out.println(immutableFruits.size());
        moreFruits.add("orange");
        System.out.println(immutableFruits.size()); // changing the original hashset will also change the immutable set (funny!)


        // Immutable set. Cannot add or remove but is a fast way to initialize a set of elements.
        // Available in Java 9 or higher
        // Set moreFruit = Set.of("pear", "raisin", "cherry");
    }
}
