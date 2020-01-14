package com.day17;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        File file = new File("D:\\a.txt");
        File file1 = new File("D:\\aaa");
        if (file.isFile()) {
            System.out.println(file.getName() + "是个文件");
        } else {
            System.out.println(file.getName() + "不是个文件");

        }
        if (file1.isDirectory()) {
            System.out.println(file1.getName() + "是个文件夹");
        } else {
            System.out.println(file1.getName() + "不是个文件夹");

        }


    }
}
