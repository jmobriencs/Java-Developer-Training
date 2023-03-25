package javadevelopercourse.section4_arraysandarraylists.projects;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 1/9/23
 *
 * Obtain the names and ages of 5 individuals
 * Names will go into one Array or ArrayList
 * Ages will go into another Array or ArrayList
 * Each index in the two arrays refers to the same person
 *
 * Once you've optained the data, print out the names and ages in a statement:
 * i.e. "Bob is 15 years old"
 *
 * Do this for each person
 */
public class ParallelArrayProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        String name;
        int age;

        System.out.println("Please enter 5 names and their respective age.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1) + ":");
            name = keyboard.next();
            age = keyboard.nextInt();
            nameList.add(name);
            ageList.add(age);
        }

        System.out.println("The names and ages of the people are: ");
        for (int i = 0; i < ageList.size(); i++) {
            System.out.println(nameList.get(i) + " is " + ageList.get(i) + " years old.");
        }

        System.out.println(); // blank line b/w programs


        // Alternative solution using a linked hashmap (prints in same order as input)
        LinkedHashMap<String, Integer> person = new LinkedHashMap<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a name and an age for a Person " + i + ": ");
            name = keyboard.next();
            age = keyboard.nextInt();
            person.put(name, age);
        }
        System.out.println("The five people and their ages are:");
        System.out.println(person.entrySet());
    }
}
