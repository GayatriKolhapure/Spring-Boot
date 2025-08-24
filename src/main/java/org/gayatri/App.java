package org.gayatri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Alien alien1 = (Alien)context.getBean("alien"); //get bean given type of the object so need typecast
//        alien1.setAge(21);
        System.out.println(alien1.getAge());
        alien1.code();

    }
}
