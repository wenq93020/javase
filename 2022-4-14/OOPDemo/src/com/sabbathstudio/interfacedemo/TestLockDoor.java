package com.sabbathstudio.interfacedemo;

/*
* Java中的继承关系是单继承 如果拥有多个父类的时候 可以考虑使用接口进行实现
*   java中的接口具备广泛的使用
*   用法
*       使用interface来修饰
*       接口中可以包含多个方法且方法跟抽象类中的抽象方法一致 可以不写实现 子类在实现的时候必须要实现接口中的所有方法
*       子类实现接口使用implements关键字
*   特征
*       1、接口中的所有方法都是抽象方法 不能包含方法的实现
*       2、接口中的所有方法的访问修饰权限都是public 不写也是public
*       3、接口不能被实例化
*       4、接口的子类必须实现接口中的所有方法 跟抽象类有所不同 抽象类中的抽象方法必须要被子类实现
*       5、子类可以实现过个接口
*       6、接口中的变量都是静态常量 如果变量没有static关键字修饰 它也表示静态常量
*       7、接口中的方法和常量都必须是public访问权限
*   接口的使用
*       1、接口代表一种能力 接口中可以定义n多个方法 子类在进行实现的时候 必须要实现这些方法 将这些方法进行实现就意味着具备了方法的能力
*       2、关系实现类有何能力 不关心实现的细节
*   抽象类和接口的区别
*       1、抽象类中的方法可以有抽象方法也可以有普通方法 但是接口中只能包含抽象方法
*       2、抽象类使用需要使用abstract关键字来修饰 而接口用interface来修饰
*       3、子类使用extends关键字来继承抽象类 私用implements来实现接口
*       4、子类继承抽象类的时候必须要实现所有的抽象方法 普通方法不用重写 而接口中的所有方法都必须实现
*       5、抽象类中可以定义成员变量 而接口找中只能定义静态常量
*       6、抽象类在子类实现的时候是单继承 而接口是多继承
*       7、抽象类和接口都不能实例化 但是抽象类中可以有构造方法 而接口中不能有构造方法
*       8、抽象类中可以实现接口并且不实现接口中的方法 接口只能继承接口不能实现接口
*   注意
*       在实际的项目开发过程中 如果可以使用接口尽量使用接口 将单继承的父类留在最关键的地方
*
*
*/

public class TestLockDoor {

    public static void main(String[] args) {
        LockDoor ld = new LockDoor();

        ld.openDoor();
        ld.openLock();
        ld.closeDoor();
        ld.closeLock();
        ld.photo();

        System.out.println(LockDoor.a);

    }

}
