package com.day4.day4_2;

public class Test10 {
    public static void main(String[] args) {
        int array[] = {99, 100, 98, 97, 96};
        System.out.println("最终得分为：" + zvg(array));

    }

    public static int zvg(int arr[]) {
        int min = arr[0], max = arr[0], sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            sum += arr[i];
        }
        return (sum - (max + min)) / (arr.length - 2);
    }
}
