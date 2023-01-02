package Section3_ControlStatements;

/**
 * @author john-michael.obrien
 * @since 12/30/22
 */
public class RepetitionLoops {
    public static void main (String[] args) {

        int count = 0;

        // pretest loop, does not always execute if conditional statement fails
        while (count < 5) {
            System.out.println("The current while loop count is " + count);
            count++;
        }
        System.out.println();

        //post test loop, always executes at least once
        count = 0;
        do {
            System.out.println("The current do-while loop count is " + count);
            count++;
        } while (count < 5);
        System.out.println();

        // pretest for loop, does not always execute if conditional statement fails
        for (count = 0; count < 5; count++) {
            System.out.println("The current for loop count is " + count);
        }
    }
}
