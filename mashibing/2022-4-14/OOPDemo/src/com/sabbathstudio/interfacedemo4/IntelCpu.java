package com.sabbathstudio.interfacedemo4;

public class IntelCpu implements CPU{

    public IntelCpu(){

    }

    @Override
    public String getBrand() {
        return "Intel";
    }

    @Override
    public String getHZ() {
        return "3.65GHz";
    }
}
