package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Section.class)
                .addAnnotatedClass(Child.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Section section1 = session.get(Section.class, 1);
            session.delete(section1);
            session.getTransaction().commit();

            //            ******************************************
//            Section section1 = new Section("Chess");
//            Section section2 = new Section("Volleyball");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Zakhar", 24);
//
//            session.beginTransaction();
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.save(child1);
            //            ******************************************


//            ******************************************
//            Child child1 = new Child("Dmitry", 24);
//            Child child2 = new Child("Alexander", 25);
//            Child child3 = new Child("Olesya", 21);
//            Section section1 = new Section("Football");
//            section1.addChildToSecion(child1);
//            section1.addChildToSecion(child2);
//            section1.addChildToSecion(child3);
//
//            session.beginTransaction();
//            session.save(section1);
//            ******************************************
            System.out.println("Done!");
            session.getTransaction().commit();


        } finally {
            session.close();
            sessionFactory.close();
        }
    }


}
