package org.example;
import java.util.ArrayList;
import java.util.List;

public class BookCollections {
    private Book _book;
    private List<Book> bookList;

    public BookCollections() {
        bookList = new ArrayList<Book>();
    }

    public void setBook(Book book) {
        this._book = book;
    }

    public Book getBook() {
        return this._book;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void printAllBooksInfo() {
        for (Book b: bookList) {
            System.out.format("\n***************\n%s", b.toString());
        }
    }
}
