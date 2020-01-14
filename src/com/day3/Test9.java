package com.day3;

public class Test9 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 7; j++) {
                if (j == i) {
                    System.out.print("0");
                } else if (j == (8 - i)) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
