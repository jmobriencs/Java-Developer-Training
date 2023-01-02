package Section3_ControlStatements;

/**
 * @author john-michael.obrien
 * @since 12/29/22
 *
 * 3 Categories of Control Statements:
 * -Sequential (Sequence)
 * -Selection (Decision)
 * -Repetition (Loops)
 */
public class ControlStatementsIntro {
    public static void main (String[] args) {
        int age = 19;

        // 3 Categories of Control Statements
        if (age >= 16) {
            System.out.println("You can drive");
        } else {
            System.out.println("You cannot drive");
        }
        System.out.println(); //add some newline space

        for (int i = 1; i <= age; i++) {
            System.out.println("Happy Birthday, you are " + i + " years old!");
        }
    }
}
