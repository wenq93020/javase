package com.sabbathstudio;

/*
*linkedList拥有更丰富的方法实现
*
*/

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(123);
        list.add(false);
        list.add("abc");
        System.out.println(list);
        list.add(2,"sabbath studio");
        System.out.println(list);
        list.addFirst("111111");
        System.out.println(list);
        list.addLast("222222");
        System.out.println(list);
        System.out.println(list.element());
        list.offer("333333");
        System.out.println(list);
        System.out.println(list.peek());

    }

}
