package linkedinlearning.javaobjectsandapis.inheritance.overridingandoverloading;

/**
 * @author john-michael.obrien
 * @since 3/29/23
 */
public class Rectangle {
    protected int length;
    protected int height;
    protected int sides;

    public double getLength() {
        return length;
    }

    public void setLength() {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public double getSides() {
        return sides;
    }

    public void setSides() {
        this.sides = sides;
    }

    public double calculatePerimeter() {
        return (length * 2) + (height * 2) ;
    }

    public void print() {
        System.out.println("I am a rectangle");
    }
}
