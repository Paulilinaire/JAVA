package org.example.collections;

import java.util.ArrayList;

public class Liste {

    public static void main() {
        //ArrayList<type> <nom> = new ArrayList<type>();
        ArrayList<String> firstNames = new ArrayList<String>();

        //la méthode add() permet d'ajouter des éléments
        firstNames.add("Tam");
        firstNames.add("Clémence");
        firstNames.add("Olivia");
        firstNames.add("Pauline");
        // firstNames.add(42): erreur car int

        //la méthode get permet de récupérer un élément
        System.out.println(firstNames.get(0));
        System.out.println(firstNames.get(1));
        System.out.println(firstNames.get(2));
        System.out.println(firstNames.get(3));

        //la méthode set permet de modifier un élément
        firstNames.set(1,"Marguerite");
        System.out.println(firstNames.get(1));

        //la méthode remove permet de supprimer un élément
        //la méthode size permet de retourner la taille de ma liste
        System.out.println("taille de l'ArrayList : " + firstNames.size());
        firstNames.remove(1);
        System.out.println("taille de l'ArrayList : " + firstNames.size());

        System.out.println("---------- Boucle for ----------");

        //Parcourir avec la boucle for
        for (int i = 0; i < firstNames.size(); i++){
            System.out.println(firstNames.get(i));
        }

        System.out.println("---------- Boucle forEach ----------");

        //Parcourir avec la boucle forEach
        for (String firstName: firstNames) {
            System.out.println(firstName);
        }

    }
}
