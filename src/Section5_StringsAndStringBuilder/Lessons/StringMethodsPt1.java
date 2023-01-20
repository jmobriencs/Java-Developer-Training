package Section5_StringsAndStringBuilder.Lessons;

/**
 * @author john-michael.obrien
 * @since 1/9/23
 */
public class StringMethodsPt1 {
    public static void main(String[] args) {
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        // returns a boolean
        if (name.equals(name2)) {
            System.out.println("Names are equal.");
        } else {
            System.out.println("Names aren't equal.");
        }

        // returns an integer
        if (name.compareTo(name3) > 0) {
            System.out.println("name > name3");
        } else {
            System.out.println("name <= name3");
        }
    }
}
