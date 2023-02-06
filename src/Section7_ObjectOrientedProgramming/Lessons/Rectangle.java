package Section7_ObjectOrientedProgramming.Lessons;

/**
 * @author john-michael.obrien
 * @since 2/5/23
 *
 * Encapsulation: We combine fields and methods
 */
public class Rectangle {
    //Instance fields
    private double length;
    private double width;

    private static int numRectangles; // exists when no object rectangles exist, is shared when they do


    //Constructors
    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numRectangles++;
    }

    // Instance methods
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public static int getNumRectangles() {
        return numRectangles;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    // Challenge add a perimeter method
    public double permimeter() {
        return length * 2 + width * 2;
    }
}
