package linkedinlearning.javaobjectsandapis.inheritance.chainofinheritance;

/**
 * @author john-michael.obrien
 * @since 3/30/23
 *
 * Java DOES NOT support multiple inheritance, but, you can chain inheritance and classes can point to a parent, which points to another parent etc.
 */
public class Garage {
    public static void main(String[] args) {
        Coupe myCar = new Coupe();
        myCar.setColor("Silver"); // inherited from ancestor (parent, parent class) vehicle

        System.out.println(String.format("My car is %s and has %d doors.", myCar.getColor(), myCar.getDoors()));

        //myCar has access to the following
    }
}
