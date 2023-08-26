package hibernate_one_to_one;


import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 3);

            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            sessionFactory.close();
        }


//        try {
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 10);
//            System.out.println(employee);
//            System.out.println(employee.getEmpDetail());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        } finally {
//            session.close();
//            sessionFactory.close();
//        }

//        try {
//            Session session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Butorin", "Alexander", "Engineer", 700);
//            Detail detail = new Detail("Moscow", "89278491029", "Sanek@mail.ru");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        } finally {
//            sessionFactory.close();
//        }


//        try {
//            Session session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Starostin", "Dmitry", "IT", 500);
//            Detail detail = new Detail("Samara", "89914584953", "sad12321@mail.ru");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        } finally {
//            sessionFactory.close();
//        }
    }
}











