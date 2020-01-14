package com.day8;

public class Test1 {
    public static void main(String[] args) {
        Coder coder = new Coder();
        Teacher teacher = new Teacher();
coder.name="马云";
coder.age=55;
coder.eat();
coder.sleep();
coder.st();
        System.out.println("------------");
teacher.name="马华腾";
teacher.age=50;
teacher.eat();
teacher.sleep();
teacher.weekclass();
    }
}

class Person {
    String name;
    int age;

    public void eat() {
        System.out.println(name + "吃饭");
    }

    public void sleep() {
        System.out.println(name + "睡觉");
    }
}

class Coder extends Person {
    public void st() {
        System.out.println(name + "敲代码");
    }
}

class Teacher extends Person {
    public void weekclass() {
        System.out.println(name + "上课");
    }
}