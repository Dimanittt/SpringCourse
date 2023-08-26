package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Update;

import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);

            session.createQuery("delete Employee where id = 21").executeUpdate();

            List<Employee> employees = session.createQuery("from Employee ").getResultList();
            for (Employee e : employees){
                System.out.println(e);
            }
            System.out.println("Done!");
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }






















//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .buildSessionFactory();
//
//        try {
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
////            Employee employee = session.get(Employee.class, 6);
////            session.delete(employee);
//
//            session.createQuery("delete Employee where name = 'Zakhar'").executeUpdate();
//            Employee employee = session.get(Employee.class, 8);
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//        } finally {
//            factory.close();
//        }


    }
}











