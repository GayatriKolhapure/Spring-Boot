package org.gayatri;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;

    public Alien(){
        System.out.println("Object created for Alien");
    }
//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age, Computer com) {
//        System.out.println("Para constructor called");
//        this.age = age;
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding........");
        com.compile();
    }
}
