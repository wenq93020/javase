package com.sabbathstudio;

public class Man implements Hunter{

    @Override
    public void hunt() {
        System.out.println("男人在打猎");
    }

    @Override
    public void run() {
        System.out.println("男人在奔跑");
    }

    public static void main(String[] args) {

        Hunter hunter = new Man();
        hunter.hunt();
        hunter.run();

    }

}
