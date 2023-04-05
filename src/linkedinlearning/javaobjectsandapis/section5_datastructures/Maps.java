package linkedinlearning.javaobjectsandapis.section5_datastructures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author john-michael.obrien
 * @since 4/5/23
 *
 * Order is not maintained (use a linked hashmap if order is required)
 * Map does not inherit from the Collections interface, but it is part of the collections framework
 * Keys are required to be unique
 * Values are not
 */
public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17); // technically an update, overrides existing value since no duplicate keys allowed
        fruitCalories.putIfAbsent("banana", 125); // won't be updated bc it already exists

        System.out.println(fruitCalories);
        System.out.println("banana calories: " + fruitCalories.get("banana")); // prints the value at key banana
        System.out.println("Does map contain a strawberry? " + fruitCalories.containsKey("strawberry")); // false
        System.out.println("Does map contain a fruit with 20 calories? " + fruitCalories.containsValue(17)); // true

        Set mapEntries = fruitCalories.entrySet(); // true collection, returns map as a set
        Set mapKeys = fruitCalories.keySet(); // returns just the keys as a set
        Collection values = fruitCalories.values(); // returns a collection of values, in this case integers

        System.out.println(mapEntries);
        System.out.println(mapKeys);
        System.out.println(values);

        //Immutable map in Java 9 or higher
        //Map<String, Integer> immutableFruitCalories = Map.of("apple", 95, "banana", 27);
    }
}
