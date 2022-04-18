package com.sabbathstudio;

import java.util.Vector;

/*
* 1、Vector也是List接口的一个子类实现
* 2、Vector跟ArrayList一样 底层都是数组实现的
* 3、区别
*   1、ArrayList是线程不安全的 效率高 Vector是线程安全的 效率较低
*   2、ArrayList在进行扩容操作的时候 是扩容1.5倍 Vector在进行扩容操作的时候 扩容原来的2倍
*
*/

public class VectorDemo {

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(2);
        vector.add("abc");
        System.out.println(vector);
    }

}
