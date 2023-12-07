package org.example;


import org.example.entities.Designer;
import org.example.entities.Developer;
import org.example.entities.PerformanceEvaluator;
import org.example.entities.SalaryAdjuster;

public class Main {
    public static void main(String[] args) {
        Designer designer = new Designer();
        designer.accept(new PerformanceEvaluator());

        Developer developer = new Developer();
        developer.accept(new SalaryAdjuster());
        SalaryAdjuster salaryAdjuster = new SalaryAdjuster();
        salaryAdjuster.visit();
    }
}