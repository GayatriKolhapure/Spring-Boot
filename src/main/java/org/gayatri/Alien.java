package org.gayatri;


import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Laptop laptop;

    public Alien(){
        System.out.println("Object created for Alien");
    }
    @ConstructorProperties({"age", "lap"})
    public Alien(int age, Laptop laptop) {
        System.out.println("Para constructor called");
        this.age = age;
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code(){
        System.out.println("Coding........");
        laptop.compile();
    }
}
