package javadevelopercourse.section8_fileioandexceptions.lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 2/23/23
 *
 * RAM: where variables live -- is volatile (aka main memory)
 * Secondary storage: where files live
 * File input: reading data
 *  -reading data from files -- data goes from file (secondary storage) into memory
 */
public class FileInput {
    public static void main(String[] args) {
        Scanner infile;
        int input;
        try {
            infile = new Scanner(new File("src/IOFiles/input.txt"));

            while (infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
            }
            infile.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Error Reading Input");
        }
    }
}
