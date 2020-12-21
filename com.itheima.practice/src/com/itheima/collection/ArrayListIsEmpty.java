package com.itheima.collection;

import java.util.ArrayList;

/**
 * 定义一个方法listTest(ArrayList<String> al)，要求使用isEmpty()判断al里面是否有元素
 */
public class ArrayListIsEmpty {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Boolean aBoolean = listTest(arr);
        System.out.println(aBoolean);
    }
    public static Boolean listTest(ArrayList<String> al){
        if(al.isEmpty()){
            return true;
        }
        return false;
    }
}
