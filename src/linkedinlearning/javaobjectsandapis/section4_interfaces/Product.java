package linkedinlearning.javaobjectsandapis.section4_interfaces;

/**
 * @author john-michael.obrien
 * @since 4/4/23
 */
public interface Product {
    String getName();
    void setName(String name);

    // declaring as default does not require classes implementing the interface to instantiate/override the method
    // default methods are not final
    default double getPrice() { return 50; }
    default void setPrice(double price) {}
}
