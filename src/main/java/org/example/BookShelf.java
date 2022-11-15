package org.example;

//BookShelf contains the main method which will be our driver class
public class BookShelf {
    public static void main(String[] args) {
        Book book = new Book("Choko Bunny", "Fred", "Tweet and Sweeter Publishing House",
                "555-777-88", 1989);
        System.out.println(book.toString());
        System.out.println("*********************");
        book.setTitle("Jurassic Park");
        book.setAuthor("Fred Tutorial");
        book.setCopyRight(1970);
        System.out.println(book.toString());
    }
}