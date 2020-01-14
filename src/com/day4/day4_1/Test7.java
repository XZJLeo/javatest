package com.day4.day4_1;

public class Test7 {
    public static void main(String[] args) {
        round(4.6);

    }

    public static void round(double num) {
        int a = (int) (num + 0.5);
        System.out.println(num + "->" + a);
    }
}
