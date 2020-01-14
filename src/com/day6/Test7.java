package com.day6;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        Worker w1 = new Worker("bz001", "黄渤", 45);
        Worker w2 = new Worker("bz002", "孙红雷", 48);
        Worker w3 = new Worker("bz003", "小猪", 35);
        ArrayList<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        findMaxAge(list);
    }

    public static void findMaxAge(ArrayList<Worker> workers) {
        Worker s = workers.get(0);
        for (int i = 1; i < workers.size(); i++) {
            if (s.getAge() < workers.get(i).getAge()) {
                s = workers.get(i);
            }
        }
        System.out.println("最高年龄worker对象：");
        s.show();
    }

}


class Worker {
    private String id;
    private String name;
    private int age;

    public Worker(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void show() {
        System.out.println(id + "," + name + "," + age);
    }

}
