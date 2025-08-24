package org.gayatri;

public class Desktop implements Computer {
    public Desktop()
    {
        System.out.println("Desktop object created....");
    }
    public Desktop(int age)
    {}
    @Override
    public void compile(){
        System.out.println("compiling using Desktop....");
    }

}
