package linkedinlearning.javaobjectsandapis.section1_inheritance.constructors;

/**
 * @author john-michael.obrien
 * @since 3/29/23
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("You are in the default constructor for Person superclass (aka base class)");
    }

    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
        System.out.println("You are in the parameterized constructor for Person superclass (aka base class)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
