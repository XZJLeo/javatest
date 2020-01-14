package com.day2;

public class Test7 {
    public static void main(String[] args) {
        int x=50;
        int y=20;
        add(x,y);
        sub(x,y);
        mul(x,y);
        div(x,y);
        remain(x,y);
    }
    public static void add(int a,int b){
        System.out.println("x,y的和为："+(a+b));
    }
    public static void sub(int a,int b){
        System.out.println("x,y的差为："+(a-b));
    }
    public static void mul(int a,int b){
        System.out.println("x,y的积为："+(a*b));
    }
    public static void div(int a,int b){

        System.out.println("x,y的商数为："+(a/b));
    }
    public static void remain(int a,int b){

        System.out.println("x,y的余数为："+(a%b));
    }
}
