package org.example.library;

public class PaperBook extends Book{
    private String publishingHouse;
    private int amountOfPages;

    public PaperBook(String publishingHouse, int amountOfPages) {
        this.publishingHouse = publishingHouse;
        this.amountOfPages = amountOfPages;
    }

    public PaperBook(String title, String author, String publishingHouse, int amountOfPages) {
        super(title, author);
        this.publishingHouse = publishingHouse;
        this.amountOfPages = amountOfPages;
    }

    public PaperBook() {
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}' + "publishingHouse='" + publishingHouse + '\'' +
                ", amountOfPages=" + amountOfPages +
                '}';
    }
}
