package Section8_FileIOAndExceptions.Lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 2/23/23
 *
 * More file IO practice
 * Will be reading from two files:
 *  -student_names.txt
 *  -student_ages.txt
 */
public class MoreFileIO {
    public static void main(String[] args) {
        Scanner namesFile;
        Scanner agesFile;
        PrintWriter pw;

        try {
            namesFile = new Scanner(new File("src/IOFiles/student_names.txt"));
            agesFile = new Scanner(new File("src/IOFiles/student_ages.txt"));
            pw = new PrintWriter("src/IOFiles/names_ages.txt");
            String tempName;
            int tempAge;

            // Could technically just check one file since both are the same amount of lines
            while (namesFile.hasNext() && agesFile.hasNext()) {
                tempName = namesFile.nextLine();
                tempAge = agesFile.nextInt();
                pw.println(tempName + ": " + tempAge + " years old");
            }

            namesFile.close();
            agesFile.close();
            pw.close();

        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
    }
}
