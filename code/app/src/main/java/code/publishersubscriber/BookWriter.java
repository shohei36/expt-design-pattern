package code.publishersubscriber;

/**
 * Publisher
 */
public class BookWriter {

    private String name;
    private Book bookOnWorking;

    public BookWriter(String name) {
        this.name = name;
        bookOnWorking = null;
    }

    public void write(String bookName, String bookGenre) {
        bookOnWorking = new Book(name, bookName, bookGenre);
    }

    public void sendToBookStore(BookStore bookStore) {
        bookStore.accept(bookOnWorking);
    }
}
