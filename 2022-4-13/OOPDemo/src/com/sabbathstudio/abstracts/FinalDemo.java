package com.sabbathstudio.abstracts;
/*
* final的使用
*   final可以修饰变量
*       表示变量的值不可变
*   final可以修饰方法
*       表示方法不可以被重写
*   final可以修饰类
*       表示类不可以被继承
*
*/
public class FinalDemo {

//    private const String name = "张三";
    public final void test(){
        System.out.println("final test");
    }

    public static final int age = 10;

    public static void main(String[] args) {
//        age = 20;
    }

}
