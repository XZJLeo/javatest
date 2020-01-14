package com.day4.day4_2;

public class Test9 {
    public static void main(String[] args) {
        String arr[] = {"黑桃", "红桃", "梅花", "方块"};
        String array[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(arr[i] + array[j] + " ");
            }
            System.out.println();
        }
    }
}
