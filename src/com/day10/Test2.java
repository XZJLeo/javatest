package com.day10;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        Students s1 = new Students("小红");
        Students s2 = new Students("小亮");
        Students s3 = new Students("小明");
        Teacher teacher = new Teacher("张老师");
        ArrayList<Students> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        teacher.dianname(list);
        Class_1 class_1 = new Class_1("java", teacher, list);

        class_1.show();
    }
}

class Students {
    private String name;
    private String arrive;

    public Students(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }
}

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dianname(ArrayList<Students> list) {
        for (int i = 0; i < list.size(); i++) {
            Students stu = list.get(i);
            if (stu.getName() == ("小明")) {
                stu.setArrive("false");
            }

        }
    }
}

class Class_1 {
    private String class_name;
    private Teacher teacher;
    private ArrayList<Students> list;

    public Class_1(String class_name, Teacher teacher, ArrayList<Students> list) {
        this.class_name = class_name;
        this.teacher = teacher;
        this.list = list;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Students> getList() {
        return list;
    }

    public void setList(ArrayList<Students> list) {
        this.list = list;
    }

    public void show() {
        System.out.println("课程名称：" + getClass_name());
        System.out.println("授课老师：" + teacher.getName());
        System.out.println("学生上课情况：");
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getArrive() != ("false")) {
                System.out.println("上课；" + list.get(i).getName());
            } else {
                System.out.println("旷课；" + list.get(i).getName());
            }

        }

    }

}