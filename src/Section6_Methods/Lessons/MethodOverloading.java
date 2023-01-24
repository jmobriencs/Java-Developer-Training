package Section6_Methods.Lessons;

/**
 * @author john-michael.obrien
 * @since 1/21/23
 *
 * Pass-by-value:
 *  A copy of the data being passed in is created
 *  Changes to the copy do not affect the original
 *
 * Pass-by-reference:
 *  A copy is NOT created
 *  The address is passed in
 *  Any changes to the parameter passed in affects the argument that
 *  was passed in when the method was called
 *
 * Method overloading:
 *  Same method name, different parameters
 */
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(4));
        System.out.println(getResult(4, 8));
        System.out.println(getResult(4, "8"));
        System.out.println(getResult("JM", "O'Brien"));
    }

    /** Example of overloaded methods */

    public static int getResult(int num) {
        return num * 2;
    }

    public static int getResult(int num1, int num2) {
        return num1 * num2;
    }

    public static int getResult(int num, String value) {
        return num * Integer.parseInt(value);
    }

    // Challenge: return a different data type using the same method
    public static String getResult(String a, String b) {
        return a + " " + b;
    }
}
