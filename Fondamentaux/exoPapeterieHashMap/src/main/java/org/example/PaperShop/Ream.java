package org.example.PaperShop;

public class Ream extends OneItem {
    private int grammage;

    public Ream(String reference, String name, double price, int grammage) {
        super(reference, name, price);
        this.grammage = grammage;
    }

    public int getGrammage() {
        return grammage;
    }

    @Override
    public String toString() {
        return "Ream{" +
                "grammage=" + grammage +
                ", " + super.toString() +
                '}';
    }
}
