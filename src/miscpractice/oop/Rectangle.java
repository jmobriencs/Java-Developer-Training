package miscpractice.oop;

/**
 * @author john-michael.obrien
 * @since 3/22/23
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this(1.0, 2.0);
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }
}
