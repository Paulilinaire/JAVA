package org.example.PaperShop;

public class Line {
    private Item item;
    private int quantity;

    public Line(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public void displayLine() {
        System.out.println("Quantité: " + quantity);
        System.out.println("Référence de l’article: " + item.getReference());
        System.out.println("Nom de l’article: " + item.getName());
        System.out.println("Prix unitaire: " + item.getPrice());
        System.out.println("Prix total: " + calculateTotalPrice());
    }

    double calculateTotalPrice() {
        return item.getPrice() * quantity;
    }
}
