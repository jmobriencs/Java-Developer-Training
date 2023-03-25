package javadevelopercourse.section4_arraysandarraylists.lessons;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author john-michael.obrien
 * @since 1/6/23
 *
 * ArrayLists can grow in size and are dynamic.
 * ArrayLists only hold reference data types, not primitives.
 * ArrayLists are a type of entity known as generic.
  */
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<Integer> numList = new ArrayList<>();
        Random random = new Random();

        namesList.add("John");
        namesList.add("Kyle");
        namesList.add("Alex");
        namesList.add("Stacy");
        namesList.add("Carson");

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        // auto unboxing
        numList.add(2);
        numList.add(5);
        numList.add(12);
        numList.add(9);
        numList.add(6);

        for (int num : numList) {
            System.out.println(numList.get(num));
        }


    }
}
