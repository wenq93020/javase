package com.sabbathstudio;
/*
* 方法参数的值是否改变
*   方法中的参数列表叫做形式参数 没有具体的值 只是为了方便在方法中使用
*   调用方法的时候实际传入的值叫实际参数 代表具体的值 用来替换在方法中代码逻辑的值进行运算
*   注意
*       1、形式参数的变量名称也是局部变量
*       2、当方法的参数值是基本数据类型的时候 不会改变原来的值
*       3、当方法的参数值是引用类型的时候 如果改变了该引用类型的值 会改变原来对象的值
*   Java中的参数传递是值传递
*/
public class ArgumentDemo {

    public static void test(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void test2(Point p){
        int temp = p.getY();
        p.setY(p.getX());
        p.setX(temp);
    }

    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        test(a,b);
//        System.out.println(a);
//        System.out.println(b);
        Point point = new Point(2,3);
        test2(point);
        System.out.println(point.getX());
        System.out.println(point.getY());
    }

}
