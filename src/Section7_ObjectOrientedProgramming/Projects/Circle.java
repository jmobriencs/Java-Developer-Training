package Section7_ObjectOrientedProgramming.Projects;

/**
 * @author john-michael.obrien
 * @since 2/13/23
 */
public class Circle {
    private double radius;

    public Circle(){
        this(1.0);
    };

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
