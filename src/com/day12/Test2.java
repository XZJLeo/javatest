package com.day12;

public class Test2 {
    public static void main(String[] args) {
Imple01 imple01=new Imple01();
imple01.show("笑傲江湖");
Imple02<Integer> imple02=new Imple02<>();
imple02.show(54);
    }
}
interface Inter<E>{
    public  void show(E e);
}
class Imple01 implements Inter<String>{
    @Override
    public  void show(String e) {
        System.out.println(e);
    }
}
class Imple02<E> implements Inter<E>{
    @Override
    public  void show(E e) {
        System.out.println(e);
    }
}