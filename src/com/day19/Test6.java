package com.day19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test6 {
    public static void main(String[] args)throws Exception {
        Student s = new Student("刘德华", 55, '男');
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:\\aaa\\as.txt"));
        oos.writeObject(s);
        oos.close();
    }
}

