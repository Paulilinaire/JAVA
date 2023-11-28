package org.example.classes;

public class PaperBook extends Book{
    private String publishingHouse;
    private int amountOfPages;

    public PaperBook(int id, String title, String author, String publishingHouse, int amountOfPages) {
        super(id, title, author);
        this.publishingHouse = publishingHouse;
        this.amountOfPages = amountOfPages;
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
        return super.toString() + ", PaperBook:" +
                "publishingHouse='" + publishingHouse + '\'' +
                ", amountOfPages=" + amountOfPages ;
    }
}
