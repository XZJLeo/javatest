package com.day3;

public class Test3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("1到100之间即是3的倍数又是5的倍数的和：" + sum);
    }

}
