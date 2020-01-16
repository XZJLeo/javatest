package com.day19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test1 {
    public static void main(String[] args)throws Exception {
        Witer();
    }

    public static void Witer() throws Exception {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\e.txt"));
        String str = "i love java";
        byte b[] = str.getBytes();
        bos.write(b);
        bos.close();
    }
}
