package com.day17;

public class Test11 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int  sum (int s){
        if(s==0){
            return 1;
        }
        return s*sum(--s);
    }
}
