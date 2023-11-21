package org.example.function;

import org.example.model.Maison;

import java.util.ArrayList;
import java.util.List;

public class Function {

    public static void getFunction() {

    }

    public static Integer sum1(int i1, int i2) {
        int result = i1 + i2;
        return result;
    }

    public static double sum2(int i1, int i2, int i3) {
        int result = i1 + i2 + i3;
        return result;
    }

    public static double sum3(String val, double...doubles) { // ... = nombre indéfini de paramèrtes double. A déclarer tjr en dernier
        double result = 0;
        for (double d: doubles){
            result += d;
        }
        return result;
    }

    public static List<Maison> sum(Maison[]val) {
        List<Maison> maisons = new ArrayList<>();
        return maisons;
    }


}
