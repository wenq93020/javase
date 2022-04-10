/*
* 构造方法
*   创建对象的时候默认会调用构造方法来创建对象 (在堆中开辟空间) 可以完成成员变量的某些初始化操作
*   构造方法的语法
*       方法名称: 构造方法的方法名必须跟类的名词保持一致
*       访问修饰符
*       形参: 可以用户自定义添加 跟方法的普通方法一样
*       方法体: 完成对象的初始化功能
*       返回值: 没有返回值
*   注意
*       1、创建完类之后 如果没有手动调用方法 会有一个默认的无参的构造方法
*       2、当用户自定义了构造方法之后 默认的无参构造方法就不能够使用了 必须要手动定义无参构造方法
*       3、同一个类中可以包含多个同名的构造方法
*   重载
*       在一个类中可以包含多个重名的方法 但是方法的参数列表不能相同
*           1、参数的个数不同
*           2、参数的类型不同
*           3、参数的顺序不同
*       注意
*           一般构造方法都会进行重载
*
*/

public class Teacher {

    String name;
    int age;

    // 构造方法
    public Teacher(String _name,int _age){
        System.out.println("new...");
        name = _name;
        age = _age;
    }

    public Teacher(){
        System.out.println("new...");
    }

    public void teach(){

        System.out.println("上课");

    }

    public void teach(int a){

    }

    public void teach(String a){

    }

    public void teach(String a,int b){

    }

    public void teach(int b,String a){

    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
//        teacher.name = "张三";
//        teacher.age = 35;
        Teacher teacher2 = new Teacher("张三",35);
        teacher.showInfo();
        teacher2.showInfo();
    }

}
