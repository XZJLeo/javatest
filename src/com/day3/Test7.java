package com.day3;

public class Test7 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 60; i++) {

            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
