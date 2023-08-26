package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employees = session.createQuery("from Employee").getResultList(); // session.createQuery("from Employee ");
            for (Employee e : employees) {
                System.out.println(e);
            }
            session.getTransaction().commit();

//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            List<Employee> employeeList = session.createQuery("from Employee where name = 'Ksenia'").getResultList();
//            for (Employee e : employeeList) {
//                System.out.println(e);
//            }
//            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            sessionFactory.close();
        }
    }

}










