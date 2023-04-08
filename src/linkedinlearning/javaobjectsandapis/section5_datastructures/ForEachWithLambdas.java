package linkedinlearning.javaobjectsandapis.section5_datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author john-michael.obrien
 * @since 4/7/23
 *
 * Most modern approach to iterating over java collections
 */
public class ForEachWithLambdas {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("peach");
        fruits.add("pear");

        // Works for everything that uses collections interface
        fruits.forEach(f -> System.out.println(f)); // defines input/output
        fruits.forEach(System.out::println); // assumes inout, even simpler than above
        fruits.forEach(f -> {
            f = "fruits: " + f;
            System.out.println(f);
        });

        // Maps are again different, have to iterate over entry set
        Map<String, Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("Lemon", 25);
        fruitsMap.put("Banana", 105);
        fruitsMap.put("Apple", 90);
        fruitsMap.put("Cherry", 15);

        fruitsMap.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
