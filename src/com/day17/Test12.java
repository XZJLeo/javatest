package com.day17;

public class Test12 {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    public static int sum(int num){
        if(num==0){
            return 0;
        }
        return num+sum(--num);
    }
}
