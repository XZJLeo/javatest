package com.day8;

public class Test2 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.name="旺财";
        dog.eat();
        dog.see();
        System.out.println("-----------");
        cat.name="波斯猫";
        cat.eat();
        cat.cch();
    }
}

class Animal {
    String name;
    String color;
    double poice;

    public void eat() {
        System.out.println(name + "在吃饭");
    }
}
    class Dog extends Animal {
        public void see() {
            System.out.println(name + "在看家");
        }
    }

    class Cat extends Animal{
        public void cch() {
            System.out.println(name + "在抓老鼠");
        }
    }
