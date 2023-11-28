package org.example.library;

import org.example.library.enums.BookStatus;

public class Book {

    protected static int counter = 0;
    protected int id;
    protected String title;
    protected String author;

    private BookStatus status;

    public Book() {
        this.id = ++counter;
    }

    public Book(String title, String author) {
        this.id = ++counter;
        this.title = title;
        this.author = author;
        this.status = BookStatus.AVAILABLE;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Livre : " +
                "id =" + id +
                ", titre ='" + title + '\'' +
                ", auteur ='" + author + '\'';
    }
}
