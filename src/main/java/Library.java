import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int bookCount(){
        return books.size();
    }

    public boolean libraryHasSpace(){
        if(this.bookCount() >= this.capacity)
        {
            return false;
        }

        return true;
    }

    public void addBook(Book book){
        if (this.libraryHasSpace() == true) {
            books.add(book);
        }

    }
}
