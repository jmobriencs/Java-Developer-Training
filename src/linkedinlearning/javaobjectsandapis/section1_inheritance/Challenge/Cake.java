package linkedinlearning.javaobjectsandapis.section1_inheritance.Challenge;

/**
 * @author john-michael.obrien
 * @since 3/31/23
 */
public class Cake {
    private String flavor;
    private double price;

    public Cake() {
        this("vanilla");
    }

    public Cake(String flavor) {
        setFlavor(flavor);
        setPrice(9.99);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
