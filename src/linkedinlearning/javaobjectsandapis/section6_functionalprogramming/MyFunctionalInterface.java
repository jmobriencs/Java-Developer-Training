package linkedinlearning.javaobjectsandapis.section6_functionalprogramming;

/**
 * @author john-michael.obrien
 * @since 4/7/23
 */

@FunctionalInterface
public interface MyFunctionalInterface {
    // can only be one abstract method
    int add (int num1, int num2, int num3);

    // can include additional default or static methods, however
}
