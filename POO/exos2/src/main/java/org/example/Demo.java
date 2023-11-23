package org.example;

import org.example.BookManagement.Author;
import org.example.BookManagement.Book;
import org.example.BookManagement.CoverType;
import org.example.BookManagement.Publisher;

import java.math.BigDecimal;


public class Demo {
    public static void main(String[] args) {

        Book[] books = new Book[]{
                new Book(1, "Book_1", new Author[]{new Author(1, "Jon", "Johnson")}, new Publisher(1,
                        "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.Softcover),
                new Book(2, "Book_2", new Author[]{new Author(1, "Jon", "Johnson"), new Author(2,
                        "William", "Wilson")}, new Publisher(2, "Publisher_2 "), 2000, 120,
                        BigDecimal.valueOf(14.99), CoverType.Softcover),
                new Book(3, "Livre_3", new Author[]{new Author(3, "Walter", "Peterson")}, new
                        Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99),
                        CoverType.Hardcover)
        };

        // Print information about each book
        for (Book book : books) {
            System.out.println(book);
        }
    }

}