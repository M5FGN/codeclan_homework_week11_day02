import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp() {
        library = new Library(3);
        book = new Book("Wuthering Heights", "Bronte", "Classic");
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void emptyCollection() {
        assertEquals(0, library.collectionSize());
    }

    @Test
    public void addBookToCollection() {
        library.addBook(book);
        assertEquals(1, library.collectionSize());
    }

    @Test
    public void addBooksToCollection() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.collectionSize());
    }

    @Test
    public void addBooksToCollectionIfCapacityAllows_Yes() {
        library.addBook(book);
        assertEquals(false, library.checkSpace());
    }

    @Test
    public void addBooksToCollectionIfCapacityAllows_No() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.checkSpace());
    }
}
