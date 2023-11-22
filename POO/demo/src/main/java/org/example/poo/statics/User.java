package org.example.poo.statics;

public class User {
    public static final String DEFAULT_USER_GROUP = "customers";
    public static int counter; // attribut de la classe, pas rattaché à un objet

    private int id;
    private String name;

    public User() {
        this.id = counter++;
    }

//    {
//        counter++; // autre manière d'écrire le constructor au dessus
//    }

    public User(String name) {
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
