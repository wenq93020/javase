package com.sabbathstudio.polymorphism;

public class B extends A{

    public void show(){
        System.out.println("BBB");
    }

    public static void main(String[] args) {
        B b = (B)(new A());
        b.show();
        A a = new B();
        a.show();
    }

}
