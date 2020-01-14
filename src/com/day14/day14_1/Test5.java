package com.day14.day14_1;

import java.util.HashMap;

public class Test5 {
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap=new HashMap<>();
        hashMap.put(1,"张三丰");
        hashMap.put(2,"周芷若");
        hashMap.put(3,"汪峰");
        hashMap.put(4,"灭绝师太");
        System.out.println(hashMap);
        hashMap.put(5,"李晓红");
        hashMap.remove(1);
        hashMap.put(2,"周林");
        System.out.println(hashMap);
    }
}
