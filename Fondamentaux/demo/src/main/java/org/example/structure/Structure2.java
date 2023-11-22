package org.example.structure;

public class Structure2 {

    public static void getBoucleFor() {
        int[] array = {1, 5, 6};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("i = " + i + ", valeur array " + array[i]);
        }

        for (int i = 0, j = 10; i < j; i++, j--) { // i itère par le début(0) et j itère par la fin(10)
            System.out.println(" i : " + i + " " + " j : " + j);
        }

        for (int numb : array ) {
            sum += numb;
        }
        System.out.println("La somme du tableau est de : " + sum);
    }

    public static void getWhile() {
        int i = 1;
        while (i<=5){ // tant que i est inférieure ou égal à 5, i va boucler/incrémenter
            System.out.println("i :" + i);
            i++;
        }

    }

    public static void getBreakAndContinue() {
        System.out.println("----- continue -----");
        for (int i = 0; i < 10 ; i++){

            if ( i % 2 == 0) {
                System.out.println("ça continue"); // ne sort pas de la boucle mais saute une itération
                continue;
            }
        System.out.println("counter " + i);
        }

        System.out.println("----- break -----");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){

                if (j==3){
                    break;
                }
                System.out.println("j " + j);
            }
            System.out.println("counter " + i);
            // la boucle i se fait bien mais dans la partie j, l'itérateur va à 1 et 2 et s'arrête à 3 car break si j==3
        }

    }

}
