package com.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test9 {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        HashSet<String>hashSet=new HashSet<>();
        Collections.addAll(hashSet,"abc","bad","abc","aab","bad","cef","jhi");
        ArrayList<String>list=new ArrayList<>();
        list.addAll(hashSet);
        System.out.println(list);
    }
}
