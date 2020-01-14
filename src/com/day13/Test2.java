package com.day13;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test2 {
    public static void main(String[] args) {
        LinkedHashSet<String>list=new LinkedHashSet<>();
        list.add("王昭君");
        list.add("王昭君");
        list.add("西施");
        list.add("杨玉环");
        list.add("貂蝉");
        System.out.println("迭代器：");
        Iterator <String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("加强for循环：");
        for(String string:list){
            System.out.println(string);
        }
    }
}
