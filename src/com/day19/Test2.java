package com.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Copy();
    }

    public static void Copy() throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\e.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\bbb\\e.txt"));
        int len;
        byte b[] = new byte[1024];
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        bos.close();
        bis.close();
    }
}
