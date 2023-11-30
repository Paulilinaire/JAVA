package org.example.exercice3;

public class Exercice3 {
    public static void nonExistentIndex() {
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        try{
            int lastNumber = numbers[5];
            System.out.println(lastNumber);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Mauvaise saisie !");
        }
    }
}
