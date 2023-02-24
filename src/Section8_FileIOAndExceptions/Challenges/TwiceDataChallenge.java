package Section8_FileIOAndExceptions.Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 2/23/23
 * TASK:
 * -Create a program that reads input from a file called nums.txt (include at least 5 numbers)
 * -Then, write a program that multiplies each number by 2 and then stores it in an outfile
 *  called twice_nums.txt
 */
public class TwiceDataChallenge {
    public static void main(String[] args) {
        Scanner inputNums;
        PrintWriter pw;

        try {
            int doubleNum;
            inputNums = new Scanner(new File("src/IOFiles/nums.txt"));
            pw = new PrintWriter("src/IOFiles/twice_nums.txt");

            while (inputNums.hasNext()) {
                doubleNum = inputNums.nextInt() * 2;
                pw.println(doubleNum);
            }
            inputNums.close();
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
    }
}
