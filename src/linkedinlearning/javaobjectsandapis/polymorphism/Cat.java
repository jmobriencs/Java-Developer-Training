package linkedinlearning.javaobjectsandapis.polymorphism;

/**
 * @author john-michael.obrien
 * @since 4/2/23
 */
public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("I am a cat, I scratch scratch scratch!");
    }
}
