package javadevelopercourse.section5_stringsandstringbuilder.challenges;

/**
 * @author john-michael.obrien
 * @since 1/9/23
 *
 * Create three names and compare strings using equalTo and compareTo
 */
public class StringMethod1Challenge {
    public static void main(String[] args) {
        String name1 = "JM O'Brien";
        String name2 = "JM O'Brien";
        String name3 = "JM OBrien";

        if (name1.equals(name2)) {
            System.out.println("Names are equal.");
        } else {
            System.out.println("Names are not equal.");
        }

        if (name2.compareTo(name3) > 0) {
            System.out.println(name2.compareTo(name3)); // print out the ascii difference b/w compared 2 characters
            System.out.println("name2 > name3");
        } else {
            System.out.println(name2.compareTo(name3)); // print out the ascii difference b/w compared 2 characters
            System.out.println("name2 <= name3");
        }
    }
}
