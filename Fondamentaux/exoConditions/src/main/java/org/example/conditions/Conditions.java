package org.example.conditions;
import java.util.Scanner;

public class Conditions {
    public static Scanner scanner = new Scanner(System.in);

    public static void positiveOrNegative() {
        int userNum = 0;
        System.out.println("Saisissez un nombre: ");
        userNum = scanner.nextInt();

        if (userNum < 0 ) {
            System.out.println("Le nombre est négatif.");
        } else if (userNum > 0 ){
            System.out.println("Le nombre est positif");
        } else {
            System.out.println("Le nombre vaut 0");
        }
        scanner.close();
    }

    public static void ageCategories() {
        int userAge = 0;
        System.out.println("Saisissez l'âge de l'enfant: ");
        userAge = scanner.nextInt();

        if (userAge >= 6 && userAge <= 7){
            System.out.println("La catégoerie est Poussin.");
        } else if (userAge >= 8 && userAge <= 9 ) {
            System.out.println("La catégorie est Pupille.");
        } else if (userAge >= 10 && userAge <= 11 ) {
            System.out.println("La catégorie est Minime.");
        } else if (userAge >= 12) {
            System.out.println("La catégorie est Cadet.");
        }
        else{
            System.out.println("Trop agé pour être adnimissible.");
        }
        scanner.close();
    }

    public static void divisibleBy3() {
        int userNum = 0;
        System.out.println("Saisissez un nombre entier: ");
        userNum = scanner.nextInt();

        if (userNum % 3 == 0){
            System.out.println("Le nombre " + userNum + " est divisible par 3.");
        } else {
            System.out.println("Le nombre " + userNum + " n'est pas divisible par 3.");
        }
        scanner.close();
    }

    public static void copies() {
        int copies = 0;
        float price = 0f;
        double totalPrice = 0d;

        System.out.println("Nombre de photocopies: ");
        copies = scanner.nextInt();

        if (copies < 10) {
            price = 0.15f;
        } else if (copies > 10 && copies <= 20) {
            price = 0.10f;
        } else {
            price = 0.50f;
        }

        totalPrice = copies * price;

        System.out.println("Le tarif à régler pour " + copies + " photocopies est de " + totalPrice + " cents.");
        scanner.close();
    }
}
