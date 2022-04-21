package com.sabbathstudio;

public interface InterfaceTest {
    public static final int CNT = 1;// 里面只能有常量
//    private void show(){} // 从jdk1.9开始允许接口中出现私有方法
    public abstract void show();// 里面只能有抽象方法(新特性除外)


}
