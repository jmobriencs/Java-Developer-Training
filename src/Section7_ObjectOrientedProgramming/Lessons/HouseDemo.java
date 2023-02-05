package Section7_ObjectOrientedProgramming.Lessons;

/**
 * @author john-michael.obrien
 * @since 2/5/23
 */
public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3, 10, "yellow");

        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("red");

        System.out.println("My house is " + myHouse.getColor() + " and has " + myHouse.getNumStories() + " stories and " + myHouse.getNumWindows() + " windows.");
        System.out.println("Your house is " + yourHouse.getColor() + " and has " + yourHouse.getNumStories() + " stories and " + yourHouse.getNumWindows() + " windows.");

        printHouseData(myHouse);
        printHouseData(yourHouse);
    }


    public static void printHouseData(House house) {
        System.out.println("My house is " + house.getColor() + " and has " + house.getNumStories() + " stories and " + house.getNumWindows() + " windows.");

    }
}
