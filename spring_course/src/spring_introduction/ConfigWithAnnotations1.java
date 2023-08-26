package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person myPerson = context.getBean("personBean", Person.class);
        myPerson.callYourPet();
        System.out.println(myPerson.getAge());
        System.out.println(myPerson.getSurname());
        context.close();
    }
}
