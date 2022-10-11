import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp(){
        library = new Library(5);
    }

    @Test
    public void libraryStartsWithNoBooks(){
        assertEquals(0, library.getNumberOfBooksInLibrary());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(3, library.getNumberOfBooksInLibrary());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void capacityIsNotFull(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(false, library.checkIfCapacityReached());
    }

    @Test
    public void capacityIsFull(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(true, library.checkIfCapacityReached());
    }

    @Test
    public void onlyAddBookIfCapacityNotFull(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(5, library.getNumberOfBooksInLibrary());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.removeBookFromLibrary();
        assertEquals(2, library.getNumberOfBooksInLibrary());
    }
}
