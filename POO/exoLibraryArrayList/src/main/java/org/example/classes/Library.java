package org.example.classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Loan> loans;

    public Library() {
        books = new ArrayList<>();
        loans = new ArrayList<>();
    }

    private Book findBook(int id){
        Book book = null;
        for (Book b: books) {
           if(b.getId() == id){
               book = b;
               break;
           }
        }
        return book;
    }

    private Loan findLoan(int id){
        Loan loan = null;
        for (Loan l: loans) {
            if(l.getBook().getId() == id){
                loan = l;
            } // on vire le break pour avoir le dernier emprunt de la liste
        }
        return loan;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }

    public boolean addBook(Book book){
        return books.add(book);
    }

    public boolean deleteBook(int id){
        Book book = findBook(id);
        if(book != null){
            return books.remove(book);
        }
        return false;
    }

    public ArrayList<Book> filteredBooksByAuthor(String author) { // Fait une liste car peut donner plus qu'un livre
        ArrayList<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().contains(author)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }
    public ArrayList<Book> filteredBooksByTitle(String title) { // Fait une liste car peut donner plus qu'un livre
        ArrayList<Book> filteredByTitle = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().contains(title)) {
                filteredByTitle.add(book);
            }
        }
        return filteredByTitle;
    }

    public boolean borrowBook(int idBook, Person person){
        boolean result = false;
        Loan isLoanExists = findLoan(idBook);
        if (isLoanExists == null || isLoanExists.getDueDate().isBefore(LocalDate.now()) || isLoanExists.getDueDate().equals(LocalDate.now())){ // 1ere verif : si le livre a été emprunté
            Book book = findBook(idBook);
                if (book != null){
                    Loan loan = new Loan(book, person);
                    loans.add(loan);
                    result = true;
                }
            }
        return result;
    }

    public boolean returnBook(int idBook){
        boolean result = false;
        Loan isLoanExists = findLoan(idBook);
        if(isLoanExists != null && isLoanExists.getDueDate() == null){ // on vérifie que le livre est bien empruntée et si livre emprunté la dueDate est à null vu qu'il n'a pas encore été retournée
            isLoanExists.setDueDate(LocalDate.now());
            result = true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Bibliothèque : " +
                ", listOfBooks=" + books +
                ", listOfLoans=" + loans ;
    }

}
