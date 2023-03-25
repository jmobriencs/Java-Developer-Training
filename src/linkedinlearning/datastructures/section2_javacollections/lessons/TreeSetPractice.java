package linkedinlearning.datastructures.section2_javacollections.lessons;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author john-michael.obrien
 * @since 3/20/23
 */
public class TreeSetPractice {
    public static void main (String[] args) {
        //good practice to use parent type on left side and concrete on right so its easy to change
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);

        System.out.println(treeSet); // stores elements by default in ascending order

        treeSet.add(6);
        System.out.println(treeSet); // cannot have duplicate values

        Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));
        wordSet.add("Tiger");
        wordSet.add("Giraffe");
        wordSet.add("Bear");
        System.out.println(wordSet); // stores elements in alphabetical order UNLESS you change the parameters in the constructor (shown above)
        wordSet.add("wolf");
        System.out.println(wordSet); // won't add wolf because currently comparing Strings via length, so is seen as duplicate
        wordSet.remove("Giraffe");
        System.out.println(wordSet);
    }
}
