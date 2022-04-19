package com.sabbathstudio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
* 1、Set中存放的是无序 && 唯一的数据
* 2、Set不可以通过下标获取对应位置的元素 因为Set无序的特点
*
*
*/

public class SetDemo {

    public static void main(String[] args) {
//        Set set = new HashSet();
//        set.add(134);
//        set.add("1234");
//        set.add(true);
//        System.out.println(set);
//        Iterator iterator = set.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        System.out.println("----------------------");
//
//        // 推荐使用
//        for (Iterator iter = set.iterator();iter.hasNext();) {
//            System.out.println(iter.next());
//        }

        TreeSet treeSet = new TreeSet();
        treeSet.add(42);
        treeSet.add(1);
        treeSet.add(432);
        System.out.println(treeSet);

    }

}
