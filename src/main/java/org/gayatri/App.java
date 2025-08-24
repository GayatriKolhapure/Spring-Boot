package org.gayatri;

import org.gayatri.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alien1 = context.getBean(Alien.class); //get bean given type of the object so need typecast
//        alien1.setAge(21);
        System.out.println(alien1.getAge());
        alien1.code();

//        Desktop desktop = (Desktop)context.getBean(Desktop.class);
//        desktop.compile();
//        Desktop desktop1 = (Desktop)context.getBean(Desktop.class);
//        desktop1.compile();







//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        Alien alien1 = context.getBean("alien", Alien.class); //get bean given type of the object so need typecast
////        alien1.setAge(21);
//        System.out.println(alien1.getAge());
//        alien1.code();
//
////        Alien alien2 = (Alien)context.getBean("alien1");
//
//        Computer computer1 = context.getBean(Computer.class);
//         Desktop desktop = context.getBean(Desktop.class);

    }
}
