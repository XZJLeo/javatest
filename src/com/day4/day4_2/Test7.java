package com.day4.day4_2;

public class Test7 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        int array1[] = {1, 2, 3, 4, 7, 6};
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length - 1] + "]");
        System.out.println();

        System.out.print("[");
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ",");
        }
        System.out.print(array1[array1.length - 1] + "]");
        System.out.println();
        System.out.print("是否一致：" + equals(array, array1));

    }

    public static boolean equals(int arr[], int arr1[]) {
        int j = 1;
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr1[i]) {
                    j = 0;
                }
            }
            return (j == 1);
        } else {
            j = 0;
            return (j == 1);
        }

    }
}
