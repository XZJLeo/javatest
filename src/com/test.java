package com;

import java.io.File;
import java.util.concurrent.locks.ReentrantLock;

public class test {
    public static void main(String[] args) {
        File f=new File("D:\\学习");

        File file[]=f.listFiles();
        for (File f1:file){
            System.out.println("1:"+f1.getAbsolutePath());
            System.out.println(f1.length());
        }

    }
}

