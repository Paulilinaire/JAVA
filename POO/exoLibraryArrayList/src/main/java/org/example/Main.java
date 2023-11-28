package org.example;

import org.example.library.Ebook;
import org.example.library.Library;
import org.example.library.PaperBook;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        // Adding PaperBooks
        PaperBook paperBook1 = new PaperBook("To Kill a Mockingbird", "Harper Lee", "PublisherA", 300);
        library.addPaperBook(paperBook1);

        PaperBook paperBook2 = new PaperBook("1984", "George Orwell", "PublisherB", 250);
        library.addPaperBook(paperBook2);

        // Adding Ebooks
        Ebook ebook1 = new Ebook("The Catcher in the Rye", "J.D. Salinger", "EPUB");
        library.addEbook(ebook1);

        Ebook ebook2 = new Ebook("The Great Gatsby", "F. Scott Fitzgerald", "PDF");
        library.addEbook(ebook2);

        //Filter by Author
        System.out.println("Quel est le nom de l'auteur que vous cherchez ?");
        String authorFilter = scanner.next();

        library.filteredBooksByAuthor(authorFilter);









    }
}