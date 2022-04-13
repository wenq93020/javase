package com.sabbathstudio.abstracts;

public class Test {

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        System.out.println(t2.hashCode());
    }

}

class Test2{
    public String name;
}
