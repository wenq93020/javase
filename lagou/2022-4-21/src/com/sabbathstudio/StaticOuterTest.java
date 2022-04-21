package com.sabbathstudio;

public class StaticOuterTest {

    public static void main(String[] args) {
//        StaticOuter outer = new StaticOuter();
        StaticOuter.StaticInner inner = new StaticOuter.StaticInner();
//        inner.show();
        inner.show2(5);
    }

}
