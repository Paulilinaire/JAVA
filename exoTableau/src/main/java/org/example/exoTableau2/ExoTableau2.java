package org.example.exoTableau2;

import org.example.Main;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class ExoTableau2 {

    public static Scanner scanner = new Scanner (System.in);
    public static int getOccurrences(int[] array, int searchedValue) {
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

        int occurrences = getOccurrences(array, searchedValue);

        System.out.println("Elements dans le tableau: " + Arrays.toString(array));
        System.out.println("Le nombre " + searchedValue+ " est présent " + occurrences + " fois dans le tableau.");
        scanner.close();
    }

        int[] array = {2, 8, 20, 5, 99, 45, 76, 17, 25, 85};
    public static boolean isItAscending(int[] array) {
        int size = array.length;

        for(int i = 0; i < size -1 ; i++){
            if (array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void exercice2() {
        int[] array = {2, 85, 7, 11, 15, 12, 22};

        if (isItAscending(array)){
            System.out.println("Le tableau est trié par ordre croissant.");
        } else {
            System.out.println("Le tableau n'est pas trié par ordre croissant.");
        }
    }

    public static int getGap( int[] array, int n) {
        int gap = 0 ;

        for (int i = 0; i < n - 1; i++){
            int temp = Math.abs(array[i] - array[i + 1]);
            // Math.abs takes the absolute value of the result from subtraction to ensure that the gap value is non negative

            if (temp > gap){
                gap = temp;
            }
        }
        return gap;
    }

    public static void exercice3() {
        int[] array = {2, 5, 6, 41};
        int size = array.length;

        int result = getGap(array, size);
        System.out.println("Le plus grand écart entre deux éléments du tableau est : " + result);
    }

    public static void exercice4() {
        String[] myArray = {"D", "E", "C", "A", "L", "A", "G", "E"};
        String temp = myArray[myArray.length - 1];
        System.out.println(temp);

        for (int i = myArray.length - 1; i > 0 ; i--){
            myArray[i] = myArray[i-1];
            System.out.println(myArray[i]);
        }
        myArray[0] = temp;
        System.out.println(Arrays.toString(myArray));
    }

}
