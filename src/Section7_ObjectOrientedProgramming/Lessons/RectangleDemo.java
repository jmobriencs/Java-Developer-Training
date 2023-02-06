package Section7_ObjectOrientedProgramming.Lessons;

/**
 * @author john-michael.obrien
 * @since 2/5/23
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        System.out.println(Rectangle.getNumRectangles());

        Rectangle r3; // just declaring does not call constructor, must be instantiated

        System.out.println("After r3 declared: " + Rectangle.getNumRectangles()); // count won't increase b/c r3 only declared, not instantiated

        r3 = new Rectangle(2.5, 4);

        System.out.println("After r3 instantiated " + Rectangle.getNumRectangles());

        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());

        System.out.println(r1.permimeter());
        System.out.println(r2.permimeter());
        System.out.println(r3.permimeter());
    }
}
