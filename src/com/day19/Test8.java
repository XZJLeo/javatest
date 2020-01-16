package com.day19;

import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args)throws Exception {
        PrintStream ps = new PrintStream("D:\\aaa\\ps.txt");
        System.out.println("请输入字符串，打印在ps.txt文件下");
        Scanner in=new Scanner(System.in);
        String str=in.next();
        System.setOut(ps);
        System.out.println(str);
        ps.close();
    }
}
