package com.day15;

import java.util.concurrent.locks.ReentrantLock;

public class Test4 {
    public static void main(String[] args) {
        Person person = new Person("杯子", 1);
        MyTheard1 myTheard = new MyTheard1(person);
        Thread thread = new Thread(myTheard, "官网");
        Thread thread1 = new Thread(myTheard, "实体店");
        thread.start();
        thread1.start();
    }
}

class MyTheard1 implements Runnable {

    private Person person;

    public MyTheard1(Person person) {
        this.person = person;
    }

    ReentrantLock reentrantLock = new ReentrantLock();

    public void run() {
        while (true) {

            reentrantLock.lock();
            int num = person.getNum();

            if (num > 100) {
                System.out.println(Thread.currentThread().getName() + ": 没了");
                reentrantLock.unlock();
                break;
            }
            System.out.println(Thread.currentThread().getName() + " ," + person.getName() + "卖出" + num + "个" + ",剩余" + (100 - num) + "个");
            person.setNum(++num);
            reentrantLock.unlock();

        }

    }
}

class Person {
    private String name;
    private int num;

    public Person(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}