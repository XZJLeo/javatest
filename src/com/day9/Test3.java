package com.day9;

public class Test3 {
    public static void main(String[] args) {
        Animal d = new Dog("狗");
        d.eat();
        Animal c = new Cat("猫");
        c.eat();
        if (d instanceof Dog) {
            Dog d1 = (Dog) d;
            d1.lookHome();
        } else if (d instanceof Cat) {
            Cat c1 = (Cat) d;
            c1.catchMouse();
        }

        if (c instanceof Cat) {
            Cat c1 = (Cat) c;
            c1.catchMouse();
        } else if (c instanceof Dog) {
            Dog d1 = (Dog) c;
            d1.lookHome();
        }

    }
}

abstract class Animal {
    private String name;
    private int weight;

    public abstract void eat();


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "吃鱼");
    }

    public void catchMouse() {
        System.out.println(getName() + "努力抓老鼠");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "啃骨头");
    }

    public void lookHome() {
        System.out.println(getName() + "老实看家");
    }
}