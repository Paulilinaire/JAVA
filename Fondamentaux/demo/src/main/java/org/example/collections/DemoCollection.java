package org.example.collections;

import java.util.*;

public class DemoCollection {
    public static void main() {
        // Vector
        System.out.println("-------- Vector --------");
        Vector<String> vector = new  Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector : " + vector);
        // méthodes pour le vector
        System.out.println("1. Taille du vector : " + vector.size());
        System.out.println("2. Element à l'index 1 : " + vector.get(1));
        System.out.println("3. Est ce que Apple est présent : " + vector.contains("Apple"));

        // SortedSet (TreeSet)
        System.out.println("-------- SortedSet --------");
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("Python"); // n'ajoute pas de doublon
        sortedSet.add("C++");
        System.out.println("SortedSet : " + sortedSet); // trié par ordre alphabétique
        // méthodes pour sortedSet
        System.out.println("1. Premier élément : " + sortedSet.first());
        System.out.println("2. Dernier élément : " + sortedSet.last());
        SortedSet<String> headSet = sortedSet.headSet("Python");
        System.out.println("3. Sous-ensemble avant 'Python' : " + headSet); //exclu Python

        // LinkedList
        System.out.println("-------- LinkedList --------");
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.71);
        linkedList.add(1.85);
        System.out.println("LinkedList : " + linkedList);
        // méthodes pour linkedSet
        System.out.println("1. Premier élément : " + linkedList.getFirst());
        System.out.println("2. Dernier élément : " + linkedList.getLast());
        linkedList.removeFirst();
        System.out.println("3. Suppression premier élément : " + linkedList);

        // SortedMap (TreeMap)
        System.out.println("-------- SortedMap --------");
        SortedMap<String, Integer> sortedMap = new TreeMap<>(); // les indices sont en srting, les valeurs en Integer
        sortedMap.put("Java", 20);
        sortedMap.put("Python", 20);
        sortedMap.put("C++", 20);
        System.out.println("SortedMap : " + sortedMap); // les valeurs étant pareilles, il trie les clés par ordre alphabétique
        // méthodes pour sortedMap
        System.out.println("1. Clés de sortedMap : " + sortedMap.keySet());
        System.out.println("2. Valeurs de sortedMap : " + sortedMap.values());
        System.out.println("3. Supprimer l'entrée avec la clé 'Java' : ");
        sortedMap.remove("Java");
        System.out.println("SortedMap après suppression : " + sortedMap);
        // parcourir sortedMap
        for (String key: sortedMap.keySet()) {
            System.out.println("Clé " + key + " valeur : " + sortedMap.get(key));
        }

        // HashMap
        System.out.println("-------- HashMap --------");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Tam");
        hashMap.put(2, "Oliva");
        hashMap.put(1, "Clémence");
        hashMap.put(4, "Romain");
        System.out.println("HashMap " + hashMap); // tri les clés, "clés de hachage"
        //méthodes pour hasMap
        System.out.println("1. Taille du hashMap : " + hashMap.size());
        System.out.println("2. Valeur associé à la clé n°1 : " + hashMap.get(1));
        System.out.println("3. La clé 5 est elle présente : " + hashMap.containsKey(5));
        System.out.println("Suppression de l'entrée avec la clé '4' : ");
        hashMap.remove(4);
        System.out.println("HashMap : " + hashMap);
    }
}
