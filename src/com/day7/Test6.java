package com.day7;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String strs=in.next();
      String str1  =strs.replace("奥巴马","*");
        System.out.println(str1);
    }
}
