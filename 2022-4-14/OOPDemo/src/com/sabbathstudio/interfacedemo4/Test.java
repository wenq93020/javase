package com.sabbathstudio.interfacedemo4;

public class Test {

    public static void main(String[] args) {

        Computer computer = new Computer();
        CPU cpu = new AmdCpu();
        HardDisk hardDisk = new JSDHardDisk();
        computer.show(cpu,hardDisk);

    }

}
