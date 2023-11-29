package org.example.PaperShop;

public class Pen extends OneItem {
    private String color;

    public Pen(String reference, String name, double price, String color) {
        super(reference, name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", " + super.toString() +
                '}';
    }
}
