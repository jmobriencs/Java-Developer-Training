package MiscPractice.StringManipulation;

/**
 * @author john-michael.obrien
 * @since 1/16/23
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[] {'H', 'e', 'l', 'l', 'o'};
        ReverseString(s);
    }

    public static void ReverseString(char[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }
}
