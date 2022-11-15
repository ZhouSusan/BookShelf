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
        Book book4 = new Book("Gothic", "Gina Kylie", "Gothic Publishing House",
                "888-444-77", 2005);
        Book book5 = new Book("Test", "Test Tester", "Testing Publishing House",
                "111-111-11", 1111);
        System.out.println(book1.toString());
        System.out.println("*********************");
        book1.setTitle("Jurassic Park");
        book1.setAuthor("Fred Tutorial");
        book1.setCopyRight(1970);
        System.out.println(book1.toString());

        BookCollections myBookCollection = new BookCollections();
        myBookCollection.addBook(book1);
        myBookCollection.addBook(book2);
        myBookCollection.addBook(book3);
        myBookCollection.addBook(book4);
        myBookCollection.addBook(book5);

        myBookCollection.printAllBooksInfo();

        System.out.println("\nSorting by Title: ");
        myBookCollection.sortByNameASC();
        myBookCollection.removeBook(book5);
        System.out.println("\nSorting by Author: ");
        myBookCollection.sortByAuthorASC();
        System.out.println("\nSorting by CopyRight Date: ");
        myBookCollection.sortByCopyRightDES();

        myBookCollection.searchBook(book2);
    }
}