package com.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"a","f","b","c","a","b");
        HashSet<String>hashSet=new HashSet<>();
        hashSet.addAll(list);
        list.clear();
        list.addAll(hashSet);
        System.out.println(list);

    }
}
