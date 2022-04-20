/**
 *所有类定义的时候可以添加属性和方法 但是不是必须的
 *  一个java文件中可以定义N多个class 但是只能有一个public class并且class名称要和文件名一致
 *
 *属性
 *   语法
 *       [访问修饰符]   数据类型    属性名称 = 值;
 *
 *  注意
 *      定义属性的时候可以没有访问修饰符和默认值
 *      必须要有数据类型和属性名称
 *
 * 方法: 表示行为
 *  语法
 *      [访问修饰符] 返回值类型(任何类型) 方法名称(形参列表){
 *          逻辑代码
 *      }
 *  注意
 *      1、方法的访问修饰可以不写
 *      2、方法可以有返回值也可以没有 void表示没有返回值
 *      3、形参列表可以有也可以没有
 *      4、Java中方法的传参都是值传递
 *
 *  对象的创建和使用
 *      1、使用new关键字来创建对象
 *          ClassName objectName = new ClassName();
 *      2、对象的使用
 *          使用对象的时候看通过 对象名称.属性 或者 对象名称.方法 来访问对象的属性和方法
*/

public class Student {

    int studentNumber;
    String name;
    int age = 20;

    //方法的定义
    void study(){
        System.out.println("我正在学习");
    }

    void eat(String foodName){
        System.out.println("我在吃" + foodName);
    }

    public static void main(String[] args) {
        // 创建对象
        Student student = new Student();
        // 使用属性
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.studentNumber);
        // 修改属性值 给属性赋值
        student.name = "张三";
        student.age = 40;
        student.studentNumber = 1273917;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.studentNumber);
        // 调用方法
        student.study();
        student.eat("apple");
    }
}


