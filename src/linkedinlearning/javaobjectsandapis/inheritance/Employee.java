package linkedinlearning.javaobjectsandapis.inheritance;

/**
 * @author john-michael.obrien
 * @since 3/29/23
 */
public class Employee extends Person {
    private String employeeID;
    private String title;

    public Employee() {
        // super(); calls default constructor w/ no params
        super("James", 13, "Male"); // must be first statement in constructor of subclass
        System.out.println("You are in the default subclass constructor");
    }

    public void setEmployeeID() {
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
