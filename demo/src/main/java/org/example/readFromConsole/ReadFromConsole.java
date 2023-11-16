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
}
