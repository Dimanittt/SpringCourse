package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
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
            Department department1 = new Department("HR", 500, 1500);
            Employee employee1 = new Employee("Olesya", "Afanasyeva", 800);
            Employee employee2 = new Employee("Dmitry", "Starostin", 1000);
            department1.addEmployeeToDepartment(employee1);
            department1.addEmployeeToDepartment(employee2);
            session.beginTransaction();

            session.save(department1);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}











