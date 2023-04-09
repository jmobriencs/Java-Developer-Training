package linkedinlearning.javaobjectsandapis.section6_functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author john-michael.obrien
 * @since 4/8/23
 */
public class Streams {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};

        Arrays.stream(nums).forEach(n -> System.out.print(n + 1 + " "));
        System.out.println();

        // original array is unchanged
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Common stream operations
        List<String> vegetables = Arrays.asList("spinach", "cabbage", "peas", "green beans", "brussel sprouts", "carrots");
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        //anyMatch
        System.out.println(vegetables.stream().anyMatch(v -> v.contains(" "))); // true, 2 words have a white space

        //allMatch
        System.out.println(vegetables.stream().allMatch(v -> v.contains("s"))); // false, cabbage has no s

        //filter
        vegetables.stream().filter(v -> v.startsWith("c")).forEach(System.out::println);

        //manipulate the data using stream
        vegetables.stream().map(String::toUpperCase).forEach(System.out::println); //original vegetables list NOT modified at all

        //reduce (commonly used with numbers)
        System.out.println(numbers.stream().reduce(0, (a, b) -> a + b));
        System.out.println(vegetables.stream().sorted().reduce("", (a, b) -> a + "|" + b));

        //collect
        List<String> veggiesThatEndWithS = vegetables.stream().filter(v -> v.endsWith("s")).collect(Collectors.toList());
        veggiesThatEndWithS.forEach(System.out::println);
    }
}
