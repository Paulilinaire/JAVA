package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String text =
                "Je rêve qu’un jour, notre nation se lèvera pour vivre véritablement son credo : " +
                "“Nous tenons pour vérité évidente que tous les hommes ont été créés égaux.";


        //1.
        String cleanText = text.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        List<String> words = Arrays.asList(cleanText.split("\\s+")); // "+" = one space or more
        System.out.println(words);

        //2.
        // frequencies of words
        Map<String, Long> wordFrequency = words.stream().collect(groupingBy(Function.identity(), counting())); // "collect" converts strings in collection, and "groupingBy", regroup them and count them.
        System.out.println("La fréquence de chaque mot : " + wordFrequency);

        // the longest word
        String theLongestWord = words.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("Le mot le plus long : " + theLongestWord);

        // filter words by their length
        int lengthMin = 6;
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > lengthMin)
                .toList();
        System.out.printf("Filtrer par longueur de mot (%d mots) : %s", lengthMin, filteredWords);
        System.out.println();

        // unique words
        List<String> uniqueWords = words.stream()
                .distinct()
                .toList();
        System.out.println("List de mots uniques : " + uniqueWords);
//        Set<String> uniqueWords = new HashSet<>(words); another way to do it

        // the most frequent words
        List<String> mostFrequentWords = wordFrequency.entrySet().stream().sorted(
                Map.Entry.<String, Long>comparingByValue().reversed()
        ).limit(5).map(e -> e.getKey()).toList(); // "entrySet()" contains key, value(occurrence) and we're gonna sort the values.

        // Calculate average word length
        double averageLength = words.stream()
                .mapToInt(String::length) // length of the value in Integer
                .average()
                .orElse(0.0);

        // Find the shortest and longest word lengths
        int shortestLength = words.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);

        int longestLength = words.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        // Display the statistics
        System.out.println("Longueur moyenne des mots : " + averageLength);
        System.out.println("La longueur du mot le plus court : " + shortestLength);
        System.out.println("La longueur du mot le plus long : " + longestLength);
    }



}