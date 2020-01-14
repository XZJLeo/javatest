package com.day4.day4_1;

public class Test3 {
    public static void main(String[] args) {
        int zc = getPerimeter(20, 8);
        int area = getArea(20, 8);
        System.out.println("长方形的周长为：" + zc);
        System.out.println("长方形的面积为：" + area);

    }

    public static int getPerimeter(int length, int width) {
        return (length + width) * 2;
    }

    public static int getArea(int length, int width) {
        return length * width;
    }
}
