package javadevelopercourse.section6_methods.projects;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 2/2/23
 *
 * Write a method called sumElements that takes an ArrayList of integers as its parameter (any size)
 * Sum the elements in the ArrayList and return the sum to the caller
 */
public class SumOfElementsProject {
    public static void main(String[] args) {
        ArrayList<Integer> listNums = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many nums in your ArrayList?");
        int numItems = keyboard.nextInt();

        System.out.println("Please enter any " + numItems + " numbers:");
        for (int i = 0; i < numItems; i++) {
            listNums.add(keyboard.nextInt());
        }
        System.out.println(sumElements(listNums));
    }

    public static int sumElements(ArrayList<Integer> list) {
        int result = 0;
        for (int num : list) {
            int currNum = list.get(num);
            result += currNum;
        }
        System.out.print("ArrayList adds up to: ");
        return result;
    }
}
