package com.sabbathstudio;

public class AnonymousInterfaceTest {

    public static void test(AnonymousInterface ai){

        ai.show();

    }

    public static void main(String[] args) {

        test(new AnonymousInterfaceImpl());

        System.out.println("--------------------");

//        AnonymousInterface ait = new AnonymousInterface() {
//            @Override
//            public void show() {
//                System.out.println("匿名内部类show");
//            }
//        };

        AnonymousInterface ait = () -> System.out.println("Lambda表达式show");

        test(ait);

    }

}
