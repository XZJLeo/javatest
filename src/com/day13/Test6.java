package com.day13;

import java.util.Collections;
import java.util.HashSet;

public class Test6 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("二丫");
        hashSet.add("钱六");
        hashSet.add("孙七");
        hashSet.remove("二丫");
        hashSet.add("王小丫");
        System.out.println(hashSet);
    }
}
