package MiscPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author john-michael.obrien
 * @since 1/7/23
 */
public class ValidParenthesis {
    public static void main (String[] args) {
        System.out.println(isValid("[]{}()"));
    }

    private static boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('z');
        System.out.println(stack.pop());


        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
