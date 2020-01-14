package com.day13;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        add("d","d","1","g","f");
    }
    public static void add(String...str){
        ArrayList <String>list=new ArrayList<>();
        for(String string:str){
            list.add(string);
        }
        for (String strs:list){
            System.out.println(strs);
        }
    }
}
