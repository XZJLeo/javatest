package com.day19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) throws Exception{
        Student stu=new Student("张无忌",25,'男');
        Student stu1=new Student("张三丰",24,'男');
        Student stu2=new Student("张梅梅",27,'女');
        ArrayList<Student>list=new ArrayList<>();
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stus.txt"));

        oos.writeObject(list);
    }
}
