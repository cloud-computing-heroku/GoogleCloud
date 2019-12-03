package com.example.hello.service;

import com.example.hello.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public Employee getEmployeeByName(String name) {
        return null;
    }

    @Override
    public boolean deleteEmployeeByName(String name) {
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public boolean isEmployeeExist(Employee employee) {
        return false;
    }
}
