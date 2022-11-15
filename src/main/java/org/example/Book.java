package org.example;

 class Book {
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

    public void setTitle(String title) {
        this._title = title;
    }
    public String getTitle() {
        return this._title;
    }

     public void setAuthor(String author) {
         this._author = author;
     }
     public String getAuthor() {
         return this._author;
     }

     public void setPublisher(String publisher) {
        this._publisher = publisher;
     }

     public String getPublisher() {
        return this._publisher;
     }

     public void setISBMNumber(String iSBMNumber) {
         this._iSBMNumber = iSBMNumber;
     }

     public String getISBMNumber() {
         return _iSBMNumber;
     }

     public void setCopyRight(int copyRight) {
        this._copyRight = copyRight;
     }

     public int getCopyRight() {
        return _copyRight;
     }

     //Displays book detail 
     public String toString() {
        String bookDetail = String.format("Title: %s \nAuthor: %s \nPublisher: %s", _title, _author, _publisher);
        return bookDetail;
     }
}
