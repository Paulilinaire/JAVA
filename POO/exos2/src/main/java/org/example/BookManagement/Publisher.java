package org.example.BookManagement;

public class Publisher {
    int id;
    String name;
    public static int counter = 0;


    public Publisher(int i, String name) {
        this.id = counter++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
