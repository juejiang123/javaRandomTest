package com.itheima.collection;

import java.util.ArrayList;

/**
 * 定义一个方法listTest(Arraylist<String> al,String s),要求使用contains（）方法判断
 * al集合里面是否包含s.
 */
public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("you");
        arrayList.add("are");
        arrayList.add("mine");
        String a = "are";
        Boolean b = listTest(arrayList, a);
        System.out.println(b);
    }

    public static Boolean listTest(ArrayList<String> arr,String a){
        if(arr.contains(a)){
            return true;
        }
        return false;
    }
}
