package org.example.PaperShop;

public class Batch extends Item{

    private int quantity;
    private int discount;

    public Batch(String reference, int quantity, int discount) {
        super(reference);
        this.quantity = quantity;
        this.discount = discount;
    }

    public Batch(String reference) {
        super(reference);
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Batch{" +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", reference=" + getReference() +
                '}';
    }
}
