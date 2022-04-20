package com.sabbathstudio.interfacedemo3;

public class Printer implements Paper,InkBox{
    @Override
    public void getWhiteAndBlock() {
        System.out.println("使用黑白墨盒打印");
    }

    @Override
    public void getColor() {
        System.out.println("使用彩色墨盒打印");
    }

    @Override
    public void getA4() {
        System.out.println("使用A4纸打印");
    }

    @Override
    public void getB5() {
        System.out.println("使用B5纸打印");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.getWhiteAndBlock();
        printer.getA4();
    }

}
