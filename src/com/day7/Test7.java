package com.day7;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个qq号：");
        String str = in.next();
        checkQQ(str);

    }

    public static void checkQQ(String qq) {
        byte[] bit = qq.getBytes();
        int temp = 1;
        for (int i = 0; i < bit.length; i++) {
            if (bit[i] > 57 || bit[i] < 48) {
                temp = 0;
            }
        }
        System.out.println("这个qq号码是否正确：" + ((qq.length() <= 12 && qq.length() >= 5) && (qq.charAt(0) != '0') && (temp == 1)));
    }
}
