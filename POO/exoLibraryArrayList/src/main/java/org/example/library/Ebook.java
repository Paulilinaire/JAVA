package org.example.library;

public class Ebook extends Book {

    private String format;

    public Ebook() {
    }

    public Ebook(String format) {
        this.format = format;
    }

    public Ebook(String title, String author, String format) {
        super(title, author);
        this.format = format;
    }


    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Livre numérique :" +
                "format ='" + format + '\'' +
                ", id=" + id +
                ", titre ='" + title + '\'' +
                ", auteur ='" + author + '\'';
    }
}
