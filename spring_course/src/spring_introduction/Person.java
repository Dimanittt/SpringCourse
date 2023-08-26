package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }
//
//       public Person(){
//        System.out.println("Person bean is created");
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: setAge");
        this.age = age;
    }
    // pet -> setPet
    // Pet -> setPet
    // setPet -> setPet

    //    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class person: setPet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}

