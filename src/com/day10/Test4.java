package com.day10;

import java.applet.Applet;

public class Test4 {
    public static void main(String[] args) {
        Apple apple1 = new Apple(5, "青色");
        Apple apple2 = new Apple(3, "红色");
        Compare compare = new Compare();
        Person person = new Person();
        System.out.println("默认挑大的：");
        person.ApplepickApple(compare, apple1, apple2);
        Compare compare1 = new Compare() {
            @Override
            public Apple compare(Apple apple, Apple apple2) {

                return apple.getColor() == "红色" ? apple : apple2;
            }
        };
        System.out.println("挑红的：");
        person.ApplepickApple(compare1, apple1, apple2);


    }
}

class Apple {
    private double dage;
    private String color;

    public Apple(double dage, String color) {
        this.dage = dage;
        this.color = color;
    }

    public double getDage() {
        return dage;
    }

    public void setDage(double dage) {
        this.dage = dage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

interface CompareAble {
    public default Apple compare(Apple apple, Apple apple2) {
        return apple.getDage() > apple2.getDage() ? apple : apple2;
    }
}

class Compare implements CompareAble {

}

class Person {
    public void ApplepickApple(CompareAble com, Apple a1, Apple a2) {

        System.out.println(com.compare(a1, a2).getDage() + "-" + com.compare(a1, a2).getColor());


    }
}
