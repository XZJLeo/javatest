package com.day4.day4_2;

public class Test6 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3, 2, 1};
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]是否对称：" + pan(arr));
        System.out.println();
    }

    public static boolean pan(int arr1[]) {
        int j = 1;
        for (int i = 0; i < arr1.length / 2; i++) {
            if (arr1[i] != arr1[arr1.length - 1 - i]) {
                j = 0;
            }
        }
        return (j == 1);
    }
}
