package linkedinlearning.javaobjectsandapis.section5_datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author john-michael.obrien
 * @since 4/7/23
 */
public class EnhancedForLoops {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("peach");
        fruits.add("pear");

        // Works for everything that uses collections interface
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println(); // blank line

        // Maps are again different, have to iterate over entry set
        Map<String, Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("Lemon", 25);
        fruitsMap.put("Banana", 105);
        fruitsMap.put("Apple", 90);
        fruitsMap.put("Cherry", 15);

        for (Map.Entry<String, Integer> entry : fruitsMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
