package javadevelopercourse.section3_controlstatements.lessons;

import java.util.Random;

/**
 * @author john-michael.obrien
 * @since 1/2/23
 */
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNum;

        // random number, can be pos/neg and huge
        myRandomNum = random.nextInt();
        System.out.println("Your random number is: " + myRandomNum);

        // random number 0 - 999
        myRandomNum = random.nextInt(1000);
        System.out.println("Your random number between 0 and 999 is: " + myRandomNum);

        // shift technique (essentially + 1)
        myRandomNum = random.nextInt(1000) + 1;
        System.out.println("Your random number between 1 and 1000 is: " + myRandomNum);
    }
}
