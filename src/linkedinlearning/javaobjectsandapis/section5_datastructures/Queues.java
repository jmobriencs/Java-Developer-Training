package linkedinlearning.javaobjectsandapis.section5_datastructures;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author john-michael.obrien
 * @since 4/5/23
 *
 * Order is maintained. Duplicates allowed. Can only remove from the head of the list (deque can remove from the tail)
 */
public class Queues {
    public static void main(String[] args) {
        Queue<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        String removed = fruits.remove();

        System.out.println(fruits);
        System.out.println("Removed: " + removed); // removes first item in the queue
        System.out.println("New head of list: " + fruits.peek());
        System.out.println(fruits.poll()); // removes head of the queue ; returns null if there is nothing in the list, whereas remove does not and throws an exception
    }
}
