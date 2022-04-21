package com.sabbathstudio;

/**
 * 实现静态内部类的定义和使用
 */
public class StaticOuter {

    private int cnt = 1;
    private  static int snt = 2;

    public void show(){
        System.out.println("外部类的show方法");
    }

    public static class StaticInner{
        private int ia = 3;
        private static int snt = 4;

        public StaticInner(){
            System.out.println("静态内部类的构造方法");
        }

        public void show(){
            System.out.println("ia = " + ia);
            System.out.println("外部类中的snt = " + snt);
//            System.out.println("外部类的cnt = " + cnt);
        }

        public void show2(int snt){
            System.out.println("snt = " + snt);
            System.out.println("内部类的成员snt = " + StaticInner.snt);
            System.out.println("外部类的成员snt = " + StaticOuter.snt);
//            StaticOuter.show();
            new StaticOuter().show();

        }


    }

}
