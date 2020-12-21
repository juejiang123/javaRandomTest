package com.itheima.collection;

import java.util.ArrayList;

/**
 * 定义一个方法listTest(ArrayList<Integer> al,Integer s),要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 */
public class ArrayListIndex {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(13);
        al.add(23);
        int i = listTest(al, 23);
        System.out.println(i);
    }

    public static int listTest(ArrayList<Integer> al,Integer s){
        for(int i=0;i<al.size();i++){
            if(s.equals(al.get(i))){
                return i;
            }
        }
        return -1;
    }
}
