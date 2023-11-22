package org.example.conditionsStructurelles;
import java.util.Scanner;
public class ConditionsStructurelles {

    public static Scanner scanner = new Scanner(System.in);

    public static void betweenOneAndThree() {
        int userNum = 0;

        while (userNum < 1 || userNum > 3) {
            System.out.println("Saisissez un nombre entier entre 1 et 3: ");
            userNum = scanner.nextInt();

            if (userNum < 1 || userNum > 3) {
                System.out.println("Le nombre saisi n'est pas entre 1 et 3. Réessayez.");
            }
        }

        System.out.println("Vous avez saisi le bon nombre : " + userNum);
        scanner.close();
    }

    public static void betweenTenAndTwenty() {
        int userNum = 0;

        while (userNum < 10 || userNum > 20) {
            System.out.println("Saisissez un nombre entier entre 10 et 20: ");
            userNum = scanner.nextInt();

            if (userNum < 10) {
                System.out.println("Plus grand !");
            } else if (userNum > 20) {
                System.out.println("Plus petit !");
            } else {
                System.out.println("Bravo ! Vous avez saisi le bon nombre : " + userNum);
            }

        }
    scanner.close();
    }

    public static void theTenFollowingNumbers() {
        int userNum = 0;
        int i = 1;

        System.out.println("Saisissez un nombre: ");
        userNum = scanner.nextInt();
        System.out.println("Les dix nombres suivants sont: ");

        while (i <= 10) {
            System.out.println(userNum + i);
            i++;
        }
        scanner.close();
    }

    public static void theTenFollowingNumbers2() {
        int userNum = 0;
        int i = 0;

        System.out.println("Saisissez un nombre: ");
        userNum = scanner.nextInt();
        System.out.println("Les dix nombres suivants sont: ");

        for ( i = 1; i <= 10; i++) {
            System.out.println(userNum + i);
        }
        scanner.close();
    }

    public static void multiplicationNumber() {
        int userNum = 0;
        int i = 0;

        System.out.println("Saisissez un nombre: ");
        userNum = scanner.nextInt();
        System.out.println("Table de " + userNum + " :\n");

        for (i = 1; i <= 10; i++) {
                System.out.println(userNum + " x " + i + " = " + i*userNum);
        }
        scanner.close();
    }

    public static void sumOfNumber() {
        int userNum = 0;
        int sum = 0;

        System.out.println("Saisissez un chiffre: ");
        userNum = scanner.nextInt();

        for (int i = 1; i <= userNum; i++) {
            sum = sum + i;
        }
        System.out.println("La somme des entiers jusqu'à " + userNum + " est : " + sum);
        scanner.close();
    }

    public static void theBiggestNumber() {
        int currentNum = 0;
        int maxNum = 0;
        int maxNumPosition = 0;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Entrez le nombre numéro " + i + " : ");
            currentNum = scanner.nextInt();

            if(currentNum > maxNum) {
                maxNum = currentNum;
                maxNumPosition = i;
            }
        }
        System.out.println("Le plus grand de ces nombres est : " + maxNum);
        System.out.println("Il a été entré en " + maxNumPosition + "ème position.");
        scanner.close();
    }

}


