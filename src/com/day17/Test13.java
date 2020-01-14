package com.day17;

import java.io.File;

public class Test13 {
    public static void main(String[] args) {
        File file = new File("D:\\ccc");
        Kolb(file);
    }

    public static void Kolb(File files) {

        File file1[] = files.listFiles();
        for (File file2 : file1) {
            if (file2.isDirectory()) {
                Kolb(file2);
            } else {
                System.out.println(file2.getAbsolutePath());
            }
        }
    }
}
