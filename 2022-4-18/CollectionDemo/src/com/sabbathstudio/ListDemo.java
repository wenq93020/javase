package com.sabbathstudio;

import java.util.ArrayList;
import java.util.List;

/*
* java集合框架
*   List: 存放的是单一值
*       特点
*           1、可以存放不同类型的数据 而数组只能存放固定的类型
*           2、当使用ArrayList子类实现的时候 初始化的长度为0 当长度不够的时候会自动进行扩容操作
*       API方法
*           增加数据的方法
*               add: 要求必须传入Object对象 因此当写入基本数据类型的时候 包含自动装箱和自动拆箱的过程
*               addAll: 添加另一个集合的元素到此集合中
*           删除数据的方法
*               clear: 只是清空集合中的元素 此对象并不会被回收
*               remove: 删除指定元素
*               removeAll: 删除集合元素
*           查询数据的方法
*               contains: 判断集合中是否包含指定的值
*               containsAll: 判断此集合中是否包含另一个集合
*               isEmpty: 判断集合是否为空
*               retainAll: 如果集合中拥有另一个集合的所有元素返回true 否则返回false
*               size: 返回当前集合的大小
*           集合转数组的方法
*               toArray: 将集合转换成数组
*
*
*/

public class ListDemo {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add(1.213);
        list.add(true);
        list.add("a");

        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.indexOf("a"));
        System.out.println(list.lastIndexOf("a"));
        list.set(0,"Derktion");
        System.out.println(list);
        List list1 = list.subList(0,2);
        System.out.println(list1);
        List of = List.of(1,2,3,4);
        System.out.println(of);


    }

}
