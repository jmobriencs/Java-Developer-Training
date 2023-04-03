package linkedinlearning.javaobjectsandapis.section1_inheritance.constructors;

/**
 * @author john-michael.obrien
 * @since 3/29/23
 *
 * Inheritance Notes:
 *  -A superclass's constructor is run before the subclass's constructor
 *  -An explicit call can be made to the supeclass's constructor from on of the subclass's constructors by using super()
 *  -An explicit call to the superclass's constructor must be the first statement in the subclass's constructor
 *  -If the superclass does not have a default constructor, the subclass must explicitly call one of its other constructors
 */
public class InheritanceChecker {
    public static void main(String[] args) {
        Employee employee = new Employee();
    }
}
