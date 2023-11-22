package org.example.exoString;

import java.util.Arrays;

public class ExoString {
    public static String sentence = "Hello Beyoncé, what's up?";
    public static void getWordCounter() {
        // Split the sentence into words // Trim is important because delete useless spaces
        String[] words = sentence.trim().split(" ");

        // Count the number of words
        int wordCount = words.length;
        System.out.println("Nombre de mots dans '" + sentence + "' :  " + wordCount);
    }

    public static void getOccurenceLetter() {
        char letter = 'l';
        int count = 0;

        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == letter){
                count++;
            }
        }
        System.out.printf("La lettre '%s' se trouve %d fois dans la phrase : '" + sentence + "'.", letter, count);
    }

    public static void getAnagram(String str, String str2) {
        // Convert strings in arrays of chars
        if (str.length() == str2.length()) {
            char[] charArray1 = str.toLowerCase().toCharArray();
            char[] charArray2 = str2.toLowerCase().toCharArray();

            // Sorts arrays of chars in alphabetical order
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            System.out.println(charArray1);
            System.out.println(charArray2);

            // Compare sorted arrays
            if (Arrays.equals(charArray1, charArray2))
                System.out.printf("Les mots '%s' et '%s' sont des anagrammes.", str, str2);
            else
                System.out.printf("Les mots '%s' et '%s' ne sont pas des anagrammes.", str, str2);

        } else
            System.out.printf("Les mots '%s' et '%s' ne sont pas des anagrammes.", str, str2);
    }

    public static boolean isPalindrome(String str) {
        if (str.isEmpty() || str.length() == 1)
            return true;
        if (str.charAt(0) == str.charAt(str.length()-1))
            return isPalindrome(str.substring(1, str.length()-1));
        return false;

    }

    public static void getPalindrome() {
        String[] strings = {"ici", "world","lol", "hello", "non"};
        for (String string: strings){
            if (isPalindrome(string)){
                System.out.println("'" + string + "' est un palindrome.");
            } else {
                System.out.println("'" + string + "' n'est pas un palindrome.");
            }
        }

    }

    public static void getPyramid(int height) {
        String display = "";

        for (int i = 1; i < height * 2 ; i++){
            if (i <= height){
                System.out.println(display += "*");
            } else {
                System.out.println(display.substring(0, height * 2 - i));
            }
        }
    }

}
