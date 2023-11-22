package org.example.variable;

public class Variable {

    public static void getVariable(){

        // valeurs primitives, à déclarer en minuscules
        byte b = 'A';
        b = 127; // car A est un byte donc un octet, valeur comprise entre -128 - 127
        System.out.println("Valeur de b :" + b);
        short s;
        s = 2000;
        int i = 1259894258;
        long l = 5L;
        char c = 'l';
        boolean bool = true;
        float f = 1.588f;
        double doub = 5.2398745698456 ;// 2 fois la capacité de mémoire d'un float

        i = s;

        // s = i; erreur car un short ne rentre pas dans un int

        char c4 = (char) 69000; // cast = on perd l'information, c'est à dire qu'on lui donne une place trop petite pour la valeur donnée. En castant, on lui dit de redonner une valeur qui fit la place donnée, et donc nouvelle info/valeur rendue
        char c5 = 65000;

        System.out.println("valeur de c4 " + c4);
        System.out.println("valeur de c5 " + c5);


    }

}
