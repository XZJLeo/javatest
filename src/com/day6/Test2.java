package com.day6;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a=in.nextInt();
        System.out.println("请输入第一个数据：");
        int b=in.nextInt();
        System.out.println("请输入第一个数据：");
        int c=in.nextInt();
        int temp=a>b?a:b;
        int tep=temp>c?temp:c;
        System.out.println("三个数的最大值："+tep);
    }
}
