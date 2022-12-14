package org.example;
import java.util.*;

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

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public void searchBook(Book thisBook) {
        System.out.format("\nYour searched book results: %s", thisBook.toString());
    }
    public void printAllBooksInfo() {
        for (Book b: bookList) {
            System.out.format("\n***************\n%s", b.toString());
        }
    }

    public void sortByNameASC() {
        Collections.sort(bookList, Book.BookNameComparator);
        printAllBooksInfo();
    }

    public void sortByAuthorASC() {
        Collections.sort(bookList, Book.BookAuthorComparator);
        printAllBooksInfo();
    }

    public void sortByCopyRightDES() {
        Collections.sort(bookList, Book.BookCopyRightComparator);
        printAllBooksInfo();
    }
}
