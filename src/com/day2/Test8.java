package com.day2;

public class Test8 {
    public static void main(String[] args) {

        char ch = 'J';
        ch = (char) (ch + 32);
        System.out.println(ch);
        char ch2 = 'a';
        ch2 -= 32;
        System.out.println(ch2);

        double d3;
        int i3;
        d3 = 2.56;
        i3 = 10;
        double sum3 = d3 + i3;
        System.out.println("sum3的值：" + sum3);
        System.out.println("sum3的整数部分：" + (int) sum3);

        double d4;
        int i4;
        d4 = 5.26;
        i4 = 5;

        int mnl4 = (int) d4 * i4;
        System.out.println("mnl4的整数部分：" + mnl4);

    }
}
