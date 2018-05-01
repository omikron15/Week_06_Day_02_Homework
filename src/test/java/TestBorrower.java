import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Borrower borrower1;
    Library library1;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before
    public void before(){
        borrower1 = new Borrower();
        library1 = new Library(10);
        book1 = new Book("Sci-Fi");
        book2 = new Book("Sci-Fi");
        book3 = new Book("Adventure");
        book4 = new Book("Adventure");
        book5 = new Book("Fiction");
        book6 = new Book("Factual");
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);
        library1.addBook(book6);
    }

    @Test
    public void bookCountNoBooks(){
        assertEquals(0, borrower1.bookCount());
    }

    @Test
    public void bookCountSomeBooks(){
        borrower1.getBook(library1);
        assertEquals(1, borrower1.bookCount());
    }
}
