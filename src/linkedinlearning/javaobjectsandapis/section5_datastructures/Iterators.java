package linkedinlearning.javaobjectsandapis.section5_datastructures;

import java.util.*;

import static java.util.Map.*;

/**
 * @author john-michael.obrien
 * @since 4/7/23
 *
 * Least modern approach to iterating over java collections
 */
public class Iterators {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("lemon");

        Iterator<String> i = fruits.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Map<String, Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("Lemon", 25);
        fruitsMap.put("Banana", 105);
        fruitsMap.put("Apple", 90);
        fruitsMap.put("Cherry", 15);

        Iterator<Map.Entry<String, Integer>> j = fruitsMap.entrySet().iterator();
        while (j.hasNext()) {
            Map.Entry<String, Integer> entry = j.next();
            System.out.print(entry.getKey() + ", ");
            System.out.println(entry.getValue());
        }
    }
}
