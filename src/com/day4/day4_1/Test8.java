package com.day4.day4_1;

public class Test8 {
    public static void main(String[] args) {
        double w = 30.0;
        double h = 86.0;

        System.out.println("摄氏度为：" + w + "°" + "--" + "华氏度为：" + wh(w) + "°");
        System.out.println("华氏度为：" + h + "°" + "--" + "摄氏度为：" + hw(h) + "°");
    }

    public static double wh(double w1) {
        return 1.8 * w1 + 32;
    }

    public static double hw(double h1) {
        return (h1 - 32) / 1.8;
    }
}
