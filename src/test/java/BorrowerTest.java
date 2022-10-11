import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp(){
        borrower = new Borrower();
        library = new Library(10);
    }

    @Test
    public void borrowerStartsWithNoBooks(){
        assertEquals(0, borrower.getNumberBooksInBorrowerCollection());
    }


    @Test
    public void canAddBookToBorrowerCollection(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        Book book1 = library.removeBookFromLibrary();
        Book book2 = library.removeBookFromLibrary();
        borrower.addBookToBorrowerCollection(book1);
        borrower.addBookToBorrowerCollection(book2);
        assertEquals(2, borrower.getNumberBooksInBorrowerCollection());
    }
}
