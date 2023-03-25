package javadevelopercourse.section5_stringsandstringbuilder.challenges;

/**
 * @author john-michael.obrien
 * @since 1/13/23
 *
 * Take the first name and using StringBuilder class replace it with your appropriate title
 */
public class StringBuilderChallenge {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("John-Michael O'Brien");
        sb.replace(0, 12, "Mr.");
        System.out.println(sb);
    }
}
