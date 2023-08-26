package com.dmitrystarostin.spring.rest.dao;

import com.dmitrystarostin.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeId(int id);

    void deleteEmployee(int id);
}
