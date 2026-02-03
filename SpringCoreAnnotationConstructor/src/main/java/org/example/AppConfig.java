package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//annoatation throght the java


@Configuration
@ComponentScan(basePackages = "org.example")

public class AppConfig {

    @Bean
    Student student(){
        return  new Student(1001,"umesh",new Address("banglore"));
    }


    @Bean
    Student student1() {
        return new Student(1003, "Rahul", new Address("Delhi"));
    }


//    @Bean
//    Address address(){
//        return new Address("banglore");
//    }

}





