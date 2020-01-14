package com.day5;

public class Test3 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        t.setAge(30);
        t.setName("周老师");
        t.setContent("java面向对象的知识....");
        s.setAge(18);
        s.setName("韩同学");
        s.setContent("java面向对象的知识....");
        t.eat();
        t.teach();
        s.eat();
        s.study();
    }
}

class Teacher {
    private String name;
    private int age;
    private String content;
public Teacher(){

}
    public Teacher(String name,int age,String content){
    this.name=name;
    this.age=age;
    this.content=content;

    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat() {
        System.out.println("年龄为" + age + "的" + name + "正在吃饭....");
    }

    public void teach() {
        System.out.println("年龄为" + age + "的" + name + "正在亢奋的讲着" + content);
    }


}

class Student {
    private String name;
    private int age;
    private String content;



    public Student(){

    }
    public Student(String name,int age,String content){
        this.name=name;
        this.age=age;
        this.content=content;

    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat() {
        System.out.println("年龄为" + age + "的" + name + "正在吃饭....");
    }

    public void study() {
        System.out.println("年龄为" + age + "的" + name + "正在专心致志的听着" + content);
    }
}