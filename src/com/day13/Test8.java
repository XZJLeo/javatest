package com.day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Test8 {
    public static void main(String[] args) {
        HashSet<Student>list=new HashSet<>();
        list.add(new Student("刘德华",55,'男'));
        list.add(new Student("张的个",55,'男'));
        list.add(new Student("刘可靠",55,'男'));
        list.add(new Student("陈奕迅",55,'男'));
        list.add(new Student("周杰伦",55,'男'));
        list.add(new Student("刘德华",55,'男'));
        list.add(new Student("周杰伦",55,'男'));
        list.add(new Student("王昭君",55,'女'));
        list.add(new Student("胡歌",55,'男'));
        list.add(new Student("杨幂",55,'女'));

        Iterator<Student>iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
class Student{
    private String name;
    private int age;
    private char sex;

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name   +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                sex == student.sex &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}