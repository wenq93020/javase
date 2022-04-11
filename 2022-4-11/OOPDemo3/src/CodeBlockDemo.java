/*
*代码块: 使用{}括起来的一段代码
*   分类
*       1、普通代码块: 定义在方法中 使用{}括起来的代码叫普通代码块
*       2、构造代码块: 定义在类中 使用{}括起来的代码叫构造代码块
*           注意: 每次代码运行的时候会将构造代码块的代码添加到构造方法的前面
*               构造方法块中的代码会添加到每一个构造方法中 当使用this(参数)的时候 不会添加
*       3、静态代码块: 使用static{}括起来的时候叫做静态代码块 在程序载入的时候 优先执行
*           数据库连接等其他提前需要准备好的代码会放在static代码块
*       4、同步代码块:
*           在多线程的时候使用 用来给共享空间进行加锁操作
*       执行顺序
*           静态代码块 ---> 构造代码块(创建对象的时候才会使用) ---> 普通代码块
*
*
*/

public class CodeBlockDemo {

    int a;
    int b;

    static{
        System.out.println("静态代码块");
    }

    public CodeBlockDemo(){
        System.out.println("构造方法");
    }

    public CodeBlockDemo(int a){
        this.a = a;
    }

    public CodeBlockDemo(int a,int b){
        this.a = a;
        this.b = b;
    }

    {
        System.out.println("构造代码块");
    }

    public void test(){
        System.out.println("test");
        {
            System.out.println("我应该是什么分类");
        }
    }

    public static void main(String[] args) {
        CodeBlockDemo codeBlockDemo = new CodeBlockDemo(1,2);
        codeBlockDemo.test();
        {
            System.out.println("main");
        }

    }

}
