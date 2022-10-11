import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp(){
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("JK Rowling", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }


}
