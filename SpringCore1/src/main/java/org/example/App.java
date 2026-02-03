package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //This one is only for field and constructor
//        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = context.getBean("student", Student.class);// in this key is not mandatory
//        System.out.println(student);


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean("student", Student.class);// key is not mandatory but default internally it takes the id spring will generate the id  it taken the id .
//
//        student.setId(10);
//        student.setName("Umesh");
//
//        Address address = new Address("banlore");
//
//        student.setAddress(address);
//
//        student.setAddress(new Address("Belgum"));

        System.out.println(student);





    }
}
