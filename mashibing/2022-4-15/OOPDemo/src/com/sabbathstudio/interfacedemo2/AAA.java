package com.sabbathstudio.interfacedemo2;

public class AAA implements Usb {
    @Override
    public void dataTransfer() {
        System.out.println("AAA 进行数据传输");
    }

    @Override
    public void play() {

    }
}
