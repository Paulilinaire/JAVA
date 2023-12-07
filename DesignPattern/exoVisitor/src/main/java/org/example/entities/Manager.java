package org.example.entities;

public class Manager implements Employee {

    @Override
    public void accept(EmployeeVisitor employeeVisitor) {
        System.out.println("I accept employee visitor");
    }
}
