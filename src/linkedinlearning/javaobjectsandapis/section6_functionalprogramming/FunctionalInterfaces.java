package linkedinlearning.javaobjectsandapis.section6_functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

/**
 * @author john-michael.obrien
 * @since 4/7/23
 */
public class FunctionalInterfaces {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("France", "Germany", "China", "USA", "Japan"); // immutable list
        Consumer<String> print = c -> System.out.println(c);
        countries.forEach(print); // when we call for each and pass in this interface, the implementation we provided for accept is what is executed

        // can also be a method reference
        Consumer<String> print2 = System.out::println;
        countries.forEach(print2);

        Function<Integer, Integer> square = (n) -> n * n;
        Function<Integer, Integer> add = (n) -> n + n;
        System.out.println(square.andThen(add).apply(5));
    }
}
