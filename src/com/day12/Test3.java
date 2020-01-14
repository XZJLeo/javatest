package com.day12;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("令狐冲", 25, 95d));
        list.add(new Student("张三丰", 20, 90d));
        list.add(new Student("奥巴马", 21, 80d));
        list.add(new Student("张无忌", 252, 84d));
        list.add(new Student("杨过", 19, 89d));
        Iterator<Student> It = list.iterator();
        Double sum = 0d;
        Double max = 0d;
        Double min = list.get(0).getScore();
        ArrayList<Student> list1 = new ArrayList<>();
        int i = 0;
        while (It.hasNext()) {
            list1.add(It.next());
            sum += list1.get(i).getScore();
            if (max < list1.get(i).getScore()) {
                max = list1.get(i).getScore();
            }
            if (min > list1.get(i).getScore()) {
                min = list1.get(i).getScore();
            }
            i++;
        }
        System.out.println("平均分：" + (sum / i));
        System.out.println("总分：" + sum + " 最高分：" + max + " 最低分：" + min);
    }
}

class Student {
    private String name;
    private int age;
    private Double score;

    public Student() {
    }

    public Student(String name, int age, Double score) {
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}