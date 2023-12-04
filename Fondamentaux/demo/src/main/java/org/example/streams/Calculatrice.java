package org.example.streams;

public class Calculatrice {

    public static double addition (double a, double b){
        return a + b;
    }

    public static double multiplication (double a, double b){
        return a * b;
    }

    public static double soustraction (double a, double b){
        return a - b;
    }

    public double calcule (double a, double b, MethodeCalcule methode){
        return methode.run(a,b);
    }
    //la fonction MethodeCalcule est en paramètre grâce à l'interface @FunctionalInterface
    // et on l'appelle dans le main ainsi : double total = calculatrice.calcule(10, 30, (a,b) -> a + b); (fonction flechée comme en JS)


}
