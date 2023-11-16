package org.example.exo2;

        import java.util.Scanner;

public class Exo2 {

    public static void squareNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un nombre: ");
        Integer userNum = scanner.nextInt();
        int squareNum = userNum * userNum;
        System.out.println("Le carré du nombre " + userNum + " est " + squareNum);

    }

    public static void userName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est ton nom: ");
        String name = scanner.next();
        System.out.println("Bonjour " + name + "!");

    }
    public static void prixTTC() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Le prix HT unitaire de votre article: ");
        Double prixHt = scanner.nextDouble();
        System.out.println("Le nombre d'article: ");
        Integer nbArticle = scanner.nextInt();
        System.out.println("Le taux TVA (en pourcentage) à appliquer : ");
        Double tva = scanner.nextDouble();

        double prixTtcUnitaire = prixHt * (1+(tva/100));
        double prixTtc = prixTtcUnitaire * nbArticle;
        System.out.println("Le prix TTC unitaire de votre article est " + prixTtcUnitaire + "€ et le prix TTC total est " + prixTtc + "€.");
    }
}

