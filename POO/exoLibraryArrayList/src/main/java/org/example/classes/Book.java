package org.example.classes;

public class Book {
    private static int counter = 0;
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = ++counter;
        this.title = title;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }
    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        Book.counter = counter;
    }

    @Override
    public String toString() {
        return "Book : " +
                "id = " + id +
                ", title = '" + title + '\'' +
                ", author = '" + author + '\'';
    }
}
