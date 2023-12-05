package org.example.classes;

import org.example.enums.Categories;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private static int counter = 0;
    private int id;
    private String name;
    private Double price;
    private Categories categories;

    public Product(int id) {
        this.id = id;
    }

    public Product(String name, Double price, Categories categories) {
        this.name = name;
        this.price = price;
        this.categories = categories;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Product.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories;
    }
}
