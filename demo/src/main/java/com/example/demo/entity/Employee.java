package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_table")
public class Employee {
@Id
    @Column(name = "emp_id")

    private int id;

    @Column(name = "First_name")
    private String firstName;

    @Column(name = "Last_name")
    private  String lastName;

    @Column(name = "Contact_info")
    private long phoneNo;

    @Column (name = "emp_designation")
    private String designation;

    @Column(name = "Emp_Paisa")
    private  double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, long phoneNo, String designation, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.designation = designation;
        this.salary = salary;
    }
    public Employee(){}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo=" + phoneNo +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
