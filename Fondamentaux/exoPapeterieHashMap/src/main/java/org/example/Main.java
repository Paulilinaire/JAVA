package org.example;

import org.example.PaperShop.*;



public class Main {
    public static void main(String[] args) {
        System.out.println(Item.getDatabase().size());

        Pen myPen = new Pen("p1", "pen1",2,"blue");
        Pen myPen1 = new Pen("p2", "pen2",1.5,"red");
        Pen myPen2 = new Pen("p3", "pen3",1.8,"yellow");

        Ream myReam = new Ream("r1", "ream1",1,600);
        Ream myReam1 = new Ream("r2", "ream1",0.7,300);
        Ream myReam2 = new Ream("r3", "ream1",0.5,200);

        Batch myBatch = new Batch("b1", 2,10);


        System.out.println(Item.getDatabase().size());
        System.out.println("--------------");
        System.out.println("Afficher un stylo");
        System.out.println(Item.getItem("p1"));
        System.out.println("--------------");
        System.out.println("Afficher un lot");
        System.out.println(Item.getItem("b1"));
        System.out.println();

        System.out.println("--------------");
        Invoice myInvoice = new Invoice("John Doe","2023-11-29");
        myInvoice.addLine(myPen1, 2);
        myInvoice.addLine(myReam2, 1);

        myInvoice.displayInvoice();






    }
}