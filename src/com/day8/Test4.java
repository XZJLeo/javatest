package com.day8;

public class Test4 {
    public static void main(String[] args) {
Teacher1 teacher=new Teacher1();
Student student=new Student();
teacher.setName("王小平");
teacher.setTean("Java");
teacher.say();
student.setName("李小乐");
student.setScore(90);
student.test();

    }
}

class Person1{
  private  String name ;
  private   int age;
    public Person1() {
    }

    public Person1(String name, int age) {
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
}

class Teacher1 extends Person1{
    private String tean;
    public Teacher1() {

    }
    public Teacher1(String tean) {
        this.tean = tean;
    }

    public Teacher1(String name, int age, String tean) {
        super(name, age);
        this.tean = tean;
    }

    public String getTean() {
        return tean;
    }

    public void setTean(String tean) {
        this.tean = tean;
    }

    public void say(){
        System.out.println(getName()+"老师,讲授"+tean+"课");
    }

}

class Student extends Person1{
    private double score;

    public Student(double score) {
        this.score = score;
    }
    public Student() {

    }
    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public  void test(){
        System.out.println(getName()+"同学，考试得了："+score+"分");
    }
}