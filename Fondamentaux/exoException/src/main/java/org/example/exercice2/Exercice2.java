package org.example.exercice2;

public class Exercice2 {
    public static void convertStringIntoInt() {
        String str = "az";
        try{
            int number = Integer.parseInt(str);
            System.out.println(number);
        }
        catch (NumberFormatException e){ // NumberFormatException is the name of the exception
            System.out.println("Mauvaise saisie !");
        }

    }
}
