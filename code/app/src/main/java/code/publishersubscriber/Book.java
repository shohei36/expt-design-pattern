package code.publishersubscriber;

public class Book {
    private String author;
    private String name;
    private String genre;

    public Book(String author, String name, String genre) {
        this.author = author;
        this.name = name;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }
}
