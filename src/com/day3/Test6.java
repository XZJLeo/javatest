package com.day3;

public class Test6 {
    public static void main(String[] args) {
        int b, c;
        int i;
        for (i = 100; i <= 999; i++) {
            int a = i / 100;
            b = (i % 100) / 10;
            c = i % 10;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println(i);
            }
        }
    }
}
