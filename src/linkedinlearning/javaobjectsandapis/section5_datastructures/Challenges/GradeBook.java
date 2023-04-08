package linkedinlearning.javaobjectsandapis.section5_datastructures.Challenges;

import com.sun.codemodel.internal.JForEach;

import java.util.HashMap;
import java.util.Map;

/**
 * @author john-michael.obrien
 * @since 4/7/23
 *
 * Given 5 students w/ 10 exam scores, see if their makeup exam is higher.
 * If so, credit them the higher of the 2 scores and display the highest score.
 *
 * Given:
 *  -A map of students and their original exam score
 *  -A map of students and their makeup exam score
 */
public class GradeBook {
    public static void main(String[] args) {
        Map<String, Integer> gradeBook = getOriginalScores();
        Map<String, Integer> makeupExam = getMakeupScores();

        gradeBook.forEach((student, originalScore) -> {
            Integer makeupScore = makeupExam.get(student);
            if (makeupScore > originalScore) {
                gradeBook.put(student, makeupScore);
            }

            System.out.println(student + ":" + gradeBook.get(student));
        });

    }

    public static Map<String, Integer> getOriginalScores() {
        Map<String, Integer> originalExam = new HashMap<>();

        originalExam.put("Jim", 68);
        originalExam.put("Stacy", 81);
        originalExam.put("Peter", 97);
        originalExam.put("Shane", 45);
        originalExam.put("Zack", 57);
        return originalExam;
    }

    public static Map<String, Integer> getMakeupScores() {
        Map<String, Integer> makeupExam = new HashMap<>();
        makeupExam.put("Jim", 66);
        makeupExam.put("Stacy", 81);
        makeupExam.put("Peter", 93);
        makeupExam.put("Shane", 71);
        makeupExam.put("Zack", 79);
        return makeupExam;
    }
}
