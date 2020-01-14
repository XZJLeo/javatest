package com.day4.day4_1;

public class Test2 {
    public static void main(String[] args) {
        int a = getSum(100);
        System.out.println("总和为：" + a);
    }

    public static int getSum(int num) {
        int sum = 0;
        int i;
        for (i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

}
