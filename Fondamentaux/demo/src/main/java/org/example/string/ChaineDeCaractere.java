package org.example.string;

import java.util.Arrays;

public class ChaineDeCaractere {

    public static void getMethodString() {

        System.out.println("--- Les chaînes de caractères ---");

        String s = " hello ";

        System.out.println("s.length() " + s.length());
        System.out.println("s.contains(\"he\") : " + s.contains("he"));
        System.out.println("s.isEmpty : " + s.isEmpty());
        System.out.println("s.toUpperCase() " + s.toUpperCase());
        System.out.println("s.startsWith(\"h\") : " + s.startsWith("h"));
        System.out.println("s.endsWith(\"h\") : " + s.endsWith(" "));
        System.out.println("s.replace(\"ll\", \"LL\") : " + s.replace("ll", "LL"));
        System.out.println("s.trim() : " + s.trim()); // enlève les espaces vides entre chaque chaîne de caractères
        System.out.println("s.substring(0,3) : " + s.substring(0,3)); // ne reste que le string de l'indice 0 à l'indice 3 on (indice 3 non compris)
        System.out.println("s.chartAt(1) : " + s.charAt(4)); // donne la valeur à l'indice 4 de la chaîne de caractère
        System.out.println("Arrays.toString(s.split(\"e\")) : " + Arrays.toString(s.split("e"))) ; //découpe à chaque "e", garde les éléments avant et après et les mets dans un tab
        System.out.println(s);

    }

    public static void getComparaisonString() {
        System.out.println("--- Comparaison String ---");

        String s = " hello ";
        String s2 = " hello ";

        System.out.println("s == s2 : " + (s == s2)); // true car même espace mémoire

        String s3 = new String(" hello ");

        System.out.println("s == s3 : " + (s == s3)); // false new = instancier avec un nouvel objet donc espace mémoire différent

        System.out.println("s.equals(s3) : " + (s.equals(s3))); // true car on compare les valeurs et non les références mémoires

        String firstName = "Alain";
        String firstName1 = "alain";

        System.out.println("firstName.equals(firstName) : " + (firstName.equals(firstName1))); // false

        System.out.println("firstName.equals(firstName1 : " + (firstName1.equalsIgnoreCase(firstName1))); // true

    }

    public static void getFormatString() {
        System.out.println("--- Format String ---");

        String firstName = "Peter";
        String sentence = "Salut, cher %s ! Good %s !";
        String morning = "Morning";
        String evening = "Evening";
        String afternoon = "Afternoon";

        String newSentence = String.format(sentence,firstName,morning);
        System.out.println(newSentence);
        System.out.printf("You're gonna win %d to the lottery in %d days! %s", 10_000_000, 10, "HOURRAAAA !!");

        String productName = "le mot occurences";
        double price = 2.99;
        int quantity = 100;

        System.out.printf("\nClément a dit %s %d fois, il me doit : %.2f € ", productName, quantity, price*quantity);
    }
}