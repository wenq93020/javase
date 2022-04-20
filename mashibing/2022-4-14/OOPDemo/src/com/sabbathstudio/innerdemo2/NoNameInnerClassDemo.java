package com.sabbathstudio.innerdemo2;

public class NoNameInnerClassDemo {

    public static void main(String[] args) {
        System.out.println("有一万行代码");
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        System.out.println("有一万行代码");
    }



}
class Runner implements Runnable{

    @Override
    public void run() {

    }
}