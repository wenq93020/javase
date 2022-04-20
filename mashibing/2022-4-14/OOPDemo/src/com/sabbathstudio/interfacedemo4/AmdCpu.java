package com.sabbathstudio.interfacedemo4;

public class AmdCpu implements CPU{

    public AmdCpu(){

    }

    @Override
    public String getBrand() {
        return "AMD";
    }

    @Override
    public String getHZ() {
        return "4.13GHz";
    }
}
