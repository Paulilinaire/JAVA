package org.example.arrayMatrix;

import java.util.Arrays;

public class ArrayMatrix {

    static int[][] matrix = {{1,2,4},{23,89,5,14,1},{4,9}};

    public static void getMatrix() {
        System.out.println(matrix[0][1]); // car on va chercher le '2' dans le premier tableau à l'index 1

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++){ // matrix[i] pour parcourir un tableau dans le tableau
                System.out.println(matrix[i][j]); // matrix[i][j] pour parcourir la totalité du tableau
            }
        }

    }

    public static void getMatrix2() {
        int[][] array = new int[3][4]; // pour déclarer un tableau de 3 colonnes et 4 lignes

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j*i; // pour remplir le tableau des produits de j et i
            }
                System.out.println(Arrays.toString(array[i]));

        }

    }

}
