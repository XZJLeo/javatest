package com.day8;

public class Test5 {
    public static void main(String[] args) {
ch ch1=new ch();
duck d1=new duck();
ch1.age=2;ch1.color="红色";
d1.age=1;d1.color="黑色";
ch1.eat();
ch1.show();
d1.eat();
d1.show();
    }
}
abstract class Anilm{
    int age;
    String color;
    abstract void eat();
}
class ch extends Anilm{
    public void eat(){
        System.out.println(age+"岁的"+color+"的公鸡在啄米");
    }
    public void show(){
        System.out.println(age+"岁的"+color+"的公鸡在打鸣");
    }
}
class duck extends Anilm{
    public void eat(){
        System.out.println(age+"岁的"+color+"的鸭子在吃饭");
    }
    public void show(){
        System.out.println(age+"岁的"+color+"的鸭子在游泳");
    }
}