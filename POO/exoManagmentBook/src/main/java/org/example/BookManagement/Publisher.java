package org.example.BookManagement;

public class Publisher {
    int id;
    String name;
    public static int counter = 0;


    public Publisher(int i, String name) {
        this.id = counter++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Publisher.counter = counter;
    }

    @Override
    public String toString() {
        return "n° " + id +
                ", nom : " + name + '\'';
    }
}
