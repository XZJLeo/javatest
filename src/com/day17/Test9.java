package com.day17;

import java.io.File;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        File file=new File(str);
        int num=0;
        if(file.isFile()){
            System.out.println("文件的大小是："+file.length());
        }else if(file.isDirectory()){
            File f[]=file.listFiles();
            for(File file1:f) {
                if (file1.isFile()){
                    num+=file1.length();
                }
            }
            System.out.println("文件夹中所有文件的长度是："+num);
        }
    }
}
