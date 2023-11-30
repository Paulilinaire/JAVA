package org.example.PaperShop;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private static int invoiceCounter = 0;
    private int invoiceNumber;
    private String client, date;
    private List<Line> purchasedItems;

    public Invoice(String client, String date) {
        this.invoiceNumber = generateInvoiceNumber();
        this.client = client;
        this.date = date;
        this.purchasedItems = new ArrayList<>();
    }

    private static int generateInvoiceNumber() {
        return ++invoiceCounter;
    }

    public void addLine(Item item, int quantity) {
        purchasedItems.add(new Line(item, quantity));
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Line line : purchasedItems) {
            total += line.calculateTotalPrice();
        }
        return total;
    }

    public void displayInvoice() {
        System.out.println("Facture numéro: " + invoiceNumber);
        System.out.println("Client: " + client);
        System.out.println("Date: " + date);
        System.out.println("----------------------------");
        for (Line line : purchasedItems) {
            line.displayLine();
            System.out.println("----------------------------");
        }
        System.out.println("Prix total de la facture: " + getTotalPrice());
    }


}
