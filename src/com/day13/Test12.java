package com.day13;

import java.util.HashSet;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0,i=0;
        HashSet<Integer>hashSet=new HashSet<>();
        while ( true){
            int a=in.nextInt();
            if(a==-1){
                break;
            }else {
                hashSet.add(a);
            }
        }
        for(Integer d:hashSet)
        {
            sum+=d;
        }
        System.out.println("总和："+sum+"\n"+"平均值："+sum/hashSet.size());
    }
}
