package linkedinlearning.javaobjectsandapis.polymorphism;

/**
 * @author john-michael.obrien
 * @since 4/2/23
 */
public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetch is fun!");
    }
}
