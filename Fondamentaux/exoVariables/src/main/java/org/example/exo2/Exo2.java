package org.example.exo2;

import java.util.Scanner;

public class Exo2 {

    // déclarer classe scanner afin de ne pas refaire new Scanner à chaque méthode
    public static Scanner scanner = new Scanner(System.in);

    public static void squareNumber() {
        System.out.println("Saisissez un nombre: ");
        Integer userNum = scanner.nextInt();
        int squareNum = userNum * userNum;
        System.out.println("Le carré du nombre " + userNum + " est " + squareNum);
        scanner.close();

    }

    public static void userName() {
        System.out.println("Quel est ton nom: ");
        String name = scanner.next();
        System.out.println("Bonjour " + name + "!");
        scanner.close();

    }

    public static void prixTTC() {
        System.out.println("Le prix HT unitaire de votre article: ");
        Double prixHt = scanner.nextDouble();
        System.out.println("Le nombre d'article: ");
        Integer nbArticle = scanner.nextInt();
        System.out.println("Le taux TVA (en pourcentage) à appliquer : ");
        Float tva = scanner.nextFloat();

        double prixTtcUnitaire = prixHt * (1 + (tva / 100));
        double prixTtc = prixTtcUnitaire * nbArticle;
        System.out.println("Avec un taux TVA de" + tva + "%, le prix TTC unitaire de votre article est " + prixTtcUnitaire + "€ et le prix TTC total est " + prixTtc + "€.");
        scanner.close();
    }

}

