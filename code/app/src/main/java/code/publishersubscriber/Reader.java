package code.publishersubscriber;

import java.util.List;

/**
 * Subscriber
 */
public class Reader {

    private String name;
    private String favoriteGenre;

    public Reader(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }

    public void getInfo(List<Book> books) {
        read(books);
    }

    private void read(List<Book> books) {
        System.out.println("[reader=" + name + ", favorite genre=" + favoriteGenre + "]");
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println(i + "冊目の" + b.getAuthor() + "が書いた「" + b.getName() + "」って本、よき");
        }
    }
}
