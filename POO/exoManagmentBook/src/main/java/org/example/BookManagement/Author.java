package org.example.BookManagement;

public class Author {
    int id;
    String firstName;
    String lastName;

    public static int counter = 0;

    public Author(int id, String firstName, String lastName) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Author.counter = counter;
    }


    @Override
    public String toString() {
        return " n° " + id +
                ", prénom : '" + firstName + '\'' +
                ", nom : " + lastName + '\'';
    }
}
