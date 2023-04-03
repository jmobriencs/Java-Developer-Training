package linkedinlearning.javaobjectsandapis.section3_abstraction;

/**
 * @author john-michael.obrien
 * @since 4/2/23
 */
public abstract class Shape {

    // Any class that contains an abstract method must be abstract itself
    abstract double calculateArea();

    public void print() {
        System.out.println("I am a shape");
    }
}
