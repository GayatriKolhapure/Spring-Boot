package org.gayatri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("21")//inject this value outside the code
    private int age;


//    three types of injection field injection, setter injection, constructor injection
    ///  always prefer to write @Autowired on top of setter


//    @Autowired
//    @Qualifier("laptop")
    private Computer com;


    public Alien(){
        System.out.println("Object created for Alien");
    }
//   @ConstructorProperties({"age", "lap"})
//    public Alien(int age, Computer com) {
//        System.out.println("Para constructor called");
//        this.age = age;
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }


    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding........");
        com.compile();
    }
}
