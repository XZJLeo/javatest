package com.day7;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String str = "[User{name=马云, age=56, money=2500.0}, User{name=马化腾, age=56, money=2400.0}, User{name=马赛克, age=56, money=2500.0}]";
        String str1 = str.substring(6, str.length() - 2);
        // System.out.println(str1);
        String str2 = str1.replace("}", "");
        String str3 = str2.replace("User{", "");
        String[] str4 = str3.split(",");
        String[] strs = new String[3];
        for (int i = 0,j=0; i < str4.length ; i = i + 3,j++) {
            String[] str5 = str4[i].split("=");
            strs[j] = str5[1];
        }
        for (int i = 0; i <strs.length ; i++) {
            list.add(strs[i]);
        }
        System.out.println("原来为："+str);
        System.out.println("截取后："+list);
    }
}
