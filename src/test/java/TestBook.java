import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {

    Book book1;
    Book book2;

    @Before
    public void before(){
        book1 = new Book("Sci-Fi");
        book2 = new Book("Adventure");
    }

    @Test
    public void getGenre(){
      assertEquals("Sci-Fi", book1.getGenre());
      assertEquals("Adventure", book2.getGenre());
    }
}
