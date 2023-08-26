package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Update;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
                try {
                    Session session = sessionFactory.getCurrentSession();
                    session.beginTransaction();
                    Employee employee = session.get(Employee.class, 9);
                    employee.setSalary(1700);
                    session.getTransaction().commit();

                    session = sessionFactory.getCurrentSession();
                    session.beginTransaction();
                    session.createQuery("update Employee set salary = 500 where name = 'Zakhar'").executeUpdate();
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
////            Employee firstEmp = session.get(Employee.class, 1);
////            firstEmp.setSalary(1500);
//
//            session.createQuery("Update Employee set salary = 1000 where name = 'Alexander' ")
//                    .executeUpdate();
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//        } finally {
//            factory.close();
//        }


    }
}











