package linkedinlearning.datastructures.section2_javacollections.unittests;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author john-michael.obrien
 * @since 3/20/23
 */
public class CollectionsExercise {
    void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(i);
    }

    void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(0, i);
    }

    void removeItemFromTopOfStack(Deque<Integer> stack) {
        stack.pop();
    }

    void removeItemFromFrontOfQueue(Queue<Integer> queue) {
        queue.poll();
    }

    void addItemToTreeSet(Set<String> treeSet, String item) {
        treeSet.add(item);
    }
}
