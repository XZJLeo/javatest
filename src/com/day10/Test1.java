package com.day10;

public class Test1 {
    public static void main(String[] args) {
        HandleAble handleAble = new HandleAble() {
            @Override
            public void HandleString(String num) {
                System.out.println("原数字：" + num);
                int t = num.indexOf(".");
                System.out.println("取整后：" + num.substring(0, t));
                int a = 4;    //取后四位
                if ((num.charAt(t + a + 1)) >= 53) {
                    char ch = (char) (num.charAt(t + a) + 1);
                    String num1 = num.replace(num.charAt(t + a), ch);
                    System.out.println("保留四位小数后：" + num1.substring(0, t + a + 1));
                } else {
                    System.out.println("保留四位小数后：" + num.substring(0, t + a + 1));
                }

            }
        };
        handleAble.HandleString("23.23456789");
    }
}

interface HandleAble {
    public void HandleString(String num);
}