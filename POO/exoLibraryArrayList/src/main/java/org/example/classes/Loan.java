package org.example.classes;

import java.time.LocalDate;

public class Loan {

    private Book book;
    private Person person;
    private LocalDate startDate;
    private LocalDate dueDate;

    public Loan(Book book, Person person) {
        this.book = book;
        this.person = person;
        this.startDate = LocalDate.now();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Loan : " +
                "book = " + book +
                ", person = " + person +
                ", startDate = " + startDate +
                ", dueDate = " + dueDate;
    }
}
