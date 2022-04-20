package com.sabbathstudio.interfacedemo2;

public class UPan implements Usb{
    @Override
    public void dataTransfer() {
        System.out.println("U盘可以传输数据");
    }

    @Override
    public void play() {

    }
}
