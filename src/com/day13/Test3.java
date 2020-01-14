package com.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,33,11,77,55);
        System.out.println("原数组："+list);
        Collections.sort(list);
        System.out.println("排序后："+list);
        Collections.shuffle(list);
        System.out.println("乱序后："+list);
        ArrayList<Integer> list1=new ArrayList<>();
        Collections.addAll(list1,33,11,77,55);
        Collections.reverse(list1);
        System.out.println("反转后：");
        for(Integer i:list1){
            System.out.println(i);
        }

    }
}
