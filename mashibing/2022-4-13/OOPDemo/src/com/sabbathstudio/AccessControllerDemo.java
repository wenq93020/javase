package com.sabbathstudio;
/*
* 在java中明确定义了访问权限
*   限制访问
*   public: 共用权限
*       当前项目中所以的类都可以进行访问
*   protected: 保护权限
*       可以被当前类访问
*       可以被当前包访问
*       可以被子类访问
*   default: 默认默认
*       可以被当前类访问
*       可以被当前包访问
*   private: 私有权限
*       可以被当前类访问
*   注意
*       四种访问修饰符可以修饰属性和方法
*       类的访问修饰符只有两个public default
*
*/
public class AccessControllerDemo {

    public AccessControllerDemo(){

    }

    // 单例设计模式
    private AccessControllerDemo(int a,int b){

    }

    private String str = "test";


}

class Test{

}
