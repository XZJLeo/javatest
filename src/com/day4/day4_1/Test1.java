package com.day4.day4_1;

public class Test1 {
    public static void main(String[] args) {
        printEven(20);
    }

    public static void printEven(int d) {
        for (int i = 1; i <= d; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
