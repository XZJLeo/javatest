package com.day8;

public class Test3 {
    public static void main(String[] args) {
C c=new C();
c.showA();
c.showB();
c.showC();
    }
}
abstract class A{
    int numa=10;
   abstract void showA();
}
abstract class B extends A{
    int numb=20;
    abstract void showB();
}
  class C extends B{
    int numc=30;
public void showA(){
    System.out.println("A类中nama："+numa);
}

@Override
public void showB(){
    System.out.println("B类中namb："+numb);
}
public void showC(){
          System.out.println("C类中namc："+numc);
      }

  }

