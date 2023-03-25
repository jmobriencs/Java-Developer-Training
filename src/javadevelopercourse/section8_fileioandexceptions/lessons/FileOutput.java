package javadevelopercourse.section8_fileioandexceptions.lessons;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author john-michael.obrien
 * @since 2/23/23
 *
 * File output: writing data to files
 *  -writes data from memory (RAM) to file (secondary storage)
 */
public class FileOutput {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("src/IOFiles/output.txt");
            pw.println("Hello there!");
            pw.println("My name is JM O'Brien");
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Could Not Write To File");
        }
    }
}
