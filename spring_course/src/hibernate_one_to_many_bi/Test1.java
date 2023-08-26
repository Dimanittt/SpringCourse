package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 7);

            System.out.println("Show the department");
            System.out.println(department);

            System.out.println("Show employees of the department");
            department.getEmployees().get(0);

            session.getTransaction().commit();
            System.out.println(department.getEmployees());
            System.out.println("Done!");
        } finally {
            session.close();
            sessionFactory.close();
        }

//        try {
//            session = sessionFactory.getCurrentSession();
//            Department department1 = new Department("IT", 300, 1200);
//            Employee employee1 = new Employee("Olesya", "Afanasyeva", 900);
//            Employee employee2 = new Employee("Kolya", "Mironov", 600);
//            Employee employee3 = new Employee("Dmitry", "Starostin", 1200);
//            department1.addEmployeeToDepartment(employee1);
//            session.beginTransaction();
//
//            department1.addEmployeeToDepartment(employee1);
//            department1.addEmployeeToDepartment(employee2);
//            department1.addEmployeeToDepartment(employee3);
//            session.persist(department1);
//
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        } finally {
//            session.close();
//            sessionFactory.close();
//        }
    }
}











