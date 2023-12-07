package org.example.entities;

public class SalaryAdjuster implements EmployeeVisitor{
    @Override
    public void visit() {
        System.out.println("I rise salary.");
    }
}
