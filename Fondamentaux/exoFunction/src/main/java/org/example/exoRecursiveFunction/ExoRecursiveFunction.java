package org.example.exoRecursiveFunction;

import java.util.Scanner;

public class ExoRecursiveFunction {

    public static Scanner scanner = new Scanner (System.in);
    public static int getMultiplication(int n, int m) {
        if(m == 0){
            return 0;
        }
        int product =  n + getMultiplication(n,m-1);
        System.out.println(product);
        return product;
    }

    public static long getFactorial(int f) {
        if (f == 0) {
            return 1;
        }
        long factor = f * getFactorial(f - 1);
        return factor;
    }

    public static void display() {
        System.out.println("Entrer un chiffre: ");
        int n = scanner.nextInt();
        long result = getFactorial(n);
        System.out.printf("La factorielle de %d est %d.", n, result);
        scanner.close();
    }
}



