import java.sql.Array;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getNumberOfBooksInLibrary() {
        return books.size();
    }

    public void addBookToLibrary(Book book) {
        if(!checkIfCapacityReached()){
        books.add(book);}
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean checkIfCapacityReached() {
        return books.size() >= capacity;
    }

    public Book removeBookFromLibrary() {
        return books.remove(0);
    }
}
