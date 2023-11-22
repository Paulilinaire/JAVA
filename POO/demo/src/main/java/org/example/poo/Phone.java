package org.example.poo;

public class Phone extends Product{ // extends = hérite
    int price;
    public Phone() {
    }

    public Phone(int id, String name, int price) {
        super(id, name); // attributs du parent
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
