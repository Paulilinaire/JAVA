package org.example.exoString;

import java.util.Arrays;

public class ExoString {
    public static String sentence = "Hello Beyoncé, what's up?";
    public static void getWordCounter() {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Count the number of words
        int wordCount = words.length;
        System.out.println("Number of words in " + sentence + ":  " + wordCount);
    }

    public static void getOccurenceCounter() {
        char letter = 'e';
        int count = 0;

        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == letter){
                count++;
            }
        }
        System.out.println("La lettre " + letter + " se trouve " + count + " fois dans la phrase : " + sentence);
    }

    public static void getAnagram(String str, String str2) {
        // Convert strings in arrays of chars
        char[] charArray1 = str.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sorts arrays of chars in alphabetical order
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        System.out.println(charArray1);
        System.out.println(charArray2);

        // Compare sorted arrays
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("Les mots " + str + " et " + str2 + " sont des anagrammes.");
        } else {
            System.out.println("Les mots " + str + " et " + str2 + " ne sont pas des anagrammes.");
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
                i++;
                j++;
            }
        }
        return true;
        }

}
