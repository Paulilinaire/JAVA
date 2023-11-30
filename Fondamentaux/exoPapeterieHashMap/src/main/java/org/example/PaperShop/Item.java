package org.example.PaperShop;

import java.util.HashMap;

public abstract class Item {
    private static HashMap<String, Item> database = new HashMap<>();
    protected String reference;

    public Item(String reference) {
        this.reference = reference;
        //Adding to the database
        database.put(reference, this);
    }

    public String getReference() {
        return reference;
    }

    public static HashMap<String, Item> getDatabase() {
        return database;
    }

    public static Item getItem(String reference) {
        return database.get(reference);
    }

    public abstract String getName();
    public abstract double getPrice();


    @Override
    public String toString() {
        return "Item : " +
                "reference =" + reference ;
    }
}
