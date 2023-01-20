package Section6_Methods.Lessons;

/**
 * @author john-michael.obrien
 * @since 1/18/23
 *
 * Methods with no parameters: parameterless
 * Methods with parameters: parameterized
 *
 * When you call the method an argument is passed in.
 * In the method the argument becomes the parameter.
 */
public class MethodsPt1 {
    public static void main(String[] args) {
        printHello();
        printNum(24); // 24 is the argument passed in

        int result = giveMe10();
        System.out.println(result);

        result = addTheseNums(33, 71); // 33 and 71 are arguments passed in
        System.out.println(result);

    }

    public static void printHello() {
        System.out.println("Hello!");
    }

    public static void printNum(int a) {
        System.out.println("The number is: " + a);
    }

    public static int giveMe10() {
        return 10;
    }

    public static int addTheseNums(int a, int b) {
        return a + b;
    }
}
