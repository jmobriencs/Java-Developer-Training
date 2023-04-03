package linkedinlearning.javaobjectsandapis.section2_polymorphism;

/**
 * @author john-michael.obrien
 * @since 4/2/23
 *
 * If a method is overridden by the subclass, the polymorphic object will execute the overridden method at runtime (as shown below)
 */
public class Pets {
    public static void main(String[] args) {
        // Dog object named rocky (typical inheritance)
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        // Of type animal, instance of dog
        Animal sasha = new Dog();
        sasha.makeSound(); // will call overridden method from dog class

        // Object typecasting - creating a new dog object from an animal
        Dog sashaTheDog = (Dog)sasha;
        sashaTheDog.fetch();
        sashaTheDog.makeSound();

        // instance of cat now
        sasha = new Cat();
        sasha.makeSound(); // will call overridden method from cat class

        // Object typecasting - does not change the overall object, sasha is still type animal
        ((Cat)sasha).scratch();

        Animal daisy = new Dog();

        boolean isDog = daisy instanceof Animal; // will return true b/c dog is subclass of animal

        boolean isAnimal = daisy instanceof Dog; // will return true b/c daisy was instantiated as a dog

        boolean isCat = daisy instanceof Cat; // will return false b/c cat class is not in hierarchy


        // Pattern matching - instance of check, casing the object, and storing the casted object into a new object
        // only works in Java 16 or higher
//         

        // same as

        if (daisy instanceof Dog) {
            Dog daisyTheDog = (Dog)daisy;
            daisyTheDog.fetch();
        }

        feed(rocky);
        feed(sasha);
    }

    // Problem - Create a method that feeds any animal and determines the type of food based on the kind of animal it is
    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Doggy food for you!");
        } else if (animal instanceof Cat) {
            System.out.println("Mmmm. Cat food!");
        }
    }
}
