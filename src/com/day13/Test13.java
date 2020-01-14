package com.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list, "a", "b", "a", "c", "d");
        Collections.addAll(list1, "e", "f", "a", "d", "g");
        list.addAll(list1);
        HashSet<String> hashSet = new HashSet<>();
        for (String string : list) {
            hashSet.add(string);
        }
        System.out.println(hashSet);
    }
}
