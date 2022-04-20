package com.sabbathstudio.interfacedemo2;

public class Mouse implements Usb{
    @Override
    public void dataTransfer() {
        System.out.println("鼠标点击屏幕");
    }

    @Override
    public void play() {
        System.out.println("鼠标在自己玩");
    }
}
