package org.example.exoFunction;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExoFunction {
    public static Scanner scanner = new Scanner (System.in);

        public static void exercice1() {
            System.out.print("Entrez des nombres entiers séparés par un espace : ");
            String input = scanner.nextLine();

            // Divide user's entries in array of char
            String[] numbers = input.split(" ");

            // Create an array with user's numbers
            int[] intArray = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                intArray[i] = Integer.parseInt(numbers[i]); // convert in Integer
                System.out.println(intArray[i]);
            }

            int maxValue = findMaxIntInArray(intArray);

            System.out.println("La valeur maximale dans le tableau est : " + maxValue);
            scanner.close();
        }

        public static int findMaxIntInArray(int[] intArray) {
            // Initialize the max value with the first value of the array
            int maxValue = intArray[0];

            // Browse the array to find the max value
            for (int i = 1; i < intArray.length; i++) {
                if (intArray[i] > maxValue) {
                    maxValue = intArray[i];
                }
            }
            return maxValue;
        }

        public static void exercice2() {
            System.out.print("Entrez la hauteur du rectangle : ");
            int height = scanner.nextInt();

            System.out.print("Entrez la largeur du rectangle : ");
            int width = scanner.nextInt();

            // Draw the rectangle
            drawRectangle(height, width);
            scanner.close();
        }

        public static void drawRectangle(int height, int width) {
            // Draw lines of the rectangle
            for (int i = 0; i < width; i++) {
                // Draw columns of the rectangle
                for (int j = 0; j < height; j++) {
                    if (j == 0 || j == height - 1 || i == 0 || i == width -1) { // conditions to leave stars on the first and last line and columns
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }


        public static void exercice3() {
            System.out.println("Saisir du texte: ");
            String text = scanner.next();

            // Split the sentence into words // Trim is important because delete useless spaces
            String[] words = text.trim().split(" ");

            // Count the number of words
            int wordCount = words.length;
            System.out.println("Nombre de mots :  " + wordCount);

        }



}


