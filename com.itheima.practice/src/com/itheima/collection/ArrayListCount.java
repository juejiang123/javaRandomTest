package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 定义方法listTest()统计集合中指定元素出现的次数
 */

public class ArrayListCount {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("e");
        System.out.println("a:"+listTest(list,"a"));
        System.out.println("b:"+listTest(list,"b"));
        System.out.println("c:"+listTest(list,"c"));
        System.out.println("d:"+listTest(list,"d"));

    }


    public static int listTest(Collection<String> list,String s){
        int count =0;
        for(String str :list){
            if(s.equals(str)){
                count++;
            }
        }
        return count;

    }

}
