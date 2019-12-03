package com.example.hello.service;

import com.example.hello.model.Employee;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(Employee employee);

    Employee getEmployeeByName(String name);

    boolean deleteEmployeeByName(String name);

    List<Employee> getAllEmployee();

    boolean isEmployeeExist(Employee employee);
}
