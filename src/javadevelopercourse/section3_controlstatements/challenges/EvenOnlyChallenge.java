package javadevelopercourse.section3_controlstatements.challenges;

/**
 * @author john-michael.obrien
 * @since 12/29/22
 *
 * Loop through 0-10 (exclusive, don't include 10), printing out only the even integers using continue statement
 */
public class EvenOnlyChallenge {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10) {
            if ((count % 2) != 0) {
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        }
    }
}