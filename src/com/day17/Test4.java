package com.day17;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file=new File("D:\\a.txt");
        File file1=new File("D:\\ccc\\bbb\\aaa");
        file.delete();
        file1.delete();
    }
}
