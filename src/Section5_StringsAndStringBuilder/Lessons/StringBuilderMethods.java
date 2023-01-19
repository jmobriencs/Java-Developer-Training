package Section5_StringsAndStringBuilder.Lessons;

/**
 * @author john-michael.obrien
 * @since 1/13/23
 *
 * String objects are immutable (cannot be change, i.e. text cannot be modified)
 * StringBuilder objects are mutable (can be modified, aka mutated)
 *  - Many of the same methods as the String class
 *  - Has many method sthe String class does not have
 */
public class StringBuilderMethods {
    public static void main (String[] args) {
        StringBuilder sb = new StringBuilder("John O'Brien");

        sb.insert(5, "Eugene ");
        System.out.println(sb);

        sb.append(" is awesome");
        System.out.println(sb);

        sb.replace(23, 30, "amazing");
        System.out.println(sb);

        sb.delete(4, 11);
        System.out.println(sb);

        // Challenge: Replace first name with title
        sb.replace(0, 4, "Mr.");
        System.out.println(sb);
    }
}
