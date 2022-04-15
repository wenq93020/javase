package com.sabbathstudio.interfacedemo4;

public class Computer {



    public void show(CPU cpu,HardDisk hardDisk){
        System.out.println("计算机的组成如下: ");
        System.out.println("CUP: " + cpu.getBrand() + " 主频是: " + cpu.getHZ());
        System.out.println("HardDisk的容量: " + hardDisk.getVolume());

    }

}
