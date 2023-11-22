package org.example.exos3;

import java.util.Scanner;

public class Exo3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void positveOrNegative() {
        System.out.println("Saisissez un nombre: ");
        Integer userNum = scanner.nextInt();

        if (userNum < 0) {
            System.out.println("Le nombre est négatif.");
        } else {
            System.out.println("Le nombre est positif.");
        }
        scanner.close();

    }

    public static void positiveOrNegative2() {
        System.out.println("Saisissez un nombre: ");
        Integer userNum = scanner.nextInt();
        System.out.println("Saisissez un autre nombre: ");
        Integer userNum2 = scanner.nextInt();

        if ((userNum < 0) ^ (userNum2 < 0)) {
            System.out.println("Le produit de" + userNum + "et de" + userNum2 + " est positif.");
        } else {
            System.out.println("Le produit de" + userNum + "et de" + userNum2 + " est négatif.");
        }
        scanner.close();
    }

    public static void alphabeticalOrder() {
        System.out.println("Saisissez un premier nom: ");
        String name = scanner.next();
        System.out.println("Saisissez un deuxième nom: ");
        String secondName = scanner.next();
        System.out.println("Saisissez un troixième nom: ");
        String thirdName = scanner.next();

        if ((name.compareToIgnoreCase(secondName) < 0 && secondName.compareToIgnoreCase(thirdName) < 0)) {
            System.out.println("Les noms sont rangés dans l'ordre alphabétique.");
        } else {
            System.out.println("Les noms ne sont pas rangés dans l'ordre alphabétique.");
        }
        scanner.close();
    }

    // possible de remplacer compareToIgnoreCase avec compareTo mais attention il faut rajouter en propriété .tolowerCase ou .toUppercase.
    // Pas nécessaire avec compareToIgnoreCase car compare des chaînes de caractère indépendemment de minuscule ou majuscule

}
