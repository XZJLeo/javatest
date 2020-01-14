package com.day17;

import java.io.File;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        File file = new File(str);
        System.out.println(calculate(file));

    }

    public static long calculate(File file) {
        long size=0;
        File[] file1 = file.listFiles();
        for (File f : file1) {
            if (f.isFile()) {
               size+=f.length();
            } else {
                size+=calculate(f);
            }
        }
        return size;
    }
}