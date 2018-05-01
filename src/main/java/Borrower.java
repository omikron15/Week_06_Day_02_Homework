import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public int bookCount(){
        return books.size();
    }

    public void getBook(Library library){
        this.books.add(library.removeBook());
    }


}
