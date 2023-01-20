package Section3_ControlStatements.Lessons;

/**
 * @author john-michael.obrien
 * @since 12/29/22
 */
public class ContinueBreak {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;

        // continue - will skip printing 5, but stays in while loop
        while(count1 < 10) {
            if (count1 == 5) {
                count1++;
                continue;
            }
            System.out.print(count1 + "\t");
            count1++;
        }

        // break - will break out of the while loop when it reaches 5
        while(count2 < 10) {
            if (count2 == 5) {
                count2++;
                break;
            }
            System.out.print(count2 + "\t");
            count2++;
        }
    }
}
