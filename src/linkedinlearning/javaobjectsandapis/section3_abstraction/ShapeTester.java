package linkedinlearning.javaobjectsandapis.section3_abstraction;

/**
 * @author john-michael.obrien
 * @since 4/3/23
 */
public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        System.out.println(rectangle.calculateArea());
    }
}
