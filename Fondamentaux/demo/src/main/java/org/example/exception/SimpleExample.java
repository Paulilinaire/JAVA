package org.example.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExample {
    public static void exceptionExample() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("********* Division **********");
            System.out.println("Donnez moi un nombre : ");
            Integer value = scanner.nextInt();
            System.out.println("Donnez moi un diviseur : ");
            Integer divider = scanner.nextInt();
            double result = value / divider;
            System.out.println("Résutlat : " + result);
        } catch (ArithmeticException | InputMismatchException e) { // we can put 2 exceptions in the same catch with "|"
            System.out.println("Mauvaise saisie !");
            SimpleExample.exceptionExample();
//        } catch (InputMismatchException e) {
//            System.out.println("Message exception :" + e.getMessage());
//        } catch (ArithmeticException e){
//            System.out.println("Message exception :" + e.getMessage());
        } catch (Exception e){ // takes all the exceptions
            System.out.println("Une exception !!!");
        }
        System.out.println("Fin du programme !");



    }
}
