package com.example.employeefinder;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
@Getter
@Setter
public class Employee {
    private String employeeName;
    @Id
    private String employeeId;
    private String employeeJobRole;
    private String employeeDesignation;
    private float experience;
    private String skillSet;
    private String contact;
    private String businessUnit;
}