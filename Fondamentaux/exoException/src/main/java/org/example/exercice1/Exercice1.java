package org.example.exercice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice1 {

    public static void byZero() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------- Division -----------");
            System.out.println("Donnez moi un nombre : ");
            Integer value = scanner.nextInt();
            System.out.println("Donnez moi un diviseur : ");
            Integer divider = scanner.nextInt();
            double result = value / divider;
            System.out.println("Résutlat : " + result);
        } catch (ArithmeticException | InputMismatchException e) { // exception non surveillée
            System.out.println("Mauvaise saisie !");
        }
        System.out.println("Fin du programme !");

    }



}
