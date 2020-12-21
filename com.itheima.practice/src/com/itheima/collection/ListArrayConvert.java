package com.itheima.collection;

import java.util.ArrayList;

/**
 * 把集合转成存有相同元素的数组，并将结果输出在控制台（可以使用Object【】数组类型接收转换的数组）
 */
public class ListArrayConvert {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(11);
        arrayList.add(21);
        arrayList.add(11);
        Object[] list = arrayList.toArray();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

