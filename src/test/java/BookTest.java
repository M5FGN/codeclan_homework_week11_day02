import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp() {
        book = new Book("Wuthering Heights", "Bronte", "Classic");
    }

    @Test
    public void hasTitle() {
        assertEquals("Wuthering Heights", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Bronte", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Classic", book.getGenre());
    }





}
