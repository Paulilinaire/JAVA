package org.example;

import org.example.BookManagement.Author;
import org.example.BookManagement.Book;
import org.example.BookManagement.Publisher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookService {


    List<Book> filteredAuthors = new ArrayList<Book>();
    public String filterBooksByAuthor(Author author, Book[] books) {
            for (Book filteredBook: books) {
                for (Author filteredAuthor: filteredBook.getAuthor()) {
                if (filteredAuthor.getId()==author.getId()){
                    filteredAuthors.add(filteredBook);
                }
                }

            }
            return filteredAuthors.toString();
        }

    List<Book> filteredPublisher = new ArrayList<Book>();
    public String filterBooksByPublisher(Publisher publisher, Book[] books) {
        for (Book filteredBook: books) {
                if (publisher.getId()==filteredBook.getPublisher().getId()){
                    filteredPublisher.add(filteredBook);
                }
            }

        return filteredPublisher.toString();
    }

    List<Book> filteredByPublishingYear = new ArrayList<Book>();
    public String filterBooksByPublishingYear (int publishingYear, Book[] books) {
        for (Book filteredBook: books) {
            if (publishingYear<=filteredBook.getPublishingYear()){
                filteredByPublishingYear.add(filteredBook);
            }
        }

        return filteredByPublishingYear.toString();
    }

    @Override
    public String toString() {
        return "BookService{" +
                "filteredAuthors=" + filteredAuthors +
                ", filteredPublisher=" + filteredPublisher +
                ", filteredByPublishingYear=" + filteredByPublishingYear +
                '}';
    }
}
