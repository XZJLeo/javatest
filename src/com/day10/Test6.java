package com.day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Student student1 = new Student("李连杰", 38, 85);
        Student student2 = new Student("张鑫贤", 17, 50);
        Student student3 = new Student("张晓峰", 16, 89);
        Student student4 = new Student("陈奕迅", 30, 81);
        Student student5 = new Student("龙戈尔", 30, 65);
        Student student6 = new Student("张家广", 40, 88);
        Student student7 = new Student("张三分", 16, 30);
        Student student8 = new Student("张胡歌", 16, 84);
        Student student9 = new Student("赵云", 68, 80);
        Student student10 = new Student("孙悟空", 30, 90);

        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list1.add(student4);
        list1.add(student5);
        list2.add(student6);
        list2.add(student7);
        list2.add(student8);
        list2.add(student9);
        list2.add(student10);

        Stream<Student> arrlist = Stream.concat(list1.stream(), list2.stream());
        Stream<Student> arrlist1 = Stream.concat(list1.stream(), list2.stream());
        Stream<Student> arrlist3 = Stream.concat(list1.stream(), list2.stream());
        List<Student> studentList = arrlist.filter(student -> {
            return student.getName().startsWith("张");
        }).collect(Collectors.toList());

        for (Student stu : studentList) {
            System.out.println("姓名：" + stu.getName() + " 年龄：" + stu.getAge() + " 成绩：" + stu.getScore());
        }

        System.out.println("======================================");

        arrlist1.sorted(Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getScore)).forEach(stu -> {
            System.out.println("姓名：" + stu.getName() + " 年龄：" + stu.getAge() + " 成绩：" + stu.getScore()
            );
        });
        System.out.println("======================================");

        Stream<Student> arrliat4 = arrlist3.filter(student -> {
            return student.getName().startsWith("张") && student.getAge() < 18;
        });
        arrliat4.limit(3).forEach(stu -> {
            System.out.println("姓名：" + stu.getName() + " 年龄：" + stu.getAge() + " 成绩：" + stu.getScore());
        });
    }
}

class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}