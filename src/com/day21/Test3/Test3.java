package com.day21.Test3;

import java.lang.reflect.Constructor;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.day21.Test3.Student");
        Student s = (Student) c.newInstance();
        Constructor<Student> stu=c.getDeclaredConstructor();
        Student student=stu.newInstance();
        System.out.println(s);
        System.out.println("-------------");
        System.out.println(student);
    }
}
