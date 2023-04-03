package linkedinlearning.javaobjectsandapis.section1_inheritance.overridingandoverloading;

/**
 * @author john-michael.obrien
 * @since 3/29/23
 */
public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return sides * length; // inherited from the rectangle class
    }

    public void print(String what) {
        System.out.println("I am a "+ what);
    }
}
