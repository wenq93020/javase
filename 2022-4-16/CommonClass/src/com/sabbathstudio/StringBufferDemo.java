package com.sabbathstudio;

/*
* 可变字符串
*   StringBuffer: 线程安全 效率低
*   StringBuilder: 线程不安全 效率高
*
*/

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(1).append(1.123).append("abc").append(true);
        System.out.println(buffer);
        System.out.println(buffer.length());
        System.out.println(buffer.capacity());

        StringBuilder builder = new StringBuilder();
        builder.append("123").append(1).append(false);
        System.out.println(builder);

    }

}
