import java.util.ArrayList;


public class Borrower {

    private ArrayList<Book> borrowersBooks;

    public Borrower(){
        this.borrowersBooks = new ArrayList<>();
    }

    public int getNumberBooksInBorrowerCollection() {
        return borrowersBooks.size();
    }

    public void addBookToBorrowerCollection(Book book) {
        borrowersBooks.add(book);
    }
}
