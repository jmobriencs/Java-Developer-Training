package linkedinlearning.javaobjectsandapis.section4_interfaces;

/**
 * @author john-michael.obrien
 * @since 4/4/23
 */
public class Book implements Product {
    private String name;
    private String author;
    private int pages;
    private String isbn;
    private double price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
