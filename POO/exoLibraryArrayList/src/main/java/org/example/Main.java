package org.example;

import org.example.classes.Ebook;
import org.example.classes.Library;
import org.example.classes.PaperBook;
import org.example.classes.Person;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        // Adding PaperBooks
        PaperBook paperBook1 = new PaperBook(1,"To Kill a Mockingbird", "Harper Lee", "PublisherA", 300);
        library.addBook(paperBook1);

        PaperBook paperBook2 = new PaperBook(2,"1984", "George Orwell", "PublisherB", 250);
        library.addBook(paperBook2);

        // Adding Ebooks
        Ebook ebook1 = new Ebook(3,"The Catcher in the Rye", "J.D. Salinger", "EPUB", 102400L);
        library.addBook(ebook1);

        Ebook ebook2 = new Ebook(4,"The Great Gatsby", "F. Scott Fitzgerald", "PDF", 204800L);
        library.addBook(ebook2);


        System.out.println(library.filteredBooksByAuthor("Lee"));
        library.deleteBook(3);
        System.out.println(library.filteredBooksByAuthor("Lee").size());
        System.out.println(library.filteredBooksByTitle("1984"));

        System.out.println(library.getLoans());
        library.borrowBook(2, new Person("Aijjou", "Mohamed"));
        System.out.println(library.getLoans());
        library.returnBook(2);
        System.out.println(library.getLoans());















    }
}