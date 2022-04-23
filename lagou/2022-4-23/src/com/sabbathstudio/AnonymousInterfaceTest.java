package com.sabbathstudio;

public class AnonymousInterfaceTest {

    public static void test(AnonymousInterface ai){

        ai.show();

    }

    public static void main(String[] args) {

        test(new AnonymousInterfaceImpl());

    }

}
