package com.starostindmitry.spring.mvc_hibernate_aop.Service;

import com.starostindmitry.spring.mvc_hibernate_aop.entity.Employee;
import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeId(int id);

    void deleteEmployee(int id);
}









