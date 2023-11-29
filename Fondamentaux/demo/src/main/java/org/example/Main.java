package org.example;

import org.example.arrayMatrix.ArrayMatrix;
import org.example.collections.DemoCollection;
import org.example.collections.Liste;
import org.example.date.Date;
import org.example.operator.Operator;
import org.example.readFromConsole.ReadFromConsole;

import org.example.string.ChaineDeCaractere;
import org.example.structure.Structure;
import org.example.structure.Structure2;
import org.example.variable.Variable;

public class Main {
    // point d'entrée de l'application, exécutera ce qu'il se trouvera à l'intérieur
    public static void main(String[] args) {

//        Variable.getVariable();
//        Operator.getExpression();
//        Operator.getOperatorAndComparaison();
//        Structure.getSwitch();
//        ReadFromConsole.getReadWrite();
//        Structure2.getWhile();
//        ChaineDeCaractere.getFormatString();
        DemoCollection.main();
        }
    }
