package org.example.readFromConsole;
import java.util.Scanner;

public class ReadFromConsole {

    // signature
    public static void getReadWrite() {
        // corps
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comment tu t'appelles : ");
        String nom = scanner.next(); // next c'est pour chaîne de caractère, nous permet d'intéragir avec console
        System.out.println("Ton nom est " + nom);

        System.out.println("Quel âge as tu : ");
        Integer nombre = scanner.nextInt(); // .next pour un nombre
        System.out.println("Tu as " + nombre + "ans");

    }

    // bonne pratique = un seul point d'entrée par classe
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer un entier: ");
        int num = scanner.nextInt();
        System.out.println("Nombre saisie: " + num);

        System.out.println("Entrer une chaine: ");
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println("Vous aavre saisi " + str);
        // !!erreur car .nextInt() suivi d'un .nextLine() ne fonctionne pas!!
        // Pour y remédier mettre un .nextLine() vide après le .nextInt()
    }
}
