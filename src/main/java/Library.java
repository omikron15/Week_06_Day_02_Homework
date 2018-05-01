import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    HashMap<String, Integer> genres;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.genres = new HashMap<>();
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
            this.updateGenresAddBook(book);
        }

    }

    public void updateGenresAddBook(Book book){

        String genre = book.getGenre();

        if (genres.containsKey(genre)) {
            genres.put(genre, genres.get(genre) + 1);
        }else{
            genres.put(genre, 1);
        }
    }



    public Book removeBook(){
        if(bookCount()>0){
            Book testBook = books.get(0);
            String genre = testBook.getGenre();
            genres.put(genre, genres.get(genre) - 1);
            return this.books.remove(0);
        }
        return null;
    }

    public HashMap<String, Integer> getGenres(){
        return this.genres;
    }
}
