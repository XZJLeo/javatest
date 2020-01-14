package com.day14.day14_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Student1, String> hashMap = new HashMap<>();
        hashMap.put(new Student1("张三", 15), "广州");
        hashMap.put(new Student1("张四", 18), "惠州");
        hashMap.put(new Student1("陈可", 14), "梅州");
        hashMap.put(new Student1("张三", 15), "广州");
        hashMap.put(new Student1("张八", 15), "广州");

        Set<Student1> set = hashMap.keySet();
        System.out.println("**keySet遍历输出：");
        for (Student1 str : set) {
            System.out.println("学生住址：" + hashMap.get(str) + "  学生信息：" + str);
        }
        Set<Map.Entry<Student1, String>> entry = hashMap.entrySet();
        System.out.println("**Entry遍历输出：");

        for (Map.Entry<Student1, String> str : entry) {
            System.out.println("学生住址：" + str.getValue() + "  学生信息：" + str.getKey());
        }
    }
}

class Student1 {
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age &&
                Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}