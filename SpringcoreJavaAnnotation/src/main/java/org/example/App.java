package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

        //----------Annotation-Based ----> Setter Injection ----------------------


        ApplicationContext  context  = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean("student", Student.class);

        student.setId(100);
        student.setName("Umesh");
        student.setAddress(new Address("Sagar"));

        System.out.println(student);



    }
}
