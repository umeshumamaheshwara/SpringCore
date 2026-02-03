package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



//java

//@Configuration
//public class AppConfig {
//
//    @Bean
//    Student student(){
//        return  new Student();
//    }
//
//    @Bean
//    Address address(){
//        return new Address();
//    }
//}

//Using constructor directly

//@Configuration
//public class AppConfig {
//
//    @Bean
//    Student student(){
//        return  new Student(1,"Hamesh",address());
//    }
//
//    @Bean
//    Address address(){
//        return new Address("bng");
//    }
//}

//annoatation throght the java
//@Configuration
//@ComponentScan(basePackages = "org.example")
//public class AppConfig {
//
//    @Bean
//    Student student(){
//        return  new Student();
//    }
//
//    @Bean
//    Address address(){
//        return new Address();
//    }
//}



// throught the constructor
@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

    @Bean
    Student student(){
        return  new Student(10,"tom", new Address("bgm"));
    }


}

