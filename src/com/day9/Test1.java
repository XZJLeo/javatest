package com.day9;

public class Test1 {
    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();
    }
}

interface A {
    public abstract void showA();

    public default void showB() {
        System.out.println("BBBB");
    }
}

class B implements A {
    @Override
    public void showA() {
        System.out.println("AAAA");
    }
}