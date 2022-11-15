package org.example;

//BookShelf contains the main method which will be our driver class
public class BookShelf {
    public static void main(String[] args) {
        Book book1 = new Book("Choko Bunny", "Fred", "Tweet and Sweeter Publishing House",
                "555-777-88", 1989);
        Book book2 = new Book("Avengers", "Steve Jobs", "Tweet and Sweeter Publishing House",
                "555-777-99", 1992);
        Book book3 = new Book("Star Wars", "Luke Skyler", "May the Force be with you Publishing House",
                "575-478-42", 1985);
//        System.out.println(book.toString());
//        System.out.println("*********************");
//        book.setTitle("Jurassic Park");
//        book.setAuthor("Fred Tutorial");
//        book.setCopyRight(1970);
//        System.out.println(book.toString());

        BookCollections myBookCollection = new BookCollections();
        myBookCollection.addBook(book1);
        myBookCollection.addBook(book2);
        myBookCollection.addBook(book3);

        myBookCollection.printAllBooksInfo();
    }
}