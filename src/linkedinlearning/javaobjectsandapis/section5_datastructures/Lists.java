package linkedinlearning.javaobjectsandapis.section5_datastructures;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author john-michael.obrien
 * @since 4/4/23
 *
 * If you declare a datatype in the declaration, the assignment infers the data type using the <> diamond operator
 * You can also not declare a data type, in which case your set can contain any number of data types, but this is can cause errors.
 * Lists can contain duplicate elements, unlike Sets.
 */
public class Lists {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.set(2, "grape"); // replace banana with grape

        System.out.println(fruits);
        System.out.println("Fourth fruit in the list: " + fruits.get(3));
        System.out.println("Index of first lemon: " + fruits.indexOf("lemon")); // will print the first occurrence if there are duplicates
        System.out.println("Index of last lemon: " + fruits.lastIndexOf("lemon")); // will print the last occurrence

        // If removing by object, it will remove the first occurrence if there are duplicates
        System.out.println("List size before remove: " + fruits.size());
        fruits.remove("lemon");
        System.out.println("List size after remove: " + fruits.size());
        System.out.println("List with removed first lemon: " + fruits);


        // Immutable list
        List<String> moreFruit = Arrays.asList("cherries", "blueberry", "strawberry");
        System.out.println(moreFruit);

        // Java 9 or higher immutable list
        //List<String> moreFruit = List.of("cherries", "blueberry", "strawberry");
    }
}
