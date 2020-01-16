package com.day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test7 {
    public static void main(String[] args) throws  Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\aaa\\as.txt"));
      Student stu= (Student) ois.readObject();

        System.out.println(stu);
        ois.close();
    }

}
