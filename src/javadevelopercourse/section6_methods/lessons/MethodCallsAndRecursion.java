package javadevelopercourse.section6_methods.lessons;

import java.util.Random;

/**
 * @author john-michael.obrien
 * @since 1/21/23
 */
public class MethodCallsAndRecursion {
    public static void main(String[] args) {
        doSomething();
        countDownFrom(10);
    }

    public static void doSomething() {
        System.out.println("In doSomething! ");
        int result = getSomeValue();
        System.out.println("Getting some value: " + result);
    }

    public static int getSomeValue() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    // recursive method
    public static void countDownFrom(int num) {
        // base case
        if (num >= 0) {
            System.out.println(num);
            countDownFrom(num - 1); // utilizes the call stack
        }
    }
}
