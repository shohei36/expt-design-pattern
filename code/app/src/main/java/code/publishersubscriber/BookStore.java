package code.publishersubscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Broker
 */
public class BookStore {

    private Map<String, List<Book>> bookShelf;

    private List<Reader> nobelReaders;

    private List<Reader> comicReaders;

    public BookStore() {
        bookShelf = new HashMap<>();
        bookShelf.put("novel", new ArrayList<>());
        bookShelf.put("comic", new ArrayList<>());
        nobelReaders = new ArrayList<>();
        comicReaders = new ArrayList<>();
    }

    public void addReaders(List<Reader> readers) {
        for (Reader r : readers) {
            String genre = r.getFavoriteGenre();
            if (genre.equals("novel")) {
                nobelReaders.add(r);
            } else if (genre.equals("comic")) {
                comicReaders.add(r);
            } else {
                System.out.println("この本屋では" + genre + "を扱っていません");
            }
        }
    }

    public void delReaders(List<Reader> readers) {
        for (Reader r : readers) {
            String genre = r.getFavoriteGenre();
            if (genre.equals("novel")) {
                nobelReaders.remove(r);
            } else if (genre.equals("comic")) {
                comicReaders.remove(r);
            } else {
                System.out.println("この本屋では" + genre + "を扱っていません");
            }
        }
    }

    public void accept(Book book) {
        bookShelf.get(book.getGenre()).add(book);
    }

    public void notifyToReaders() {
        for (Reader r : nobelReaders) {
            r.getInfo(bookShelf.get("novel"));
        }
        for (Reader r : comicReaders) {
            r.getInfo(bookShelf.get("comic"));
        }
    }

}
