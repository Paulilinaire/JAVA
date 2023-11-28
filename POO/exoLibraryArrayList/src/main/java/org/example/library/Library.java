package org.example.library;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private Book book;
    private Loan loan;
    private ArrayList<Book> listOfBooks;
    private ArrayList<Loan> listOfLoans;
    private ArrayList<Book> filterByAuthor;
    private ArrayList<Book> filterByTitle;

    public Library(Book book, Loan loan, ArrayList<Book> listOfBooks, ArrayList<Loan> listOfLoans) {
        this.book = book;
        this.loan = loan;
        this.listOfBooks = listOfBooks;
        this.listOfLoans = listOfLoans;
    }

    public Library() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public ArrayList<Loan> getListOfLoans() {
        return listOfLoans;
    }

    public void setListOfLoans(ArrayList<Loan> listOfLoans) {
        this.listOfLoans = listOfLoans;
    }

    public ArrayList<Book> getFilterByAuthor() {
        return filterByAuthor;
    }

    public void setFilterByAuthor(ArrayList<Book> filterByAuthor) {
        this.filterByAuthor = filterByAuthor;
    }

    public ArrayList<Book> getFilterByTitle() {
        return filterByTitle;
    }

    public void setFilterByTitle(ArrayList<Book> filterByTitle) {
        this.filterByTitle = filterByTitle;
    }

    public void addPaperBook(PaperBook paperBook) {
        if (listOfBooks == null) {
            listOfBooks = new ArrayList<>();
        }

        if (paperBook != null) {
            listOfBooks.add(paperBook);
            System.out.println("Livre ajouté à la bibliothèque: " + paperBook.getAuthor() + " - " + paperBook.getTitle());
        } else {
            System.out.println("Erreur!");
        }
    }

        public void addEbook(Ebook ebook) {
            if (listOfBooks == null) {
                listOfBooks = new ArrayList<>();
            }

            if (ebook != null) {
                listOfBooks.add(ebook);
                System.out.println("Livre numérique ajouté à la bibliothèque: " + ebook.getAuthor() + " - " + ebook.getTitle());
            } else {
                System.out.println("Erreur!");
            }
        }

    public void filteredBooksByAuthor(String author) {
        for (Book book : listOfBooks) {
            if (author.equals(book.getAuthor())) {
                System.out.println(book);
            }
        }
    }

    public void deleteBook(){
        listOfBooks.remove(book);
        System.out.println("Livre supprimé à la bibliothèque : " + book.getAuthor() + " " + book.getTitle());
    }

    public void displayLibrary() {
        System.out.println("Books in the Library:");

        for (Book book : listOfBooks) {
            System.out.println("----------------------------");
            System.out.println(book.toString());
        }
    }

    @Override
    public String toString() {
        return "Bibliothèque : " +
                ", listOfBooks=" + listOfBooks +
                ", listOfLoans=" + listOfLoans +
                ", filterByAuthor=" + filterByAuthor +
                ", filterByTitle=" + filterByTitle;
    }

}
