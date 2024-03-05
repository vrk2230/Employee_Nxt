package com.example.employee.repository;

import java.util.*;;

import com.example.employee.model.Employee;

public interface EmployeeRepository {
    Map<Integer, Employee> getEmpMap();

    Employee addEmp(Employee employee);

    Employee getEmpById(int empId);

    Employee updateEmp(int empId, Employee employee);

    void deleteEmployee(int empId);
}