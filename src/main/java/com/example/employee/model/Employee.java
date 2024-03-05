package com.example.employee.model;

public class Employee {
    private int empId;
    private String empName;
    private String email;
    private String department;

    public Employee(int empId, String empName, String email, String department) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.department = department;
    }

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}