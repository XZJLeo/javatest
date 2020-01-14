package com.day3;

public class Test5 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
