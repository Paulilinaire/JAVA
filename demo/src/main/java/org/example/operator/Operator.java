package org.example.operator;

import org.example.model.Maison;

import java.util.Arrays;

public class Operator {

    //region getOperator
    public static void getOperator() {

        System.out.println("**** Les opérateurs ****");

        int i = 10;
        int i2 = -10;

        int i3 = ++i; // incrémentation de +1 donc = 11
        int i4 = i++; // incrémentation de +1 après affectation donc = 11
        int i5 = i; // = 12
        int i6 = --i; // décrémentation de -1 donc = 11
        int i7 = i--; // décrémentation de -1 après affectation donc = 11
        int i8 = i; // = 10


    }
    //endregion

    //region getExpression
    public static void getExpression(){

        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;
        float f = 1.0f;
        double d = 1.0;
        char c = 1;

        int express = b + b;
        int express2 = b + s;
        int express3 = b + i + s;
        long express4 = l + i ;
        float express5 = l + f ;
        double express6 = d + f ;

        int t = 2_000_887_691;
        int t2 = 2_000_887_691;

        int total = t + t2 ;
        System.out.println("total = " + total); // total = -293191914, négatif car plage dépassée donc est revenu au début donc négatif
    }
    //endregion

    //region getOperatorAndComparaison
    public static void getOperatorAndComparaison() {
        int int1 = 128;
        int int2 = 128;
        System.out.println("int1 == int2: " + (int1 == int2)); // = true

        Integer int3 = 128;
        Integer int4 = 128;
        System.out.println("int3 == int4: " + (int3 == int4)); // = false car en dehors de la plage [-128 - 127] donc compare 2 espaces de mémoire différent
        //Integer = wrapper, va envelopper notre entier et va venir enrichir le type primitif et du coup l'utilisation. Quand je fais un int.3, plus de fonctions et méthodes sont possible que int.2

        Integer int5 = 127;
        Integer int6 = 127;
        System.out.println("int5 == int6: " + (int5 == int6)); // = true car compris en tre plage [-128 - 127]

        Integer int7 = new Integer(127);
        Integer int8 = new Integer(127);
        System.out.println("int7 == int8: " + (int7 == int8)); // false car new Integer => c'est un objet donc je lui demande de comparer 2 espaces de mémoires différents car false

        Integer int9 = Integer.valueOf(127);
        Integer int10 = Integer.valueOf(127);
        System.out.println("int9 == int10: " + (int9 == int10)); // true
        // si l'on veut éviter une erreur et manipuler seulement la valeur : ajouter valueOf
        System.out.println("int3 equals int4: " + (int3.equals(int4))); // true car maintenant on compare la valeur

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println("arr1 == arr2 " + (arr1 == arr2)); // false car pareil ici compare 2 espaces de mémoire et non les valeurs
        System.out.println("arr1 equals arr2 " + (arr1.equals(arr2)));
        System.out.println("Arrays " + (Arrays.equals(arr1,arr2)));

        arr1 = arr2;
        System.out.println("arr1 == arr2 " + (arr1 == arr2)); // true

        Maison maison = new Maison("maison", 5);
        Maison maison1 = new Maison("maison", 5);

        System.out.println("maison == maison1 " + (maison == maison1)); // false car 2 espaces mémoires différents
        System.out.println("maison.nom == maison1.nom " + (maison.nom == maison1.nom)); // true car on compare la propriété nom

    }
    //endregion
}
