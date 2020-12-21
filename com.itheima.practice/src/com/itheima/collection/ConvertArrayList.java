package com.itheima.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个方法，要求此方法把int数组转成存有相同元素的集合（集合里面的元素是Integer）并返回
 */
public class ConvertArrayList {
    public static void main(String[] args) {
//        int[] i = new int[6];
        int[] array = {11,2,23,11};
        ArrayList<Integer> list = listTest(array);
        System.out.println(list);

    }
    public static ArrayList<Integer> listTest(int[] list){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<list.length;i++){
            arrayList.add(list[i]);
        }
        return arrayList;

    }
}
