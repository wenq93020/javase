/*
*static
*   修饰成员变量的时候 表示静态成员变量或者类变量
*       普通变量在使用的时候必须要通过对象来进行调用
*       静态变量可以使用对象调用 也可以直接使用类进行调用
*   修饰方法的时候 表示静态方法或者类方法
*       普通方法在使用的时候必须要通过对象进行调用
*       静态方法可以使用对象调用 也可以使用类进行调用
*   注意
*       1、静态变量在创建对象之前被初始化 或者说在类被载入之前初始化
*       2、静态变量被所有的对象共享 属于公共变量 对象和类都可以直接调用 推荐使用类调用
*       3、成员变量放在堆中 而静态变量放在方法区中的静态区
*       4、静态变量不能定义在静态和普通方法中
*       5、静态方法可以在非静态方法中调用
*       6、静态方法中不能直接调用非静态方法
*       7、静态方法中不允许出现this调用
*       8、一般工具类中的方法定义为static
*/

public class StaticDemo {

    String name = "张三";
    static int age = 10;

    public static void test(){
        // static int a = 10;
//        System.out.println("non-Static");
//        test2();
//        new StaticDemo().test2();
    }

    public void test2(){
//        test();
        System.out.println("non-Static");
    }

    public static void main(String[] args) {
//        StaticDemo staticDemo = new StaticDemo();
        // 使用对象进行调用
//        System.out.println(staticDemo.name);
//        System.out.println(staticDemo.age);// 10
//
//        staticDemo.age = 20;
//        System.out.println(staticDemo.age);// 20
//        System.out.println(StaticDemo.age);// 20
//
//        StaticDemo staticDemo1 = new StaticDemo();
//        System.out.println(staticDemo1.age);// 20

        // 使用类名调用
        //System.out.println(StaticDemo.name);
        //System.out.println(StaticDemo.age);

        StaticDemo sd = new StaticDemo();
        sd.test();
        StaticDemo.test();
        sd.test2();
    }

}
