package com.day14.day14_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {

        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("广州", new Student("张三", 15));
        hashMap.put("惠州", new Student("张四", 18));
        hashMap.put("梅州", new Student("陈可", 17));
        hashMap.put("湖南", new Student("张七", 16));
        hashMap.put("北京", new Student("张八", 11));
        Set<String> set = hashMap.keySet();
        System.out.println("**keySet遍历输出：");
        for (String str : set) {
            System.out.println("学生住址：" + str + "  学生信息：" + hashMap.get(str));
        }
        Set<Map.Entry<String, Student>> entry = hashMap.entrySet();
        System.out.println("**Entry遍历输出：");

        for (Map.Entry<String, Student> str:entry){
            System.out.println("学生住址：" + str.getKey() + "  学生信息：" + str.getValue());
        }

    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}