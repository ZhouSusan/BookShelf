package org.example;

public class Book {
    private String _title;
    private String _author;
    private String _publisher;
    private String _iSBMNumber;
    private int _copyRight;

    public Book (String title, String author, String publisher, String iSBMNumber, int copyRight) {
        this._title = title;
        this._author = author;
        this._publisher = publisher;
        this._iSBMNumber = iSBMNumber;
        this._copyRight = copyRight;
    }
}
