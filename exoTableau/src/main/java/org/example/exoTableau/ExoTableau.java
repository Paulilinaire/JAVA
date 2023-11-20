package org.example.exoTableau;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExoTableau {

    public static Scanner scanner = new Scanner (System.in);
    public static void exercice1() {
            int[] array = {1,2,3,4,5};

            System.out.println("La valeur de la troisième case du tableau est : " + array[2]);
            scanner.close();
        }

    public static void exercice2() {
        // other way to initialize an array with values between 1 and 10
        int[] array = new int[10];

        for (int i = 1; i < array.length; i++){
            array[i] = i + 1;
        }
        System.out.println("Contenu du tableau: ");
        for (int i = 0; i < array.length; i++){
            System.out.println("Element à l'indice " + i + " : n°" + array[i] );
        }
        scanner.close();
    }

    public static void exercice3() {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80};
        int userNum = 0;

        System.out.println("Saisissez un nombre: ");
        userNum = scanner.nextInt();

        if (userNum == 10 || userNum == 20 || userNum == 30 || userNum == 40 || userNum == 50 || userNum == 60 || userNum == 70 || userNum == 80 ){
            System.out.println("Gagné !!!");
        } else {
            System.out.println("Perdu !!!");
        }

        scanner.close();
    }

    public static void exercice4() {
        int size;
        int[] array;
        boolean allPair = true;

        System.out.print("Entrer la taille du tableau: ");
        size = scanner.nextInt();

        array = new int[size];

        System.out.println("Entrer les nombres à insérer dans le tableau:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Check if all elements are pair
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                allPair = false;
                break;
            }
        }

        if (allPair) {
            System.out.println("Tous les éléments sont pairs.");
        } else {
            System.out.println("Au moins un élément est impair.");
        }
        scanner.close();
    }

    public static void exercice5() {
        int arraySize = 10;
        int[] array = new int[arraySize];
        Random randomNum = new Random();

        for (int i = 0; i < arraySize; i++){
            array[i] = randomNum.nextInt(100) + 1;
        }

        System.out.println("Elements du tableau: ");
        for (int i = 0; i < arraySize; i++){
            System.out.println("Element à l'indice " + i + ": n°" + array[i]);
        }
        scanner.close();
    }

    public static void exercice6() {
        int size = 5;
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] sumArray = new int[size];
        Random randomNum = new Random();

        for (int i = 0; i < size; i++){
            array1[i] = randomNum.nextInt(100) + 1;
            array2[i] = randomNum.nextInt(100) + 1;
        }

        for (int i = 0; i < size; i++){
            sumArray[i] = array1[i] + array2[i];
        }

        System.out.println("Element du tableau 1:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element à l'indice " + i + ": n°" + array1[i]);
        }

        System.out.println("\nElements du tableau 2:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element à l'indice " + i + ": n°" + array2[i]);
        }

        // Calculate the sum of the elements of the arrays and display the result
        System.out.println("\nLa somme des tableaux:");
        for (int i = 0; i < size; i++) {
            sumArray[i] = array1[i] + array2[i];
            System.out.println("Element à l'indice " + i + ": " + sumArray[i]);
        }
        scanner.close();
    }

    public static void exercice7() {
        int arraySize = 10;
        int[] array = new int[arraySize];
        Random randomNum = new Random();
        int maxNum = array[0];

        for (int i = 0; i < arraySize; i++){
            array[i] = randomNum.nextInt(100) + 1;
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        System.out.println("Elements dans le tableau: " + Arrays.toString(array));
        //Arrays.toString is mandatory to display an array (java method)

        System.out.println("Le nombre maximum présent dans le tableau est: " + maxNum);
    scanner.close();
    }
}

