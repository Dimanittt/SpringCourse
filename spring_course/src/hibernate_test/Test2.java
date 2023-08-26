package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Employee employee = new Employee("Zakhar", "Litvinenko", "Engineer", 600);
        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.save(employee);
//            session.getTransaction().commit();

            int myId = employee.getId();
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
            Employee zakhar = session.get(Employee.class, myId);
            System.out.println(zakhar);
            System.out.println("Done!");
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}











