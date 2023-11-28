package org.example.classes;

public class Person {
    private String name;
    private String firstName;

    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }


    @Override
    public String toString() {
        return "Person : " +
                "name = '" + name + '\'' +
                ", firstName = '" + firstName + '\'';
    }
}
