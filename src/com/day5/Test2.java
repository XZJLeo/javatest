package com.day5;

public class Test2 {

    public static void main(String[] args) {
        dog d = new dog();
        d.setAge(12);
        d.setName("小黄");
        d.showMsg();
    }
}

class dog {
    private String name;
    private int age;

    public dog() {
    }

    public dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void showMsg() {
        System.out.println("狗的名称为：" + this.name + "，年龄为：" + this.age);
    }
}
