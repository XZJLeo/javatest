package com.day13;
import java.util.HashSet;
import java.util.Objects;
public class Test16 {
    public static void main(String[] args) {
        HashSet<Student2> hashSet1 = new HashSet<>();
        hashSet1.add(new Student2("陈奕迅", 50));
        hashSet1.add(new Student2("周杰伦", 35));
        hashSet1.add(new Student2("刘德华", 45));
        hashSet1.add(new Student2("周杰伦", 35));
        hashSet1.add(new Student2("王昭君", 55));
        HashSet<Student2> hashSet2 = new HashSet<>();
        hashSet2.add(new Student2("陈奕迅1", 50));
        hashSet2.add(new Student2("周杰伦1", 35));
        hashSet2.add(new Student2("刘德华1", 45));
        hashSet2.add(new Student2("周杰伦1", 35));
        hashSet2.add(new Student2("王昭君1", 55));
        HashSet<HashSet<Student2>> list = new HashSet<>();
        list.add(hashSet1);
        list.add(hashSet2);

        System.out.println("加强for：");
        for (HashSet<Student2> str : list) {
            for (Student2 s : str) {
                System.out.println(s);
            }
        }
        System.out.println("stream流：");
        list.stream().forEach(n -> {
            System.out.println(n);
        });
    }
}

class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age &&
                Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}