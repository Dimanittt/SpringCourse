package com.starostindmitry.spring.mvc_hibernate_aop.Service;

import com.starostindmitry.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.starostindmitry.spring.mvc_hibernate_aop.dao.EmployeeDAOimpl;
import com.starostindmitry.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAOimpl employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeId(int id) {
        return employeeDAO.getEmployeeId(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }


}
