package com.example.employeefinder;

import jakarta.persistence.*;

@Entity
@Table(name= "Employee")
public class Employee {

    //@Column(name = "Employee_Name")
    private String employeeName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "Employee_Id")
    private double employeeId;
    //@Column(name = "Employee_Job_Role")
    private String employeeJobRole;
    //@Column(name = "Employee_Designation")
    private String employeeDesignation;
    //@Column(name ="Experience")
    private float experience;
    //@Column(name = "Skills")
    private String skillSet;
    //@Column(name = "Contact_Mail_id")
    private String contact;
    //@Column(name = "Business_Unit")
    private String businessUnit;
  




}
