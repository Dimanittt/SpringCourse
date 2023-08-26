package com.dmitrystarostin.spring.rest;

import com.dmitrystarostin.spring.rest.configuration.MyConfig;
import com.dmitrystarostin.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee getEmployeeByID = communication.getEmployee(4);
//        System.out.println(getEmployeeByID);

//        Employee employee = new Employee("Sveta" , "Sokolova", "HR", 1300);
//        employee.setId(11);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(11);
    }
}
