package org.example.entities;

public class PerformanceEvaluator implements EmployeeVisitor{
    @Override
    public void visit() {
        System.out.println("I review performances.");
    }
}
