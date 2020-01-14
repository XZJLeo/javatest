package com.day4.day4_2;

public class Test5 {
    public static void main(String[] args) {
        int arr[] = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};

        System.out.println("高于平均分" + getAvg(arr) + "的个数有" + getcount(getAvg(arr), arr) + "个");

    }

    public static int getAvg(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int getcount(int avg, int newarr[]) {
        int j = 0;
        for (int i = 0; i < newarr.length; i++) {
            if (newarr[i] > avg) {
                j++;
            }
        }
        return j;
    }
}
