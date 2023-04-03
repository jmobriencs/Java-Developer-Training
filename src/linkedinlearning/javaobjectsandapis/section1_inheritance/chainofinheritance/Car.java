package linkedinlearning.javaobjectsandapis.section1_inheritance.chainofinheritance;

/**
 * @author john-michael.obrien
 * @since 3/30/23
 */
public class Car extends Vehicle {
    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
