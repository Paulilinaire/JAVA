package org.example;

import org.example.BookManagement.Author;
import org.example.BookManagement.Book;

public class BookService {

        Book[] filteredBooks;
        public Book[] filterBooksByAuthor(Author author, Book[] books) {
            for (Book filteredBook: books) {
                for (Author filteredAuthor: filteredBook.getAuthor()) {
                if (filteredAuthor.getId()==author.getId()){

                }
                }

            }
            return filteredBooks;
        }

}
