package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private int classroomNb;
    private Date graduationDate;



}