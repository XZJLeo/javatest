
package com.day18;

import java.io.BufferedInputStream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Test6 {
    public static void main(String[] args) throws IOException {
        File file = getFile();
        File dest = new File("D:\\aaa");
        if (!dest.exists()) {
            dest.mkdirs();
        }
        copy(file, dest);
    }

    private static void copy(File file, File dest) throws IOException {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file2 : files) {
                //判断是否是文件   在判断段结尾是否是.java
                if (file2.isFile() && file2.getName().toLowerCase().endsWith(".java")) {
                    BufferedInputStream br = new BufferedInputStream(new FileInputStream(file2));
                    BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(new File(dest, file2.getName())));
                    byte[] by = new byte[1024];
                    int len = 0;
                    while ((len = br.read()) != -1) {
                        bw.write(by, 0, len);
                    }
                    br.close();
                    bw.close();
                } else if (file2.isDirectory()) {
                    copy(file2, dest);
                }
            }
        }
    }


    private static File getFile() {
        System.out.println("请输入一个文件夹路径");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        File file = new File(str);
        while (true) {
            if (!file.exists()) {
                System.out.println("你输入的文件夹路径不存在,请重新输入");
            } else if (file.isFile()) {
                System.out.println("你输入的是文件路径,请重新输入");
            } else {
                return file;
            }
        }
    }
}
