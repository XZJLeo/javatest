package com.day3;

public class Test2 {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("1到100奇数和：" + sum);
    }
}
