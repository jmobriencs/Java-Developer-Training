package javadevelopercourse.section4_arraysandarraylists.lessons;

import java.util.ArrayList;

/**
 * @author john-michael.obrien
 * @since 1/6/23
 *
 * Wrapper classes:
 * Byte, Short, Integer, Long
 * Float, Double
 * Character, Boolean
 */
public class Wrappers {
    public static void main(String[] args) {
        ArrayList<Integer> myArrList = new ArrayList<>();

        // Storing a primitive, but java knows to automatic box
        // This only works with the wrapper classes
        myArrList.add(10);
        myArrList.add(22);

        // Auto unboxing
        for (int i = 0; i < myArrList.size(); i++) {
            int num = myArrList.get(i);
            System.out.println(num);
        }

        // wrapping
        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;

        System.out.println(numericValue);
    }
}
