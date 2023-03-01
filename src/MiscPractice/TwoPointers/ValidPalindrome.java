package MiscPractice.TwoPointers;

/**
 * @author john-michael.obrien
 * @since 1/18/23
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String palindrome1 = "A man, a plan, a canal: Panama";
        String palindrome2 = "A aaaaaa R";
        System.out.println(isPalindrome(palindrome1));
        System.out.println(isPalindrome(palindrome2));
    }

    public static boolean isPalindrome(String s) {
        String filtered = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int l = 0;
        int r = filtered.length() - 1;

        while (l < r) {
            if (filtered.charAt(l++) != filtered.charAt(r--)) return false;
        }
        return true;
    }
}
