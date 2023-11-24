package org.example;

import org.example.BookManagement.Author;
import org.example.BookManagement.Book;
import org.example.BookManagement.CoverType;
import org.example.BookManagement.Publisher;
import org.example.BookService;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Arrays;


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


        BookService bookService = new BookService();
        String listBooksByAuthor = bookService.filterBooksByAuthor(books[2].getAuthor()[0], books);
        //System.out.println(listBooksByAuthor);

        String listBooksByPublisher = bookService.filterBooksByPublisher(books[0].getPublisher(), books);
        //System.out.println(listBooksByPublisher);

        String listBooksByPublishingYear = bookService.filterBooksByPublishingYear(2000, books);
        System.out.println(listBooksByPublishingYear);


    }


}