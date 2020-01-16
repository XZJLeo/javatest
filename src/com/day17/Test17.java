package com.day17;

import java.io.File;

public class Test17 {
    public static void main(String[] args) {
        File file = new File("D:\\ccc");
        Kolbs(0, file);
    }

    public static void Kolbs(int path, File files) {
        if (files.isDirectory()) {
            for (int i = 0; i < path; i++) {
                System.out.print("\t");
            }
            System.out.println(files.getName());
        }
        File file1[] = files.listFiles();
        for (File file2 : file1) {
            if (file2.isDirectory()) {
                Kolbs(path + 1, file2);
            } else {
                for (int i = 0; i < path; i++) {
                    System.out.print("\t");
                }
                System.out.println(file2.getName());
            }
        }
    }
}
