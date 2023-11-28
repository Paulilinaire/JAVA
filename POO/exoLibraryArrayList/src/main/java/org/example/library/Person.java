package org.example.library;

public class Person {

    private String name;
    private String firstName;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Personne : " +
                "nom ='" + name + '\'' +
                ", prénom ='" + firstName + '\'';
    }
}
