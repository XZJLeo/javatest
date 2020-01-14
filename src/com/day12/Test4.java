package com.day12;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("令狐冲", 25, 1.7d));
        list.add(new Person("张三丰", 20, 1.8d));
        list.add(new Person("奥巴马", 21, 1.65d));
        list.add(new Person("张无忌", 25, 1.73d));
        list.add(new Person("杨过", 19, 1.75d));
        Iterator<Person> It = list.iterator();

        Double max = 0d;
        Double min = list.get(0).getScore();
        ArrayList<Person> list1 = new ArrayList<>();
        int j = 0, i = 0, k = 0;
        while (It.hasNext()) {
            list1.add(It.next());
            if (max < list1.get(j).getScore()) {
                max = list1.get(j).getScore();
                i = j;
            }
            if (min > list1.get(j).getScore()) {
                min = list1.get(j).getScore();
                k = j;
            }
            j++;
        }
        System.out.println(" 最高的人是：" + list1.get(i).getName() + " 身高：" + max + "\n 最矮的人是：" + list1.get(k).getName() + " 身高：" + min);
    }
}

class Person {
    private String name;
    private int age;
    private Double score;

    public Person() {
    }

    public Person(String name, int age, Double score) {
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