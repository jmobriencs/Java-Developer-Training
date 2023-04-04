package linkedinlearning.javaobjectsandapis.section4_interfaces;

/**
 * @author john-michael.obrien
 * @since 4/4/23
 */
public class Library {
    public static void main(String[] args) {
        Product book = new Book(); //helpful bc ca be polymorphic
        book.setName("Into the Wild");
        System.out.println(book.getName());
    }
}
