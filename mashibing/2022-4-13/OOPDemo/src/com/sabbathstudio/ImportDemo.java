package com.sabbathstudio;
import java.util.Date;
import static java.lang.Math.*;
/*
*
* import
*   当需要引入非lang包的其他java类的时候 需要使用import
*       如果不使用import 每次使用某个类的时候必须要将该类的完全限定名都加上才可以使用 太过于繁琐
*   使用
*       import java.包名.类名: 导入具体的类 推荐使用
*       import java.包名.*: 将当前包下的所有类文件都进行导入
*   注意
*       当一个java文件中需要使用多个同名类的时候 只能选择导入一个 其他只能使用完全限定名的方式进行使用
*   静态导包
*       当需要使用某个类的多个方法的时候 同时又不想频繁写该类的名称 此时可以使用静态导包
*       用法
*           import static java.包名.类名.*;
*
*/

public class ImportDemo {

//    public static void sqrt(){
//        System.out.println("sqrt");
//    }

    public static void main(String[] args) {
//        java.util.Date date = new java.util.Date();
//        Date date = new Date();
//        java.sql.Date date1 = new java.sql.Date();
        System.out.println(Math.sqrt(2));
        System.out.println(sqrt(2));
        System.out.println(Math.abs(-2));
        System.out.println(abs(-2));
    }

}
