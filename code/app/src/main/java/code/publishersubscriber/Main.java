package code.publishersubscriber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookWriter bookWriter = new BookWriter("Jhon");
        BookStore bookStore = new BookStore();
        Reader rA = new Reader("A", "novel");
        Reader rB = new Reader("B", "novel");
        Reader rC = new Reader("C", "comic");

        // 読書が自分の好きなジャンルの本のお知らせを行けるように本屋にお願いする
        List<Reader> readers = new ArrayList<>();
        readers.add(rA);
        readers.add(rB);
        readers.add(rC);
        bookStore.addReaders(readers);

        // 作者が本を書いて、本屋に送る
        bookWriter.write("Beauty And Beast", "novel");
        bookWriter.sendToBookStore(bookStore);
        bookWriter.write("tangle", "novel");
        bookWriter.sendToBookStore(bookStore);
        bookWriter.write("Dragon Ball Z", "comic");
        bookWriter.sendToBookStore(bookStore);

        // 本屋が読者の好きなジャンルごとに知らせを送る
        bookStore.notifyToReaders();
    }
}
