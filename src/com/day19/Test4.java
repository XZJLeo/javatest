package com.day19;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test4 {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\aaa\\b.txt"), "GBK");
        osw.write("我爱Java");
        osw.close();
    }
}
