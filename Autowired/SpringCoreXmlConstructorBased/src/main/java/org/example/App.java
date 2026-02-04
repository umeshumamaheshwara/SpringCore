package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student bean = context.getBean(Student.class);
        System.out.println(bean);

        /*If we Want to get the Multiple Details Info We have to Do This way we cant directly call the Student s = context.getBean(Student.class);
        because  Spring does not know which Student you want.

        Student s = (Student) context.getBean("student1");
        Student s2 = (Student) context.getBean("student2");


        System.out.println(s1);
        System.out.println(s2); */
    }
}
