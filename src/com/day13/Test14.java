package com.day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Test14 {
    public static void main(String[] args) {
        HashSet<Students> hashSet = new HashSet<>();
        hashSet.add(new Students("陈奕迅", 50, 90));
        hashSet.add(new Students("周杰伦", 35, 85));
        hashSet.add(new Students("刘德华", 45, 100));
        hashSet.add(new Students("周杰伦", 35, 85));
        hashSet.add(new Students("王昭君", 55, 80));
        double sum = 0;

        Iterator<Students> iterator = hashSet.iterator();
        double d = iterator.next().getScore();
        double max = d;
        double min = d;
        for(Students s:hashSet){
            sum+=s.getScore();
            if(max<s.getScore()){
                max=s.getScore();
            }
            if(min>s.getScore()){
                min=s.getScore();
            }
        }
        System.out.println("总分："+sum+" 平均分："+sum/hashSet.size());
        System.out.println("最高分："+max+" 最低分："+min);


    }
}

class Students {
    private String name;
    private int age;
    private double score;

    public Students(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age &&
                Double.compare(students.score, score) == 0 &&
                Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}