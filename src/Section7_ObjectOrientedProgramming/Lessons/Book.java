package Section7_ObjectOrientedProgramming.Lessons;

/**
 * @author john-michael.obrien
 * @since 2/5/23
 *
 * Immutable class AKA NO SETTERS
 * Parameterized single constructor (do not provide no-arg constructor)
 */
public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;

    public Book(String author, String title, String genre, int numPages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumPages() {
        return numPages;
    }

    public void printBookDetails() {
        System.out.println(title);
        System.out.println("by " + author);
        System.out.println("has " + numPages + " pages ");
        System.out.println("and its genre is " + genre + ".");
        System.out.println();
    }
}
