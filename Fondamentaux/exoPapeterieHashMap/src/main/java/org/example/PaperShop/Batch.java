package org.example.PaperShop;

public class Batch extends Item{

    private Item item;
    private int quantity;
    private int discount;

    public Batch(String reference, String referenceItem, int quantity, int discount) {
        super(reference);
        this.item = Item.getItem(referenceItem); // method existing in the abstract class Item
        this.quantity = quantity;
        this.discount = discount;
    }

    @Override
    public String getName() {
        return "Lot de " + quantity + " " + item.getName();
    }

    @Override
    public double getPrice() {
        return quantity * item.getPrice() * (100 - discount) / 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Batch: " +
                " quantity=" + quantity +
                ", discount=" + discount +
                ", reference=" + getReference();
    }
}
