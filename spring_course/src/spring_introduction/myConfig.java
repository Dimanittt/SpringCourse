package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource(value = "classpath:myApp.properties", encoding = "UTF-8")
public class myConfig {

    @Bean
    @Scope(value = "singleton")
    public Pet petBean(){
        return new Dog();
    }

    @Bean
    public Person personBean(){
        return new Person(petBean());
    }
}










