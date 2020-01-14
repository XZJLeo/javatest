package com.day4.day4_1;

public class Test6 {
    public static void main(String[] args) {
        printX(10);
    }

    public static void printX(int x) {
        int i, j;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x; j++) {
                if (j == i) {
                    System.out.print("0");
                } else if (j == (x + 1 - i)) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
