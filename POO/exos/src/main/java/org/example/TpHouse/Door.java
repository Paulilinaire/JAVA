package org.example.TpHouse;
public class Door {
    private String color;

    public Door(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Je suis une porte, ma couleur est " + color + ".");
    }
}

