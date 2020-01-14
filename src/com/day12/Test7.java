package com.day12;

import java.util.ArrayList;
import java.util.Iterator;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Person_1> list = new ArrayList<>();
        list.add(new Person_1("令狐冲", 25, 1.7d));
        list.add(new Person_1("张三丰", 20, 1.8d));
        list.add(new Person_1("奥巴马", 21, 1.65d));
        list.add(new Person_1("张无忌", 25, 1.73d));
        list.add(new Person_1("杨过", 19, 1.75d));
        Iterator<Person_1> iterator = list.iterator();
        ArrayList<Person_1> list1 = new ArrayList<>();
        int i = 0;
        while (iterator.hasNext()) {
            list1.add(iterator.next());
            list1.get(i).setAge(list1.get(i).getAge() + 2);
            i++;
        }

        for (Person_1 person_1 : list1) {
            System.out.println(person_1);
        }

    }
}

class Person_1 {
    private String name;
    private int age;
    private Double score;

    public Person_1() {

    }

    public Person_1(String name, int age, Double score) {
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

    @Override
    public String toString() {
        return "Person_1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}