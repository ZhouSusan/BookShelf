package org.example;
import java.util.Comparator;

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

     public static Comparator<Book> BookNameComparator = new Comparator<Book>() {
         public int compare(Book b1, Book b2) {
             String bookTitle1 = b1.getTitle().toUpperCase();
             String bookTitle2 = b2.getTitle().toUpperCase();

             return bookTitle1.compareTo(bookTitle2);
         }
     };

    public static Comparator<Book> BookAuthorComparator = new Comparator<Book>() {
        public int compare(Book author1, Book author2) {
            String authorName1 = author1.getTitle().toLowerCase();
            String authorName2 = author2.getAuthor().toLowerCase();

            return authorName1.compareTo(authorName2);
        }
    };

    public static Comparator<Book> BookCopyRightComparator = new Comparator<Book>() {
        public int compare(Book b1, Book b2) {
            int copyRight1 = b1.getCopyRight();
            int copyRight2 = b2.getCopyRight();

            return copyRight2 - copyRight1;
        }
    };
}
