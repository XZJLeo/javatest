package com.day6;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        Student s = new Student("it001", "黄渤", 1.72);
        Student s1 = new Student("it002", "孙红雷", 1.78);
        Student s2 = new Student("it003", "章子怡", 1.65);
        Student s3 = new Student("it004", "杨幂", 1.64);
        ArrayList<Student> str = new ArrayList<>();
        str.add(s);
        str.add(s1);
        str.add(s2);
        str.add(s3);
        System.out.println("集合大小：" + str.size());
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i).getId() + "," + str.get(i).getName() + "," + str.get(i).getHeight());
        }
        System.out.println("--------------------\n" + "身高1.70以上的学员：");
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).getHeight() > 1.70) {
                System.out.println(str.get(i).getId() + "," + str.get(i).getName() + "," + str.get(i).getHeight());
            }
        }

    }
}

class Student {
    private String id;
    private String name;
    private double height;

    public Student(String id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}