package org.example;

import org.example.generique.Boite;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Boite<String> boite = new Boite<String>("toto");
        System.out.println(boite.getContenu());

    }
}