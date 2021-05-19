import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int collectionSize() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public boolean checkSpace(){
        return (this.collectionSize() >= this.getCapacity());
    }

}
