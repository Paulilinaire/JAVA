package org.example;

import org.example.poo.Product;
import org.example.poo.statics.Demo;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.setId(10);
        p.setName("Iphone");
        System.out.println(p);
        Product p2 = new Product(11, "Samsung");
        System.out.println(p2);
        System.out.println(p2.getName());
        System.out.println(p2.getClass());
        p2.setId(15);
        System.out.println(p2);
        Product.getBonjour();
        p2.quiSuisJe();
        Demo.demo1();
    }
}