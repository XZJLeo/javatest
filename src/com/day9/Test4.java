package com.day9;

public class Test4 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("马云", 45);
        SportTeacher t2 = new SportTeacher("大姚", 35);
        Student t3 = new Student("小王", 20);
        SportStudent t4 = new SportStudent("王中王", 21);
//goToSport(t1);  类型不对无法调用
        goToSport(t2);
//goToSport(t3);  类型不对无法调用
        goToSport(t4);

    }

    public static void goToSport(Sport x) {
        x.playBasketball();

    }

}

abstract class Person {
    String name;
    int age;

    public abstract void eat();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

interface Sport {
    public void playBasketball();
}

class Teacher extends Person {
    @Override
    public void eat() {
        System.out.print("年龄为" + age + " 岁 " + name + " 的老师在吃饭");
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
}

class SportTeacher extends Teacher implements Sport {
    public void playBasketball() {
        System.out.println("年龄为" + age + "岁 " + name + " 的老师在打篮球");
    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }

}

class Student extends Person {
    @Override
    public void eat() {
        System.out.println("年龄为" + age + "岁 " + name + " 的学生在吃饭");
    }

    public Student(String name, int age) {
        super(name, age);
    }
}

class SportStudent extends Student implements Sport {
    public void playBasketball() {
        System.out.println("年龄为" + age + "岁 " + name + " 的学生在打篮球");
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }

}