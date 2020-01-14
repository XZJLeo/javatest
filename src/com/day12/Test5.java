package com.day12;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("a");
        System.out.println("集合中a有"+frequency(list,"a")+"个");
    }

    public static int frequency(ArrayList<String> list, String str) {
        int i = 0;
        for (String string : list) {
            if (string == str) {
                i++;
            }
        }
        return i;
    }
}
