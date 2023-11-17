package org.example.exoTableau2;

import java.util.Arrays;
import java.util.Scanner;

public class ExoTableau2 {

    public static Scanner scanner = new Scanner (System.in);
    public static int occurrencesCounter(int[] array, int searchedValue) {
        int occurrences = 0;

        for (int element : array) {
            if (element == searchedValue) {
                occurrences++;
            }
        }

        return occurrences;
    }

    public static void exercice1() {
        int[] array = {2, 4, 7, 4, 9, 4, 5, 4, 8, 4};
        int searchedValue = 4; // Value for which we want to count the occurrences.

        int occurrences = occurrencesCounter(array, searchedValue);

        System.out.println("Elements dans le tableau: " + Arrays.toString(array));
        System.out.println("Le nombre " + searchedValue+ " est présent " + occurrences + " fois dans le tableau.");
    }
}
