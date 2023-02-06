package Section7_ObjectOrientedProgramming.Lessons;

/**
 * @author john-michael.obrien
 * @since 2/5/23
 */
public class BookDemo {
    public static void main(String[] args) {
        Book gameOfThrones = new Book("George Marting", "Game of Thrones", "Fantasy", 864);

        Book mathBook = new Book("James Stewart", "Calculus", "Math", 1392);

        Book javaBook = new Book("Joel Murach", "Murach's Java Programming", "Programming", 800);

        // Calling print in BookDemo class
        printBookDetails(gameOfThrones);
        printBookDetails(mathBook);
        printBookDetails(javaBook);

        // Challenge: Calling print in Book class for each object
        gameOfThrones.printBookDetails();
        mathBook.printBookDetails();
        javaBook.printBookDetails();
    }

    private static void printBookDetails(Book book) {
        System.out.println(book.getTitle());
        System.out.println("by " + book.getAuthor());
        System.out.println("has " + book.getNumPages() + " pages ");
        System.out.println("and its genre is " + book.getGenre() + ".");
        System.out.println();
    }
}
