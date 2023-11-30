package org.example.PaperShop;

public class Pen extends OneItem {
    private String color;

    public Pen(String reference, String name, double price, String color) {
        super(reference, name, price);
        this.color = color;
    }


    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", " + super.toString() +
                '}';
    }
}
