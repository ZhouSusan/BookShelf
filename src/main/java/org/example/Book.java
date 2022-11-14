package org.example;

public class Book {

    private String _title;
    private String _author;
    private String _publisher;
    private String _copyright;

    //This will initialize our values whatever we will supply into the constructor
    public Book(String title, String author, String publisher, String copyRight) {
        this._title = title;
        _author = author;
        this._publisher = publisher;
        _copyright = copyRight;
    }
}
