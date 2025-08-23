package org.gayatri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        Alien alien1 = (Alien)context.getBean("alien"); //get bean given type of the object so need typecast
//        alien1.age = 21;
//        alien1.code();
//
//        System.out.println(alien1.age);
//
//        Alien alien = (Alien)context.getBean("alien");   //get bean given type of the object so need typecast
////        alien.code();
//        System.out.println(alien.age);
    }
}
