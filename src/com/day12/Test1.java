package com.day12;

public class Test1 {
    public static void main(String[] args) {
        funtion(1);
        funtion("令狐冲");
    }

    public static <E> void funtion(E t) {
        System.out.println(t);
    }
}
