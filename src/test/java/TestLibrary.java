import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library1;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before
    public void before(){
        library1 = new Library(5);
        book1 = new Book("Sci-Fi");
        book2 = new Book("Sci-Fi");
        book3 = new Book("Adventure");
        book4 = new Book("Adventure");
        book5 = new Book("Fiction");
        book6 = new Book("Factual");

        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book5);

    }

    @Test
    public void getCapacity(){
        assertEquals(5, library1.getCapacity());
    }

    @Test
    public void getBookCount(){
        assertEquals(4, library1.bookCount());
    }

    @Test
    public void hasSpace__NotFull(){
        assertEquals(true, library1.libraryHasSpace());
    }

    @Test
    public void hasSpace__Full(){
        library1.addBook(book5);
        assertEquals(false, library1.libraryHasSpace());

    }

    @Test
    public void addBook__NotFull(){
        library1.addBook(book5);
        assertEquals(5, library1.bookCount());

    }

    @Test
    public void addBook__Full(){
        library1.addBook(book5);
        library1.addBook(book6);
        assertEquals(5, library1.bookCount());
    }

    @Test
    public void genreMap(){

        HashMap<String, Integer> genres;
        genres = library1.getGenres();
        int val1 = genres.get("Sci-Fi");
        int val2 = genres.get("Adventure");
        int val3 = genres.get("Fiction");
        assertEquals(2, val1);
        assertEquals(1, val2);
        assertEquals(1, val3);
    }




}


