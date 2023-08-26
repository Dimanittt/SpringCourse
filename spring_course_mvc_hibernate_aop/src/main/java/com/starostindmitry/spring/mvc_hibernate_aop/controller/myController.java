package com.starostindmitry.spring.mvc_hibernate_aop.controller;

import com.starostindmitry.spring.mvc_hibernate_aop.Service.EmployeeService;
import com.starostindmitry.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.starostindmitry.spring.mvc_hibernate_aop.dao.EmployeeDAOimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.starostindmitry.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class myController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String allEmployees(Model model){

        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);

        return "all-employees";
    }
    @RequestMapping("addNewEmployee")
    public String addNewEmployee(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){


        employeeService.saveEmployee(employee);

        return "redirect:/";
    }

    @RequestMapping("updateInfo")
    public String updateEmployee(@RequestParam("employeeId") int id, Model model){
        Employee employee = employeeService.getEmployeeId(id);
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("deleteEmployee")
    public String deleteEmployee(@RequestParam("employeeId") int id) {

        employeeService.deleteEmployee(id);

        return "redirect:/";
    }

}
