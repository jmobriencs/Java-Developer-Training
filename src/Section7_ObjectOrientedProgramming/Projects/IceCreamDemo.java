package Section7_ObjectOrientedProgramming.Projects;

/**
 * @author john-michael.obrien
 * @since 2/13/23
 */
public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC = new IceCream("Chocolate", 3, 2);
        IceCream yourIC = new IceCream("Strawberry", 2, 1);
        myIC.addTopping("nuts");
        myIC.addTopping("cherries");
        yourIC.addTopping("sprinkles");

        printIC(myIC);
        printIC(yourIC);
    }

    private static void printIC (IceCream iceCream) {
        System.out.println(iceCream.getName());
        System.out.println("Num scoops: " + iceCream.getNumScoops());
        System.out.println("Cost: $" + iceCream.getCost());
        iceCream.printToppings();
        System.out.println();
    }

}
