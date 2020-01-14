package com.day17;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File("D:\\aaa\\b.txt");
        System.out.println("文件名：" + file.getName() + " ,文件大小：" + file.length() + " ,文件的绝对路径" + file.getAbsolutePath() + " ,文件的父路径" + file.getParentFile());
    }
}
