package com.starostindmitry.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;


@Controller
@RequestMapping("employee")
public class myController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("askDetails")
    public String askEmployeeDetails(Model model) {
        Employee emp = new Employee();
        emp.setName("Dmitry");
        emp.setSurname("Starostin");
        emp.setSalary(1500);
        model.addAttribute("employee", emp);
        return "ask-emp-details-view";
    }

//    @RequestMapping("showDetails")
//    public String showEmployeeDetails(){
//        return "show-emp-details-view";
//    }

//@RequestMapping("showDetails")
//public String showEmployeeDetails(HttpServletRequest request, Model model){
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//        return "show-emp-details-view";
//}

    @RequestMapping("showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "ask-emp-details-view";
        else return "show-emp-details-view";
//        employee.setName("Mr. " + employee.getName());
//        employee.setSurname(employee.getSurname() + "!");
//        employee.setSalary(employee.getSalary() * 10);
//        employee.setCarBrand(employee.getCarBrand() + ", nice :)");
//        employee.setDepartment("grats! it's " + employee.getDepartment());
//        employee.setCarBrand(employee.getCarBrand() + ", nice choice :)");

    }


}
