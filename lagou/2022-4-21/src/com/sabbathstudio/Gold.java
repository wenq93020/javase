package com.sabbathstudio;

public class Gold implements Metal,Money{

    @Override
    public void shine() {
        System.out.println("发出了金黄色的光芒");
    }

    @Override
    public void shopping() {
        System.out.println("买了很多电脑");
    }

    public static void main(String[] args) {
        // 1.声明接口类型的引用指向实现类的对象，形成多态
        Metal mt = new Gold();
        mt.shine();

        Money my = new Gold();
        my.shopping();

    }

}
