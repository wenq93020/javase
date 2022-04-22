package com.sabbathstudio;

public class AreaOuter {

    private int cnt = 1;

    public void show(){

        int ic = 4;

        class AreaInner{

            private int ia = 2;

            public AreaInner(){
                System.out.println("局部内部类的构造方法");
            }

            public void test(){
                int ib = 3;
                System.out.println("ia = " + ia);
                System.out.println("cnt = " + cnt);
                System.out.println("ic = " + ic);
            }

        }

        AreaInner ai = new AreaInner();
        ai.test();

    }

}
