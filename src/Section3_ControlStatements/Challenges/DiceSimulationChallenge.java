package Section3_ControlStatements.Challenges;

import java.util.Random;

/**
 * @author john-michael.obrien
 * @since 1/2/23
 *
 * Simulate 10 rolls of a standard 6-side die
 */
public class DiceSimulationChallenge {
    public static void main (String[] args) {
        Random random = new Random();
        int roll;

        for (int i = 0; i < 10; i++) {
            roll = random.nextInt(6) + 1;
            System.out.println("Roll is: " + roll);
        }
    }
}
