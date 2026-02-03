package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//annoatation throght the java

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
    @Bean
    Student student(){

        return  new Student();
    }

    @Bean
    Address address(){
        return new Address();
    }
}





