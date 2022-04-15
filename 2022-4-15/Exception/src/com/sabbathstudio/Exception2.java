package com.sabbathstudio;

/*
* throws: 声明异常
* 在异常情况出现的时候 可以使用try...catch...finally的方式对异常的进行处理 除此之外 可以将异常向外抛出 由外部进行处理
*   1、在方法调用过程中可能存在n多个方法之间的调用 此时假如每个方法中都包含了异常情况 那么就需要在每个方法中都进行try...catch 另一种比较简单的方式就是在方法的最外层调用处理一次即可 使用throws的方式 对所有执行过程中的所有方法出现的异常进行统一集中处理
*   2、如果判断使用throws还是try...catch
*       最稳妥的方式是在每个方法中都进行异常的处理
*       判断在整个的过程中 外层的调用方法是否有对异常的处理 如果有直接使用throws 如果没有就使用try...catch
*
* throw: 抛出异常
*
*/

import java.io.File;
import java.io.FileInputStream;

public class Exception2 {

    public static void main(String[] args){
        try {
            show();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        new FileInputStream(new File(""));

        System.out.println("hh");
    }

    public static void show() throws GenderException{
        String gender = "123";

        if(gender.equals("man")){
            System.out.println("man");
        }
        else if(gender.equals("woman")){
            System.out.println("woman");
        }
        else{
            throw new GenderException("gender is wrong");
        }

    }

    public static void test1() throws Exception{
        System.out.println(1 / 0);
    }
    public static void test2() throws Exception{
        test1();
        System.out.println(100 / 0);
    }
    public static void test3() throws Exception{
        test2();
//        System.out.println(1 / 0);
    }
    public static void test4() throws Exception{
        test3();
//        System.out.println(1 / 0);
    }

}
