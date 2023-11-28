package org.example.classes;

public class Ebook extends Book {
    private String format;
    private Long size;

    public Ebook(int id, String title, String author, String format, Long size) {
        super(id, title, author);
        this.format = format;
        this.size = size;
    }


    public String getFormat() {
        return format;
    }

    public Long getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() +", Ebook:" +
                "format='" + format + '\'' +
                ", size=" + size;
    }
}
