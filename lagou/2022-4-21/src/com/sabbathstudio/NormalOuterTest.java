package com.sabbathstudio;

public class NormalOuterTest {

    public static void main(String[] args) {

        NormalOuter normalOuter = new NormalOuter();
        NormalOuter.NormalInner normalInner = new NormalOuter().new NormalInner();
//        normalInner.show();
        normalInner.show2(5);

    }

}
