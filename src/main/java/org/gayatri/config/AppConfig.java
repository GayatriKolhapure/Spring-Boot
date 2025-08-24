package org.gayatri.config;

import org.gayatri.Alien;
import org.gayatri.Computer;
import org.gayatri.Desktop;
import org.gayatri.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan("org.gayatri")
public class AppConfig {

//    @Bean
//    public Alien alien1(@Autowired Computer comp){
//        Alien obj = new Alien();
//        obj.setCom(comp);
//        obj.setAge(25);
//        return obj;
//    }
//
////    @Bean(name = {"com1", "desk", "com"})
//    @Bean
////    @Scope("prototype")
//    @Primary
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();

 //  }
}
