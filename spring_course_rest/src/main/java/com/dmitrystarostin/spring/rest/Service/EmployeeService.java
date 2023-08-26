package com.dmitrystarostin.spring.rest.Service;

import com.dmitrystarostin.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeId(int id);

    void deleteEmployee(int id);
}









