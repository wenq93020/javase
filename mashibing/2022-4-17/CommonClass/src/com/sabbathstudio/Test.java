package com.sabbathstudio;

public class Test {
    Genders gender1 = Genders.女;
    Genders gender2 = Genders.男;

    public static void main(String[] args) {
        EventEnum ee = EventEnum.LAUNCH;
        ee.show();
        String name = EventEnum.PAGEVIEW.name();
        System.out.println(name);
    }
}
