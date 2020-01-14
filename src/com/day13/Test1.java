package com.day13;

import java.util.HashSet;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        HashSet<Person> setlist = new HashSet<>();
        setlist.add(new Person("杨戬", 50));
        setlist.add(new Person("杨戬", 50));
        setlist.add(new Person("杨戬", 50));
        setlist.add(new Person("杨戬", 50));
        for (Person person : setlist) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}