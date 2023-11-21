package org.example.exoMatrice;

import java.util.Arrays;
import java.util.Scanner;

public class ExoMatrice {

    public static Scanner scanner = new Scanner (System.in);

    public static void getTheGreatestNumber() {
        int[][] matrix = {{45,23,34,56,30}, {67,75,21,52,59},{89,34,19,19,15},{1,78,90,48,42}};
        int maxNum = matrix[0][0];

        for(int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] >= maxNum) {
                    maxNum = matrix[i][j];
                }
            }
        }
        System.out.printf("Le plus grand nombre dans la matrice est: %d.",maxNum);

    }

    public static void getRectangleMatrix() {
        int[][] matrix = new int[4][5];
        int sum = 0;
        int average = 1;
        double product = 1;
        int count = 1;

        for (int i = 0; i < matrix.length ; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = count++;
                    sum += matrix[i][j];
                    product *= matrix[i][j];
                    average = sum/matrix[i][j];
                }
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.printf("La somme de la matrice est : %d." , sum);
        System.out.printf("\nLe produit de la matrice est : %e." , product);
        System.out.printf("\nLa moyenne de la matrice est : %d." , average);
    }

    public static void getMacchinaSales() {
        String brand;
        String seller;

        String[][] matrix = new String[4][5] ;

        matrix[0][0] = " / ";
        matrix[0][1] = "Giuseppe";
        matrix[0][2] = "Andrea";
        matrix[0][3] = "Leonardo";
        matrix[0][4] = "Marco";

        matrix[1][0] = "Fiat";
        matrix[2][0] = "Ferrari";
        matrix[3][0] = "Bugatti";

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                System.out.printf("Entrer le nombre de voiture vendu par %s pour la marque %s: ", matrix[0][j], matrix[i][0]);
                matrix[i][j] = Integer.toString(scanner.nextInt());
            }
        }

        // Print the matrix
        System.out.println("Matrix of cars sold by sellers for each car brand:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }

}
