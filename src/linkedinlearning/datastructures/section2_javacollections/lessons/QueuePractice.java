package linkedinlearning.datastructures.section2_javacollections.lessons;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author john-michael.obrien
 * @since 3/20/23
 *
 * Few was to use queues:
 * ArrayDeque
 * LinkedList
 * Priority Queue
 */
public class QueuePractice {
    public static void main (String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Person One");
        queue.offer("Person Two");
        queue.offer("Person Three");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
    }
}
