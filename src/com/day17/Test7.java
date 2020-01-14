package com.day17;

import java.io.File;

public class Test7 {
    public static void main(String[] args) {
        File f = new File("D:\\学习");
        File file[] = f.listFiles();
        for (File f1 : file) {
            System.out.println(f1.getName());
           // System.out.println(f1.length());
        }
    }
}
