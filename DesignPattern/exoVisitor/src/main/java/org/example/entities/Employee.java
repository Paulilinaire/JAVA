package org.example.entities;

public interface Employee {
    void accept(EmployeeVisitor employeeVisitor);
}
