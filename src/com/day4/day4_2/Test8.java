package com.day4.day4_2;

public class Test8 {
    public static void main(String[] args) {
        char arr[] = {'A', 'D', 'B', 'C', 'D'};
        char xm[] = {'D', 'C', 'B', 'A', 'D'};
        char xr[] = {'A', 'D', 'B', 'C', 'D'};
        char xh[] = {'A', 'D', 'B', 'C', 'A'};
        char xq[] = {'A', 'B', 'C', 'D', 'D'};
        System.out.println("满分为10分，小明得分：" + equals(xm, arr) + "分");
        System.out.println("满分为10分，小红得分：" + equals(xr, arr) + "分");
        System.out.println("满分为10分，小黄得分：" + equals(xh, arr) + "分");
        System.out.println("满分为10分，小强得分：" + equals(xq, arr) + "分");
    }

    public static int equals(char array[], char zry[]) {
        int num = 0;
        for (int i = 0; i < zry.length; i++) {
            if (array[i] == zry[i]) {
                num += 2;
            }
        }
        return num;
    }
}
