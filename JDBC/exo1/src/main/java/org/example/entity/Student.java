package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    public static int count = 0;
    private int id;
    private String lastName;
    private String firstName;


    public Student() {
    }


}