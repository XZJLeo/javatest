package com.day13;

import java.util.Iterator;
import java.util.LinkedList;

public class Test7 {
    public static void main(String[] args) {
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (String strings : strs) {
            int i = 0;
            for (String string1 : list) {
                if (strings.equals(string1)) {
                    i = 1;
                }
            }
            if (i == 0) {
                list.add(strings);
            }
        }
        //加强for循环；
        System.out.println("加强for循环:");
        for (String str1 : list)
            System.out.println(str1);
         //迭代器；
        System.out.println("迭代器:");
        Iterator<String>iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
