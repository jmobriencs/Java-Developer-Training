package linkedinlearning.javaobjectsandapis.inheritance.overridingandoverloading;

/**
 * @author john-michael.obrien
 * @since 3/29/23
 *
 * Overriding and Overloading Notes:
 * -To override a method, you keep the same signature (name + params) but change the body of the method
 * -To overload a method, you keep the same name but change the params of the method
 */
public class InheritanceChecker {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        rectangle.print();
        square.print("Square");
    }
}
