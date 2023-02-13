package Section7_ObjectOrientedProgramming.Projects;

import java.util.ArrayList;

/**
 * @author john-michael.obrien
 * @since 2/13/23
 */
public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings = new ArrayList<>();

    public IceCream(String name, int cost, int numScoops) {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void printToppings() {
        System.out.println("Topped with: ");
        for (String topping : toppings) {
            System.out.println("\t" + topping);
        }
    }



}
