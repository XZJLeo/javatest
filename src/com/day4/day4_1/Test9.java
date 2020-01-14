package com.day4.day4_1;

public class Test9 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "×" + i + "=" + j * i + "   ");
            }
            System.out.println();
        }
    }
}
