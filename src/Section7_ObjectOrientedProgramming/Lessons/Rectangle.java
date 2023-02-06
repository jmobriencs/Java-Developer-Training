package Section7_ObjectOrientedProgramming.Lessons;

/**
 * @author john-michael.obrien
 * @since 2/5/23
 */
public class Rectangle {
    //Instance fields
    private double length;
    private double width;
    private int numRectangles;

    //Constructors
    public void Rectangle() {}

    public void Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public int getNumRectangles() {
        return numRectangles;
    }
}
