package miscpractice.oop;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 3/23/23
 */
public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle kitchen = new Rectangle();
        kitchen.setWidth(25);
        kitchen.setLength(50);
        System.out.println("Perimeter of kitchen: " + kitchen.calculatePerimeter());
        System.out.println("Area of kitchen: " + kitchen.calculateArea());

        Rectangle bedroom = getRoom();
        System.out.println("Perimeter of bedroom: " + bedroom.calculatePerimeter());
        System.out.println("Area of bedroom: " + bedroom.calculateArea());


        double totalArea = calculateTotalArea(kitchen, bedroom);
        System.out.println("Total area of both rooms: " + totalArea);
    }

    private static double calculateTotalArea(Rectangle room1, Rectangle room2) {
        return room1.calculateArea() + room2.calculateArea();
    }

    private static Rectangle getRoom() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter bedroom length:");
        double length = keyboard.nextInt();

        System.out.println("Please enter bedroom width:");
        double width = keyboard.nextInt();

        return new Rectangle(length, width);
    }
}
