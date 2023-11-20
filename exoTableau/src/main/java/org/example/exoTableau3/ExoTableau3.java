package org.example.exoTableau3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExoTableau3 {
    public static int[] getReverseArray(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < j){
            //swap elements at position i and j
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            // increment i and decrement j to move them towards the center
            i++;
            j--;
        }
        return array;
    }

    public static void exercice1() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Le tableau original: " + Arrays.toString(array));
        int [] reversedArray = getReverseArray(array);
        System.out.println(("Le tableau inversé :" + Arrays.toString(reversedArray)));
    }

    public static int[] getSelectionSort(int[] array) {
        int arraySize = array.length;
        int minIndice = 0;

        for(int i = 0; i < arraySize - 1; i++){
            minIndice = i;
            // find the indice of the minimum element
            for(int j = i + 1; j < arraySize; j++){ // j = i to go to the next step
                if (array[j] < array[minIndice]){
                    minIndice = j;
                }
            }
            // once the minimum element found, we swap it with the first element of the unsorted array
            int temp = array[i];
            array[i] = array[minIndice];
            array[minIndice] = temp;
        }

        return array;
    }

    public static void exercice2() {
        int[] array = {34, 8, 4, 96, 70, 65};
        System.out.println("Le tableau original: " + Arrays.toString(array));
        int[] sortedArray = getSelectionSort(array);
        System.out.println("Le tableau trié par sélection: " + Arrays.toString(sortedArray));

    }

    public static int[] getBubbleSort(int[] array) {
        int arraySize = array.length;

        for(int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < (arraySize - i) - 1; j++){ // -i -1 permet de ne pas réitérer sur les valeurs qu'on a déjà trié
                System.out.println("Elements comparés: [" + array[j] + " et " + array[j + 1] + "]");
                // If the element at position j is greater than the element at position j+1, we swap them
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void exercice3() {
        int[] array = {45, 8, 4, 80, 27, 55};
        System.out.println("Le tableau original: " + Arrays.toString(array));
        int[] sortedArray = getBubbleSort(array);
        System.out.println("Le tableau trié à bulle: " + Arrays.toString(sortedArray));
    }


}
