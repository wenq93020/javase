/*
* this: 表示当前对象的指针
*   指向当前对象 表示当前对象的引用
*   用处
*       1、构造方法 当构造方法中的参数名称跟类的成员变量名称一样的时候 可以使用this代表当前对象
*           注意: 有了this后 可以讲构造方法的参数跟成员变量保持一致
*           当构造方法中需要调用其他的构造方法时 可以使用this(name)调用其他构造方法 但是必须位于方法体的第一行
*       2、普通方法中
*           当多个普通方法之间需要调用的时候 可以使用this来进行调用 指的是当前对象的其他方法
*       3、成员变量的使用
*           当方法中的参数名称跟成员变量一样的时候 使用this.表示的成员变量的值 而使用变量名称表示的是形参列表的值
*
*
*
*/

public class ThisDemo {

    String name;
    int age;

    public ThisDemo(){

    }

    public ThisDemo(String name){
        System.out.println("one");
        this.name = name;
    }

    public ThisDemo(String name,int age){
        this(name);
        System.out.println("two");
        this.age = age;
    }

    public void test1(){
        System.out.println("Test1");
        test2("hehe");
    }

    public void test2(String name){
        System.out.println("Test2");
        this.test1();
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo("张三",12);
        System.out.println(td.name);
        System.out.println(td.age);
        td.test2("李四");
    }

}
