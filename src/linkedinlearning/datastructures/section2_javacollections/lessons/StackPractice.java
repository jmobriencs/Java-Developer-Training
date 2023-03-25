package linkedinlearning.datastructures.section2_javacollections.lessons;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author john-michael.obrien
 * @since 3/20/23
 *
 * First element you add is last element you take out (pop from top)
 * There is a stack class, BUT, you can add/remove from anywhere, which isn't very stack like.
 * So we will use deque here below
 *
 * Can use poll and pop to remove from top of stack. Difference is if you try and pop from empty stack,
 * you get a no such element exception. If you use Poll, it returns null.
 */
public class StackPractice {
    public static void main (String[] args) {
        Deque<String> stack = new ArrayDeque<>(); // not thread safe, but stack class is. deque is faster
        stack.push("First Request");
        stack.push("Second Request");
        stack.push("Third Request");
        System.out.println(stack);
        System.out.println(stack.peek()); // peeks at what is at the top of the stack

        // pop top element from the stack
        System.out.println(stack.pop()); // can also use poll
        System.out.println(stack);

        System.out.println(stack.poll());
        System.out.println(stack);
    }
}
