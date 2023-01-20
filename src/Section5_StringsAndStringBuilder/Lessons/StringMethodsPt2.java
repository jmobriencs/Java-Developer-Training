package Section5_StringsAndStringBuilder.Lessons;

/**
 * @author john-michael.obrien
 * @since 1/9/23
 */
public class StringMethodsPt2 {
    public static void main(String[] args) {
        String myName = "JM O'Brien";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsB = myName.indexOf("B");

        String lastName = myName.substring(3);

        System.out.println("upper is: " + upper);
        System.out.println("lower is: " + lower);
        System.out.println("B is at index: " + whereIsB);
        System.out.println("Last name is: " + lastName);
    }
}
