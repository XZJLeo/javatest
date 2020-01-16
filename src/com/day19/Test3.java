package com.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws Exception{
        Date();
        System.out.println();
        Scanner in=new Scanner(System.in);
        System.out.println("请输入验证码：");
        String str=in.next();
        Yanzhen(str);
    }

    public static void Date() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("请创建验证码");
        String str = in.next();
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\date.txt"));
        byte b[] = str.getBytes();
        bos.write(b);
        bos.close();
    }

    public static void Yanzhen(String str) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\date.txt"));
        byte b[] = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            String string = new String(b, 0, len);
            if (string.equals(str)){
                System.out.println("验证成功！");
            }else {
                System.out.println("验证失败！");
            }
        }
        bis.close();
    }
}
