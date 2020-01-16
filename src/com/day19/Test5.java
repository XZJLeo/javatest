package com.day19;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test5 {
    public static void main(String[] args)throws Exception {
        InputStreamReader iso=new InputStreamReader(new FileInputStream("D:\\aaa\\b.txt"),"GBK");
        int len;
        char c[]=new char[1024];
        while ((len=iso.read(c))!=-1){
            System.out.println(new String (c,0,len));
        }
        iso.close();
    }
}
