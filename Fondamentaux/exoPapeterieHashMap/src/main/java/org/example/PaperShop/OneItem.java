package org.example.PaperShop;

public class OneItem extends Item {
    private String name;
    private double price;


    public OneItem(String reference, String name, double price){
        super(reference);
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "OneItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", reference=" + reference +
                '}';
    }
}
