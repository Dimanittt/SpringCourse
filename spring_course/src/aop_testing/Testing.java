package aop_testing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testing {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contextTesting =
                new AnnotationConfigApplicationContext(myConfiguration.class);
        Autos myAutos = contextTesting.getBean("autos", Autos.class);
        Car ferrari = contextTesting.getBean("car", Car.class);
        Car mercedes = contextTesting.getBean("car", Car.class);
        ferrari.setName("Ferrari");
        ferrari.setYear(2023);
        mercedes.setName("Mercedes");
        mercedes.setYear(2016);
        myAutos.addAuto("Dmitry", ferrari);
        myAutos.addAuto("Olesya", mercedes);
        contextTesting.close();
    }

}
